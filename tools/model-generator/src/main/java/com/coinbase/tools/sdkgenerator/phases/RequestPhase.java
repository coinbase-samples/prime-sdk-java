package com.coinbase.tools.sdkgenerator.phases;

import com.coinbase.tools.sdkgenerator.CopyrightHelper;
import com.coinbase.tools.sdkgenerator.processing.GeneratorConfiguration;
import com.coinbase.tools.sdkgenerator.processing.NamingResolver;
import com.coinbase.tools.sdkgenerator.processing.OpenApiSchemaCodegen;
import com.coinbase.tools.sdkgenerator.processing.OpenApiSchemaCodegen.JavaTypeResult;
import com.coinbase.tools.sdkgenerator.processing.SchemaProperty;
import com.coinbase.tools.sdkgenerator.processing.ServiceDefinition;
import com.coinbase.tools.sdkgenerator.processing.SharedTransforms;
import com.coinbase.tools.sdkgenerator.spec.ParsedOpenApiDocument;
import com.coinbase.tools.sdkgenerator.spec.ParsedOperation;
import com.coinbase.tools.sdkgenerator.spec.ParsedParameter;
import com.coinbase.tools.sdkgenerator.spec.SdkOperationBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Emits per-operation *Request.java (builder style matching hand-written Prime SDK).
 */
public final class RequestPhase {

    private RequestPhase() {}

    public static String emitRequest(
            ParsedOpenApiDocument doc,
            GeneratorConfiguration cfg,
            SharedTransforms transforms,
            SdkOperationBinding b,
            ParsedOperation op) {
        ServiceDefinition svc = NamingResolver.requireService(cfg, b.getService());
        String pkg = svc.getJavaPackage();
        String sdk = b.getSdkMethod();
        String className = sdk + "Request";

        List<ParsedParameter> pathParams =
                op.getParameters().stream()
                        .filter(p -> "path".equals(p.getIn()))
                        .collect(Collectors.toList());
        List<ParsedParameter> queryParams =
                op.getParameters().stream()
                        .filter(p -> "query".equals(p.getIn()))
                        .collect(Collectors.toList());
        List<SchemaProperty> bodyProps =
                op.getRequestBodyJsonSchema() != null
                        ? OpenApiSchemaCodegen.listProperties(
                                doc.getRoot(), op.getRequestBodyJsonSchema(), transforms)
                        : new ArrayList<>();

        boolean paginated =
                b.isForcePaginated()
                        || queryParams.stream()
                                .anyMatch(
                                        p ->
                                                "cursor".equals(p.getName())
                                                        || "sort_direction".equals(p.getName()));

        List<ParsedParameter> queryParamsForMembers =
                paginated
                        ? queryParams.stream()
                                .filter(
                                        p ->
                                                !"cursor".equals(p.getName())
                                                        && !"limit".equals(p.getName())
                                                        && !"sort_direction"
                                                                .equals(p.getName()))
                                .collect(Collectors.toList())
                        : queryParams;

        TreeSet<String> modelImports = new TreeSet<>();
        TreeSet<String> enumImports = new TreeSet<>();
        for (SchemaProperty p : bodyProps) {
            modelImports.addAll(p.getReferencedModelTypeNames());
            enumImports.addAll(p.getReferencedEnumTypeNames());
        }
        for (ParsedParameter p : pathParams) {
            JavaTypeResult tr =
                    OpenApiSchemaCodegen.toJavaType(doc.getRoot(), p.getSchema(), transforms);
            modelImports.addAll(tr.getModelTypeNames());
            enumImports.addAll(tr.getEnumTypeNames());
        }
        for (ParsedParameter p : queryParamsForMembers) {
            JavaTypeResult tr =
                    OpenApiSchemaCodegen.toJavaType(doc.getRoot(), p.getSchema(), transforms);
            modelImports.addAll(tr.getModelTypeNames());
            enumImports.addAll(tr.getEnumTypeNames());
        }
        if (paginated) {
            enumImports.add("SortDirection");
        }

        StringBuilder i = new StringBuilder();
        i.append(CopyrightHelper.javaFileHeader());
        i.append("package ").append(pkg).append(";\n\n");
        i.append("import com.coinbase.core.errors.CoinbaseClientException;\n");
        if (paginated) {
            i.append("import com.coinbase.prime.common.PrimeListRequest;\n");
            i.append("import com.coinbase.prime.common.Pagination;\n");
        }
        for (String m : modelImports) {
            i.append("import com.coinbase.prime.model.").append(m).append(";\n");
        }
        for (String e : enumImports) {
            i.append("import com.coinbase.prime.model.enums.").append(e).append(";\n");
        }
        i.append("import com.fasterxml.jackson.annotation.JsonIgnore;\n");
        i.append("import com.fasterxml.jackson.annotation.JsonProperty;\n");
        i.append("\nimport static com.coinbase.core.utils.Utils.isNullOrEmpty;\n\n");

        if (op.getSummary() != null && !op.getSummary().isEmpty()) {
            i.append("/**\n * ").append(escapeJavadoc(op.getSummary())).append("\n */\n");
        }

        if (paginated) {
            i.append("public class ").append(className).append(" extends PrimeListRequest {\n");
        } else {
            i.append("public class ").append(className).append(" {\n");
        }

        for (ParsedParameter p : pathParams) {
            String jt = mapPathParamJava(doc, transforms, b, p);
            String prop = OpenApiSchemaCodegen.toPascalCase(p.getName());
            i.append("    @JsonProperty");
            if (p.isRequired()) {
                i.append("(required = true, value = \"").append(p.getName()).append("\")");
            } else {
                i.append("(\"").append(p.getName()).append("\")");
            }
            i.append("\n");
            i.append("    @JsonIgnore\n");
            i.append("    private ").append(jt).append(" ").append(camelize(prop)).append(";\n\n");
        }
        for (ParsedParameter p : queryParamsForMembers) {
            String jt = mapQueryParamJava(doc, transforms, b, p);
            i.append("    @JsonProperty(\"").append(p.getName()).append("\")\n");
            i.append("    private ")
                    .append(jt)
                    .append(" ")
                    .append(camelize(OpenApiSchemaCodegen.toPascalCase(p.getName())))
                    .append(";\n\n");
        }
        for (SchemaProperty p : bodyProps) {
            i.append("    @JsonProperty(\"").append(p.getJsonName()).append("\")\n");
            i.append("    private ")
                    .append(p.getJavaType())
                    .append(" ")
                    .append(camelize(p.getJavaName()))
                    .append(";\n\n");
        }

        i.append("    public ").append(className).append("() {\n    }\n\n");

        if (paginated) {
            i.append("    public ").append(className).append("(Builder builder) {\n");
            i.append("        super(builder.cursor, builder.sortDirection, builder.limit);\n");
            for (ParsedParameter p : pathParams) {
                String c = camelize(OpenApiSchemaCodegen.toPascalCase(p.getName()));
                i.append("        this.").append(c).append(" = builder.").append(c).append(";\n");
            }
            for (ParsedParameter p : queryParamsForMembers) {
                String c = camelize(OpenApiSchemaCodegen.toPascalCase(p.getName()));
                i.append("        this.").append(c).append(" = builder.").append(c).append(";\n");
            }
            for (SchemaProperty p : bodyProps) {
                String c = camelize(p.getJavaName());
                i.append("        this.").append(c).append(" = builder.").append(c).append(";\n");
            }
            i.append("    }\n\n");
        } else {
            i.append("    public ").append(className).append("(Builder builder) {\n");
            for (ParsedParameter p : pathParams) {
                String c = camelize(OpenApiSchemaCodegen.toPascalCase(p.getName()));
                i.append("        this.").append(c).append(" = builder.").append(c).append(";\n");
            }
            for (ParsedParameter p : queryParamsForMembers) {
                String c = camelize(OpenApiSchemaCodegen.toPascalCase(p.getName()));
                i.append("        this.").append(c).append(" = builder.").append(c).append(";\n");
            }
            for (SchemaProperty p : bodyProps) {
                String c = camelize(p.getJavaName());
                i.append("        this.").append(c).append(" = builder.").append(c).append(";\n");
            }
            i.append("    }\n\n");
        }

        for (ParsedParameter p : pathParams) {
            appendAccessorPair(
                    i,
                    mapPathParamJava(doc, transforms, b, p),
                    OpenApiSchemaCodegen.toPascalCase(p.getName()),
                    camelize(OpenApiSchemaCodegen.toPascalCase(p.getName())));
        }
        for (ParsedParameter p : queryParamsForMembers) {
            appendAccessorPair(
                    i,
                    mapQueryParamJava(doc, transforms, b, p),
                    OpenApiSchemaCodegen.toPascalCase(p.getName()),
                    camelize(OpenApiSchemaCodegen.toPascalCase(p.getName())));
        }
        for (SchemaProperty p : bodyProps) {
            appendAccessorPair(
                    i, p.getJavaType(), p.getJavaName(), camelize(p.getJavaName()));
        }

        i.append("    public static class Builder {\n");
        for (ParsedParameter p : pathParams) {
            String c = camelize(OpenApiSchemaCodegen.toPascalCase(p.getName()));
            String jt = mapPathParamJava(doc, transforms, b, p);
            i.append("        private ").append(jt).append(" ").append(c).append(";\n");
        }
        for (ParsedParameter p : queryParamsForMembers) {
            String c = camelize(OpenApiSchemaCodegen.toPascalCase(p.getName()));
            String jt = mapQueryParamJava(doc, transforms, b, p);
            i.append("        private ").append(jt).append(" ").append(c).append(";\n");
        }
        for (SchemaProperty p : bodyProps) {
            String c = camelize(p.getJavaName());
            i.append("        private ").append(p.getJavaType()).append(" ").append(c).append(";\n");
        }
        if (paginated) {
            i.append("        private String cursor;\n");
            i.append("        private SortDirection sortDirection;\n");
            i.append("        private Integer limit;\n");
        }

        i.append("\n        public Builder() {\n        }\n\n");

        for (ParsedParameter p : pathParams) {
            String c = camelize(OpenApiSchemaCodegen.toPascalCase(p.getName()));
            String g = OpenApiSchemaCodegen.toPascalCase(p.getName());
            String jt = mapPathParamJava(doc, transforms, b, p);
            i.append("        public Builder ")
                    .append(camelize(g))
                    .append("(")
                    .append(jt)
                    .append(" ")
                    .append(c)
                    .append(") {\n");
            i.append("            this.").append(c).append(" = ").append(c).append(";\n");
            i.append("            return this;\n");
            i.append("        }\n\n");
        }
        for (ParsedParameter p : queryParamsForMembers) {
            String c = camelize(OpenApiSchemaCodegen.toPascalCase(p.getName()));
            String g = OpenApiSchemaCodegen.toPascalCase(p.getName());
            String jt = mapQueryParamJava(doc, transforms, b, p);
            i.append("        public Builder ")
                    .append(camelize(g))
                    .append("(")
                    .append(jt)
                    .append(" ")
                    .append(c)
                    .append(") {\n");
            i.append("            this.").append(c).append(" = ").append(c).append(";\n");
            i.append("            return this;\n");
            i.append("        }\n\n");
        }
        for (SchemaProperty p : bodyProps) {
            String c = camelize(p.getJavaName());
            i.append("        public Builder ")
                    .append(c)
                    .append("(")
                    .append(p.getJavaType())
                    .append(" ")
                    .append(c)
                    .append(") {\n");
            i.append("            this.").append(c).append(" = ").append(c).append(";\n");
            i.append("            return this;\n");
            i.append("        }\n\n");
        }
        if (paginated) {
            i.append("        public Builder limit(Integer limit) {\n");
            i.append("            this.limit = limit;\n");
            i.append("            return this;\n");
            i.append("        }\n\n");
            i.append("        public Builder pagination(Pagination pagination) {\n");
            i.append("            this.cursor = pagination.getNextCursor();\n");
            i.append("            this.sortDirection = pagination.getSortDirection();\n");
            i.append("            return this;\n");
            i.append("        }\n\n");
        }

        i.append("        public ").append(className).append(" build() throws CoinbaseClientException {\n");
        i.append("            validate();\n");
        i.append("            return new ").append(className).append("(this);\n");
        i.append("        }\n\n");
        i.append("        private void validate() throws CoinbaseClientException {\n");
        for (ParsedParameter p : pathParams) {
            if (p.isRequired() && p.getSchema() != null) {
                String jt = mapPathParamJava(doc, transforms, b, p);
                if ("String".equals(jt)) {
                    String c = camelize(OpenApiSchemaCodegen.toPascalCase(p.getName()));
                    String g = OpenApiSchemaCodegen.toPascalCase(p.getName());
                    i.append("            if (isNullOrEmpty(this.")
                            .append(c)
                            .append(")) {\n");
                    i.append("                throw new CoinbaseClientException(\"")
                            .append(g)
                            .append(" is required\");\n");
                    i.append("            }\n");
                }
            }
        }
        i.append("        }\n");
        i.append("    }\n");
        i.append("}\n");
        return i.toString();
    }

    private static void appendAccessorPair(
            StringBuilder i, String javaType, String pascalName, String fieldCamel) {
        i.append("    public ")
                .append(javaType)
                .append(" get")
                .append(pascalName)
                .append("() {\n");
        i.append("        return ").append(fieldCamel).append(";\n");
        i.append("    }\n\n");
        i.append("    public void set")
                .append(pascalName)
                .append("(")
                .append(javaType)
                .append(" ")
                .append(fieldCamel)
                .append(") {\n");
        i.append("        this.").append(fieldCamel).append(" = ").append(fieldCamel).append(";\n");
        i.append("    }\n\n");
    }

    private static String camelize(String pascal) {
        if (pascal == null || pascal.isEmpty()) {
            return pascal;
        }
        return pascal.substring(0, 1).toLowerCase(Locale.ROOT) + pascal.substring(1);
    }

    private static String escapeJavadoc(String s) {
        return s.replace("*/", "* /");
    }

    private static String mapPathParamJava(
            ParsedOpenApiDocument doc, SharedTransforms transforms, SdkOperationBinding b, ParsedParameter p) {
        if (b.getParamTypeOverrides().containsKey(p.getName()) && b.getParamTypeOverrides().get(p.getName()) != null) {
            String o = b.getParamTypeOverrides().get(p.getName()).trim();
            if (!o.isEmpty()) {
                return o;
            }
        }
        return OpenApiSchemaCodegen.toJavaType(doc.getRoot(), p.getSchema(), transforms).getJavaType();
    }

    private static String mapQueryParamJava(
            ParsedOpenApiDocument doc, SharedTransforms transforms, SdkOperationBinding b, ParsedParameter p) {
        if (b.getParamTypeOverrides().containsKey(p.getName()) && b.getParamTypeOverrides().get(p.getName()) != null) {
            String o = b.getParamTypeOverrides().get(p.getName()).trim();
            if (!o.isEmpty()) {
                return o;
            }
        }
        return OpenApiSchemaCodegen.toJavaType(doc.getRoot(), p.getSchema(), transforms).getJavaType();
    }
}
