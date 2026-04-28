package com.coinbase.tools.sdkgenerator.phases;

import com.coinbase.tools.sdkgenerator.CopyrightHelper;
import com.coinbase.tools.sdkgenerator.processing.GeneratorConfiguration;
import com.coinbase.tools.sdkgenerator.processing.ServiceDefinition;
import com.coinbase.tools.sdkgenerator.processing.OpenApiSchemaCodegen;
import com.coinbase.tools.sdkgenerator.spec.ParsedOperation;
import com.coinbase.tools.sdkgenerator.spec.SdkOperationBinding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class ServicePhase {

    private static final Pattern PATH_PARAM = Pattern.compile("\\{([^}]+)}");

    private ServicePhase() {}

    public static String emitInterface(
            ServiceDefinition svc, List<SdkOpPair> operations) {
        StringBuilder s = new StringBuilder();
        s.append(CopyrightHelper.javaFileHeader());
        s.append("package ").append(svc.getJavaPackage()).append(";\n\n");
        s.append("import com.coinbase.core.errors.CoinbaseClientException;\n");
        s.append("import com.coinbase.prime.errors.CoinbasePrimeException;\n\n");
        s.append("public interface ").append(svc.getJavaInterfaceName()).append(" {\n");
        for (SdkOpPair pair : operations) {
            if (pair.op.getSummary() != null && !pair.op.getSummary().isEmpty()) {
                s.append("    /** ").append(escapeJavadoc(pair.op.getSummary())).append(" */\n");
            }
            if (pair.binding.isOmitRequest()) {
                s.append("    ")
                        .append(pair.binding.getSdkMethod())
                        .append("Response ")
                        .append(camelizeMethod(pair.binding.getSdkMethod()))
                        .append("()")
                        .append(" throws CoinbaseClientException, CoinbasePrimeException;\n");
            } else {
                s.append("    ")
                        .append(pair.binding.getSdkMethod())
                        .append("Response ")
                        .append(camelizeMethod(pair.binding.getSdkMethod()))
                        .append("(")
                        .append(pair.binding.getSdkMethod())
                        .append("Request request)")
                        .append(" throws CoinbaseClientException, CoinbasePrimeException;\n");
            }
        }
        s.append("}\n");
        return s.toString();
    }

    public static String emitServiceImpl(
            GeneratorConfiguration cfg, ServiceDefinition svc, List<SdkOpPair> operations) {
        StringBuilder s = new StringBuilder();
        s.append(CopyrightHelper.javaFileHeader());
        s.append("package ").append(svc.getJavaPackage()).append(";\n\n");
        s.append("import com.coinbase.core.common.HttpMethod;\n");
        s.append("import com.coinbase.core.service.CoinbaseServiceImpl;\n");
        s.append("import com.coinbase.prime.client.CoinbasePrimeClient;\n");
        s.append("import com.coinbase.prime.errors.CoinbasePrimeException;\n");
        s.append("import com.fasterxml.jackson.core.type.TypeReference;\n\n");
        s.append("import java.util.List;\n\n");
        s.append("public class ")
                .append(svc.getJavaServiceImplName())
                .append(" extends CoinbaseServiceImpl implements ")
                .append(svc.getJavaInterfaceName())
                .append(" {\n");
        s.append("    public ")
                .append(svc.getJavaServiceImplName())
                .append("(CoinbasePrimeClient client) {\n");
        s.append("        super(client);\n    }\n\n");

        for (SdkOpPair pair : operations) {
            String m = pair.binding.getSdkMethod();
            s.append("    @Override\n");
            s.append("    public ")
                    .append(m)
                    .append("Response ")
                    .append(camelizeMethod(m))
                    .append("(");
            if (!pair.binding.isOmitRequest()) {
                s.append(m).append("Request request");
            }
            s.append(") throws CoinbasePrimeException {\n");
            s.append("        return this.request(\n");
            s.append("                HttpMethod.").append(httpMethodConst(pair.op.getHttpMethod())).append(",\n");
            s.append("                ")
                    .append(pathExpression(cfg, pair.binding, pair.op))
                    .append(",\n");
            s.append("                ")
                    .append(requestBodyArg(pair.binding, pair.op))
                    .append(",\n");
            s.append("                List.of(")
                    .append(
                            javaStatusList(cfg, pair.binding.getSdkMethod(), pair.op).stream()
                                    .map(String::valueOf)
                                    .collect(Collectors.joining(", ")))
                    .append("),\n");
            s.append("                new TypeReference<")
                    .append(m)
                    .append("Response>() {});\n");
            s.append("    }\n\n");
        }
        s.append("}\n");
        return s.toString();
    }

    public static String requestBodyArg(SdkOperationBinding b, ParsedOperation op) {
        if (b.isOmitRequest()) {
            return "null";
        }
        return "request";
    }

    public static String pathExpression(
            GeneratorConfiguration cfg, SdkOperationBinding b, ParsedOperation op) {
        if (b.isOmitRequest()) {
            if (PATH_PARAM.matcher(op.getPath()).find()) {
                throw new IllegalStateException(
                        "omitRequest operations cannot include path template parameters.");
            }
            return stringLiteral(trimApiPrefix(op.getPath()));
        }
        String p = trimApiPrefix(op.getPath());
        List<String> paramNames = new ArrayList<>();
        Matcher m = PATH_PARAM.matcher(p);
        while (m.find()) {
            paramNames.add(m.group(1));
        }
        if (paramNames.isEmpty()) {
            return stringLiteral(p);
        }
        String formatStr = p.replaceAll("\\{[^}]+}", "%s");
        StringBuilder sb = new StringBuilder("String.format(\"" + escapeForJavaString(formatStr) + "\"");
        for (String raw : paramNames) {
            String prop = OpenApiSchemaCodegen.toPascalCase(raw);
            sb.append(", request.get").append(prop).append("()");
        }
        sb.append(")");
        return sb.toString();
    }

    private static String stringLiteral(String path) {
        return "\"" + escapeForJavaString(path) + "\"";
    }

    private static String escapeForJavaString(String s) {
        return s.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    private static String trimApiPrefix(String openApiPath) {
        if (openApiPath.startsWith("/v1/")) {
            return openApiPath.substring(3);
        }
        return openApiPath;
    }

    private static String httpMethodConst(String method) {
        switch (method.toUpperCase()) {
            case "GET":
                return "GET";
            case "POST":
                return "POST";
            case "PUT":
                return "PUT";
            case "PATCH":
                return "PATCH";
            case "DELETE":
                return "DELETE";
            default:
                return "GET";
        }
    }

    public static List<Integer> javaStatusList(
            GeneratorConfiguration cfg, String sdkMethod, ParsedOperation op) {
        List<Integer> codes;
        if (cfg.getStatusCodeOverrides().containsKey(sdkMethod)
                && cfg.getStatusCodeOverrides().get(sdkMethod) != null
                && !cfg.getStatusCodeOverrides().get(sdkMethod).isEmpty()) {
            codes =
                    cfg.getStatusCodeOverrides().get(sdkMethod).stream()
                            .map(ServicePhase::mapStatusToken)
                            .collect(Collectors.toCollection(ArrayList::new));
        } else if (op.getSuccessStatusCodes().isEmpty()) {
            codes = new ArrayList<>();
            codes.add(200);
        } else {
            codes = new ArrayList<>(op.getSuccessStatusCodes());
        }
        codes.sort((a, b) -> compareSuccessStatus(a, b));
        return codes;
    }

    private static int mapStatusToken(String token) {
        if (token == null) {
            return 200;
        }
        switch (token.toUpperCase()) {
            case "OK":
                return 200;
            case "CREATED":
                return 201;
            case "ACCEPTED":
                return 202;
            case "NO_CONTENT":
                return 204;
            default:
                try {
                    return Integer.parseInt(token);
                } catch (NumberFormatException e) {
                    return 200;
                }
        }
    }

    private static int compareSuccessStatus(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a == 201 && b == 200) {
            return -1;
        }
        if (a == 200 && b == 201) {
            return 1;
        }
        return Integer.compare(a, b);
    }

    private static String escapeJavadoc(String s) {
        return s == null ? "" : s.replace("*/", "* /");
    }

    private static String camelizeMethod(String pascal) {
        if (pascal == null || pascal.isEmpty()) {
            return pascal;
        }
        return pascal.substring(0, 1).toLowerCase() + pascal.substring(1);
    }

    public static final class SdkOpPair {
        public final SdkOperationBinding binding;
        public final ParsedOperation op;

        public SdkOpPair(SdkOperationBinding binding, ParsedOperation op) {
            this.binding = binding;
            this.op = op;
        }
    }
}
