package com.coinbase.tools.sdkgenerator.processing;

import java.util.Comparator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class SharedTransforms {
    private final GeneratorConfiguration cfg;

    public SharedTransforms(GeneratorConfiguration cfg) {
        this.cfg = cfg;
    }

    public String applyContentReplacements(String content) {
        String result = content;
        for (Map.Entry<String, String> e :
                cfg.getContentReplacements().entrySet().stream()
                        .sorted(Comparator.comparingInt((Map.Entry<String, String> p) -> -p.getKey().length()))
                        .collect(Collectors.toList())) {
            result = result.replace(e.getKey(), e.getValue());
        }
        return normalizeAcronymsInContent(result);
    }

    public String stripCommonPrefixes(String className) {
        String result = className;
        for (Map.Entry<String, String> e :
                cfg.getFilePathReplacements().entrySet().stream()
                        .sorted(Comparator.comparingInt((Map.Entry<String, String> p) -> -p.getKey().length()))
                        .collect(Collectors.toList())) {
            if (result.contains(e.getKey())) {
                result = result.replace(e.getKey(), e.getValue());
            }
        }
        return normalizeAcronyms(result);
    }

    public String transformSchemaRefToJavaName(String refName) {
        if (refName == null) {
            return "";
        }
        String[] dotSegments = refName.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (String dotSeg : dotSegments) {
            if (dotSeg == null || dotSeg.isEmpty()) {
                continue;
            }
            String[] underscoreParts = dotSeg.split("_");
            for (String part : underscoreParts) {
                if (part == null || part.isEmpty()) {
                    continue;
                }
                sb.append(Character.toUpperCase(part.charAt(0)));
                if (part.length() > 1) {
                    sb.append(part, 1, part.length());
                }
            }
        }
        String name = sb.toString();
        name = stripCommonPrefixes(name);
        name = applyContentReplacements(name);
        name = name.replace(".", "");
        return applyWeb3ToOnchainName(name);
    }

    public String applyWeb3ToOnchainName(String name) {
        return name == null ? "" : name.replace("Web3", "Onchain");
    }

    public String normalizeAcronyms(String value) {
        String result = value;
        for (GeneratorConfiguration.AcronymMappingEntry pair : cfg.getAcronymMappings()) {
            String acronym = pair.getAcronym();
            String normalized = pair.getNormalized();
            Pattern p = Pattern.compile("\\b" + Pattern.quote(acronym) + "(?=[A-Z])");
            result = p.matcher(result).replaceAll(Matcher.quoteReplacement(normalized));
            if (result.endsWith(acronym)) {
                result = result.substring(0, result.length() - acronym.length()) + normalized;
            }
        }
        return result;
    }

    public String normalizeAcronymsInContent(String content) {
        String result = content;
        for (GeneratorConfiguration.AcronymMappingEntry pair : cfg.getAcronymMappings()) {
            String acronym = pair.getAcronym();
            String normalized = pair.getNormalized();
            result = Pattern.compile("\\b" + Pattern.quote(acronym) + "(?=[A-Z](?!_))").matcher(result).replaceAll(Matcher.quoteReplacement(normalized));
            result = Pattern.compile("\\b" + Pattern.quote(acronym) + "(?=\\s+[a-z])").matcher(result).replaceAll(Matcher.quoteReplacement(normalized));
            result = Pattern.compile("\\b" + Pattern.quote(acronym) + "(?=[<>;])").matcher(result).replaceAll(Matcher.quoteReplacement(normalized));
            result = Pattern.compile("\\b" + Pattern.quote(acronym) + "(?=\\.)").matcher(result).replaceAll(Matcher.quoteReplacement(normalized));
        }
        return result;
    }
}
