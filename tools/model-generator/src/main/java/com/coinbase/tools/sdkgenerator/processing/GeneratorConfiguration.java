package com.coinbase.tools.sdkgenerator.processing;

import com.coinbase.tools.sdkgenerator.GeneratorPaths;
import com.coinbase.tools.sdkgenerator.spec.ParsedOpenApiDocument;
import com.coinbase.tools.sdkgenerator.spec.SdkOperationBinding;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneratorConfiguration {
    @JsonProperty("specUrl")
    private String specUrl = "https://api.prime.coinbase.com/v1/openapi.yaml";

    @JsonProperty("filePathReplacements")
    private Map<String, String> filePathReplacements = new LinkedHashMap<>();

    @JsonProperty("contentReplacements")
    private Map<String, String> contentReplacements = new LinkedHashMap<>();

    @JsonProperty("acronymMappings")
    private List<AcronymMappingEntry> acronymMappings = new ArrayList<>();

    @JsonProperty("enumNameMappings")
    private Map<String, String> enumNameMappings = new LinkedHashMap<>();

    @JsonProperty("tagToFolderOverrides")
    private Map<String, String> tagToFolderOverrides = new LinkedHashMap<>();

    @JsonIgnore
    private Map<String, String> tagToFolder = new LinkedHashMap<>();

    @JsonIgnore
    private Map<String, ServiceDefinition> services = new LinkedHashMap<>();

    @JsonProperty("serviceMethodOrderOverrides")
    private Map<String, List<String>> serviceMethodOrderOverrides = new LinkedHashMap<>();

    @JsonProperty("statusCodeOverrides")
    private Map<String, List<String>> statusCodeOverrides = new LinkedHashMap<>();

    public String getSpecUrl() {
        return specUrl;
    }

    public Map<String, String> getFilePathReplacements() {
        return filePathReplacements;
    }

    public Map<String, String> getContentReplacements() {
        return contentReplacements;
    }

    public List<AcronymMappingEntry> getAcronymMappings() {
        return acronymMappings;
    }

    public Map<String, String> getEnumNameMappings() {
        return enumNameMappings;
    }

    public Map<String, String> getTagToFolderOverrides() {
        return tagToFolderOverrides;
    }

    public Map<String, String> getTagToFolder() {
        return tagToFolder;
    }

    public void setTagToFolder(Map<String, String> tagToFolder) {
        this.tagToFolder = tagToFolder;
    }

    public Map<String, ServiceDefinition> getServices() {
        return services;
    }

    public void setServices(Map<String, ServiceDefinition> services) {
        this.services = services;
    }

    public Map<String, List<String>> getServiceMethodOrderOverrides() {
        return serviceMethodOrderOverrides;
    }

    public Map<String, List<String>> getStatusCodeOverrides() {
        return statusCodeOverrides;
    }

    public static GeneratorConfiguration load(Path projectRoot) throws IOException {
        Path path = GeneratorPaths.configDirectory(projectRoot).resolve("generator-config.json");
        ObjectMapper om =
                new ObjectMapper()
                        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return om.readValue(path.toFile(), GeneratorConfiguration.class);
    }

    public static List<SdkOperationBindingPatch> loadOperationBindingOverrides(Path projectRoot)
            throws IOException {
        Path path = GeneratorPaths.configDirectory(projectRoot).resolve("operations-overrides.json");
        if (!path.toFile().exists()) {
            return new ArrayList<>();
        }
        ObjectMapper om = new ObjectMapper();
        return om.readValue(
                path.toFile(),
                new TypeReference<List<SdkOperationBindingPatch>>() {});
    }

    public static OperationBindingMergeResult mergeOperationBindings(
            ParsedOpenApiDocument document, GeneratorConfiguration cfg, Path projectRoot)
            throws IOException {
        List<SdkOperationBinding> derived = OperationBindingGenerator.deriveAll(document, cfg);
        List<SdkOperationBindingPatch> patches = loadOperationBindingOverrides(projectRoot);
        Map<String, SdkOperationBinding> mergedById = new LinkedHashMap<>();
        for (SdkOperationBinding b : derived) {
            mergedById.put(b.getOperationId(), cloneBinding(b));
        }
        for (SdkOperationBindingPatch patch : patches) {
            SdkOperationBinding binding = mergedById.get(patch.getOperationId());
            if (binding == null) {
                throw new IllegalStateException(
                        "operations-overrides.json references operationId '"
                                + patch.getOperationId()
                                + "' that is not in the OpenAPI spec.");
            }
            applyOperationBindingPatch(binding, patch);
        }
        List<SdkOperationBinding> merged =
                mergedById.values().stream()
                        .sorted(
                                (a, b) ->
                                        a.getOperationId()
                                                .compareTo(b.getOperationId()))
                        .collect(Collectors.toList());
        return new OperationBindingMergeResult(derived, merged, patches);
    }

    private static SdkOperationBinding cloneBinding(SdkOperationBinding b) {
        SdkOperationBinding c = new SdkOperationBinding();
        c.setOperationId(b.getOperationId());
        c.setSdkMethod(b.getSdkMethod());
        c.setService(b.getService());
        c.setOmitRequest(b.isOmitRequest());
        c.setForcePaginated(b.isForcePaginated());
        c.setParamTypeOverrides(new HashMap<>(b.getParamTypeOverrides()));
        return c;
    }

    private static void applyOperationBindingPatch(
            SdkOperationBinding binding, SdkOperationBindingPatch patch) {
        if (patch.getSdkMethod() != null) {
            binding.setSdkMethod(patch.getSdkMethod());
        }
        if (patch.getService() != null) {
            binding.setService(patch.getService());
        }
        if (patch.getOmitRequest() != null) {
            binding.setOmitRequest(patch.getOmitRequest());
        }
        if (patch.getForcePaginated() != null) {
            binding.setForcePaginated(patch.getForcePaginated());
        }
        if (patch.getParamTypeOverrides() != null) {
            for (Map.Entry<String, String> e : patch.getParamTypeOverrides().entrySet()) {
                binding.getParamTypeOverrides().put(e.getKey(), e.getValue());
            }
        }
    }

    public static final class AcronymMappingEntry {
        @JsonProperty("acronym")
        private String acronym = "";

        @JsonProperty("normalized")
        private String normalized = "";

        public String getAcronym() {
            return acronym;
        }

        public String getNormalized() {
            return normalized;
        }
    }

    public static class SdkOperationBindingPatch {
        @JsonProperty("operationId")
        private String operationId = "";

        @JsonProperty("sdkMethod")
        private String sdkMethod;

        @JsonProperty("service")
        private String service;

        @JsonProperty("omitRequest")
        private Boolean omitRequest;

        @JsonProperty("forcePaginated")
        private Boolean forcePaginated;

        @JsonProperty("paramTypeOverrides")
        private Map<String, String> paramTypeOverrides;

        public String getOperationId() {
            return operationId;
        }

        public String getSdkMethod() {
            return sdkMethod;
        }

        public String getService() {
            return service;
        }

        public Boolean getOmitRequest() {
            return omitRequest;
        }

        public Boolean getForcePaginated() {
            return forcePaginated;
        }

        public Map<String, String> getParamTypeOverrides() {
            return paramTypeOverrides;
        }
    }

    public static final class OperationBindingMergeResult {
        private final List<SdkOperationBinding> derived;
        private final List<SdkOperationBinding> merged;
        private final List<SdkOperationBindingPatch> patches;

        public OperationBindingMergeResult(
                List<SdkOperationBinding> derived,
                List<SdkOperationBinding> merged,
                List<SdkOperationBindingPatch> patches) {
            this.derived = derived;
            this.merged = merged;
            this.patches = patches;
        }

        public List<SdkOperationBinding> getDerived() {
            return derived;
        }

        public List<SdkOperationBinding> getMerged() {
            return merged;
        }

        public List<SdkOperationBindingPatch> getPatches() {
            return patches;
        }
    }

}
