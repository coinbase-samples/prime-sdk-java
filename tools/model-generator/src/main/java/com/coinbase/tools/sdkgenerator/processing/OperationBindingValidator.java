package com.coinbase.tools.sdkgenerator.processing;

import com.coinbase.tools.sdkgenerator.spec.ParsedOpenApiDocument;
import com.coinbase.tools.sdkgenerator.spec.SdkOperationBinding;
import org.slf4j.Logger;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public final class OperationBindingValidator {

    private OperationBindingValidator() {}

    public static void validateOperationBindings(
            Logger logger,
            ParsedOpenApiDocument document,
            GeneratorConfiguration.OperationBindingMergeResult merge) {
        List<SdkOperationBinding> merged = merge.getMerged();
        List<String> missing =
                merged.stream()
                        .filter(b -> !document.getOperationsById().containsKey(b.getOperationId()))
                        .map(SdkOperationBinding::getOperationId)
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());
        if (!missing.isEmpty()) {
            throw new IllegalStateException(
                    "Merged operation bindings reference operationId values that are not in the OpenAPI spec: "
                            + String.join(", ", missing));
        }
        Map<String, SdkOperationBinding> derivedById =
                merge.getDerived().stream()
                        .collect(Collectors.toMap(SdkOperationBinding::getOperationId, b -> b));

        for (GeneratorConfiguration.SdkOperationBindingPatch patch : merge.getPatches()) {
            if (!document.getOperationsById().containsKey(patch.getOperationId())) {
                throw new IllegalStateException(
                        "operations-overrides.json references operationId '"
                                + patch.getOperationId()
                                + "' that is not in the OpenAPI spec.");
            }
            SdkOperationBinding derived = derivedById.get(patch.getOperationId());
            if (derived == null) {
                continue;
            }
            if (patchMatchesDerived(patch, derived)) {
                logger.warn(
                        "operations-overrides.json entry for operationId {} matches derived defaults and can be removed.",
                        patch.getOperationId());
            }
        }
    }

    private static boolean patchMatchesDerived(
            GeneratorConfiguration.SdkOperationBindingPatch patch, SdkOperationBinding derived) {
        boolean any = false;
        if (patch.getSdkMethod() != null) {
            any = true;
            if (!Objects.equals(patch.getSdkMethod(), derived.getSdkMethod())) {
                return false;
            }
        }
        if (patch.getService() != null) {
            any = true;
            if (!Objects.equals(patch.getService(), derived.getService())) {
                return false;
            }
        }
        if (patch.getOmitRequest() != null) {
            any = true;
            if (patch.getOmitRequest() != derived.isOmitRequest()) {
                return false;
            }
        }
        if (patch.getForcePaginated() != null) {
            any = true;
            if (patch.getForcePaginated() != derived.isForcePaginated()) {
                return false;
            }
        }
        if (patch.getParamTypeOverrides() != null && !patch.getParamTypeOverrides().isEmpty()) {
            any = true;
            for (Map.Entry<String, String> kv : patch.getParamTypeOverrides().entrySet()) {
                if (!derived.getParamTypeOverrides().containsKey(kv.getKey())
                        || !Objects.equals(
                                kv.getValue(), derived.getParamTypeOverrides().get(kv.getKey()))) {
                    return false;
                }
            }
        }
        return any;
    }
}
