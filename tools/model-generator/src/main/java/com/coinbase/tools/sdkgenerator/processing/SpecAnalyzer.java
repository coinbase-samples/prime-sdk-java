package com.coinbase.tools.sdkgenerator.processing;

import com.coinbase.tools.sdkgenerator.spec.ParsedOpenApiDocument;
import com.coinbase.tools.sdkgenerator.spec.ParsedOperation;
import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public final class SpecAnalyzer {

    private static final int MIN_PREFIX_LENGTH = 6;
    private static final int MIN_PREFIX_SCHEMA_COUNT = 3;

    private SpecAnalyzer() {}

    public static void apply(ParsedOpenApiDocument doc, GeneratorConfiguration cfg, Logger logger) {
        discoverAndMergeFilePathPrefixes(doc, cfg, logger);
        deriveTagToFolderAndServices(doc, cfg, logger);
    }

    public static String defaultFolderFromTag(String tag) {
        String[] parts = tag.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            if (p != null && !p.isEmpty()) {
                sb.append(p.toLowerCase());
            }
        }
        return sb.toString();
    }

    private static void deriveTagToFolderAndServices(
            ParsedOpenApiDocument doc, GeneratorConfiguration cfg, Logger logger) {
        Set<String> usedTags = new TreeSet<>();
        for (ParsedOperation op : doc.getOperationsById().values()) {
            usedTags.addAll(op.getTags());
        }
        Map<String, String> tagToFolder = new LinkedHashMap<>();
        for (String tag : usedTags) {
            if (cfg.getTagToFolderOverrides().containsKey(tag)
                    && cfg.getTagToFolderOverrides().get(tag) != null
                    && !cfg.getTagToFolderOverrides().get(tag).trim().isEmpty()) {
                tagToFolder.put(tag, cfg.getTagToFolderOverrides().get(tag).trim());
            } else {
                tagToFolder.put(tag, defaultFolderFromTag(tag));
            }
        }
        cfg.setTagToFolder(tagToFolder);

        Map<String, ServiceDefinition> services = new LinkedHashMap<>();
        List<ParsedOperation> sorted =
                doc.getOperationsById().values().stream()
                        .sorted(Comparator.comparing(ParsedOperation::getOperationId))
                        .collect(Collectors.toList());
        for (ParsedOperation op : sorted) {
            for (String tag : op.getTags()) {
                if (!tagToFolder.containsKey(tag)) {
                    continue;
                }
                String folder = tagToFolder.get(tag);
                if (services.containsKey(folder)) {
                    continue;
                }
                String canonicalTag = findCanonicalTagForFolder(usedTags, tagToFolder, folder);
                services.put(folder, buildServiceDefinition(canonicalTag, folder));
            }
        }
        cfg.setServices(services);
        logger.info(
                "Derived {} tag folder mappings and {} services from the OpenAPI spec.",
                tagToFolder.size(),
                services.size());
    }

    private static String findCanonicalTagForFolder(
            Set<String> usedTags, Map<String, String> tagToFolder, String folder) {
        for (String tag : usedTags) {
            if (!tagToFolder.containsKey(tag) || !folder.equals(tagToFolder.get(tag))) {
                continue;
            }
            if (defaultFolderFromTag(tag).equals(folder)) {
                return tag;
            }
        }
        return usedTags.stream()
                .filter(t -> folder.equals(tagToFolder.get(t)))
                .min(Comparator.naturalOrder())
                .orElseThrow();
    }

    private static ServiceDefinition buildServiceDefinition(String tag, String folder) {
        String pascal = namespaceFromTag(tag);
        return new ServiceDefinition(folder, pascal);
    }

    private static String namespaceFromTag(String tag) {
        String[] parts = tag.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            if (p == null || p.isEmpty()) {
                continue;
            }
            sb.append(Character.toUpperCase(p.charAt(0)));
            if (p.length() > 1) {
                sb.append(p.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }

    private static void discoverAndMergeFilePathPrefixes(
            ParsedOpenApiDocument doc, GeneratorConfiguration cfg, Logger logger) {
        JsonNode root = doc.getRoot();
        if (!root.has("components") || !root.get("components").isObject()) {
            return;
        }
        JsonNode schemas = root.get("components").path("schemas");
        if (!schemas.isObject()) {
            return;
        }
        Set<String> names = new HashSet<>();
        schemas.fieldNames().forEachRemaining(names::add);
        Map<String, Integer> prefixHits = new HashMap<>();
        for (String name : names) {
            for (String prefix : enumeratePascalPrefixes(name)) {
                if (prefix.length() < MIN_PREFIX_LENGTH) {
                    continue;
                }
                prefixHits.merge(prefix, 1, Integer::sum);
            }
        }
        List<String> candidates =
                prefixHits.entrySet().stream()
                        .filter(e -> e.getValue() >= MIN_PREFIX_SCHEMA_COUNT)
                        .map(Map.Entry::getKey)
                        .sorted(Comparator.comparingInt(String::length).reversed())
                        .collect(Collectors.toList());
        List<String> addedKeys = new ArrayList<>();
        int added = 0;
        for (String prefix : candidates) {
            if (cfg.getFilePathReplacements().containsKey(prefix)) {
                continue;
            }
            if (names.contains(prefix)) {
                continue;
            }
            if (addedKeys.stream().anyMatch(a -> a.startsWith(prefix))) {
                continue;
            }
            cfg.getFilePathReplacements().put(prefix, "");
            addedKeys.add(prefix);
            added++;
        }
        if (added > 0) {
            logger.info("Merged {} auto-detected schema prefixes into filePathReplacements.", added);
        }
    }

    private static List<String> enumeratePascalPrefixes(String name) {
        List<String> list = new ArrayList<>();
        if (name == null || name.isEmpty()) {
            return list;
        }
        for (int i = 1; i < name.length(); i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                list.add(name.substring(0, i));
            }
        }
        list.add(name);
        return list;
    }
}
