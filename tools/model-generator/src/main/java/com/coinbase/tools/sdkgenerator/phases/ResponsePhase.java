package com.coinbase.tools.sdkgenerator.phases;

import com.coinbase.tools.sdkgenerator.CopyrightHelper;
import com.coinbase.tools.sdkgenerator.processing.GeneratorConfiguration;
import com.coinbase.tools.sdkgenerator.processing.NamingResolver;
import com.coinbase.tools.sdkgenerator.processing.OpenApiSchemaCodegen;
import com.coinbase.tools.sdkgenerator.processing.SchemaProperty;
import com.coinbase.tools.sdkgenerator.processing.ServiceDefinition;
import com.coinbase.tools.sdkgenerator.processing.SharedTransforms;
import com.coinbase.tools.sdkgenerator.spec.ParsedOpenApiDocument;
import com.coinbase.tools.sdkgenerator.spec.ParsedOperation;
import com.coinbase.tools.sdkgenerator.spec.SdkOperationBinding;
import com.coinbase.tools.sdkgenerator.spec.SpecRef;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;
import java.util.TreeSet;

public final class ResponsePhase {

    private ResponsePhase() {}

    public static String emitResponse(
            ParsedOpenApiDocument doc,
            GeneratorConfiguration cfg,
            SharedTransforms transforms,
            SdkOperationBinding b,
            ParsedOperation op) {
        ServiceDefinition svc = NamingResolver.requireService(cfg, b.getService());
        String pkg = svc.getJavaPackage();
        String name = b.getSdkMethod() + "Response";
        StringBuilder o = new StringBuilder();
        o.append(CopyrightHelper.javaFileHeader());
        o.append("package ").append(pkg).append(";\n\n");

        if (op.getSuccessResponseSchemaRef() == null || op.getSuccessResponseSchemaRef().isEmpty()) {
            o.append("/**\n * Response for ").append(b.getSdkMethod()).append(".\n */\n");
            o.append("public class ").append(name).append(" {\n");
            o.append("    public ").append(name).append("() {\n    }\n");
            o.append("}\n");
            return o.toString();
        }

        JsonNode schema = SpecRef.resolveRef(doc.getRoot(), op.getSuccessResponseSchemaRef());
        if (schema == null) {
            o.append("public class ").append(name).append(" {\n");
            o.append("    public ").append(name).append("() {\n    }\n");
            o.append("}\n");
            return o.toString();
        }
        List<SchemaProperty> props = OpenApiSchemaCodegen.listProperties(doc.getRoot(), schema, transforms);
        TreeSet<String> modelImports = new TreeSet<>();
        TreeSet<String> enumImports = new TreeSet<>();
        for (SchemaProperty p : props) {
            modelImports.addAll(p.getReferencedModelTypeNames());
            enumImports.addAll(p.getReferencedEnumTypeNames());
        }
        for (String m : modelImports) {
            if ("Pagination".equals(m)) {
                o.append("import com.coinbase.prime.common.Pagination;\n");
            } else {
                o.append("import com.coinbase.prime.model.").append(m).append(";\n");
            }
        }
        for (String e : enumImports) {
            o.append("import com.coinbase.prime.model.enums.").append(e).append(";\n");
        }
        o.append("import com.fasterxml.jackson.annotation.JsonProperty;\n\n");

        if (op.getSummary() != null && !op.getSummary().isEmpty()) {
            o.append("/**\n * ").append(escape(op.getSummary())).append("\n */\n");
        }
        o.append("public class ").append(name).append(" {\n");
        for (SchemaProperty p : props) {
            o.append("    @JsonProperty(\"").append(p.getJsonName()).append("\")\n");
            o.append("    private ")
                    .append(p.getJavaType())
                    .append(" ")
                    .append(camelize(p.getJavaName()))
                    .append(";\n\n");
        }
        o.append("    public ").append(name).append("() {\n    }\n\n");
        for (SchemaProperty p : props) {
            String c = camelize(p.getJavaName());
            o.append("    public ")
                    .append(p.getJavaType())
                    .append(" get")
                    .append(p.getJavaName())
                    .append("() {\n");
            o.append("        return ").append(c).append(";\n");
            o.append("    }\n\n");
            o.append("    public void set")
                    .append(p.getJavaName())
                    .append("(")
                    .append(p.getJavaType())
                    .append(" ")
                    .append(c)
                    .append(") {\n");
            o.append("        this.").append(c).append(" = ").append(c).append(";\n");
            o.append("    }\n\n");
        }
        o.append("}\n");
        return o.toString();
    }

    private static String camelize(String pascal) {
        if (pascal == null || pascal.isEmpty()) {
            return pascal;
        }
        return pascal.substring(0, 1).toLowerCase() + pascal.substring(1);
    }

    private static String escape(String s) {
        return s.replace("*/", "* /");
    }
}
