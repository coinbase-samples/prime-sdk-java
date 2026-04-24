package com.coinbase.tools.sdkgenerator;

import com.coinbase.tools.sdkgenerator.processing.GeneratorConfiguration;
import com.coinbase.tools.sdkgenerator.processing.OpenApiSchemaCodegen;
import com.coinbase.tools.sdkgenerator.processing.SharedTransforms;
import com.coinbase.tools.sdkgenerator.spec.ParsedOpenApiDocument;
import com.coinbase.tools.sdkgenerator.spec.ParsedOperation;
import com.coinbase.tools.sdkgenerator.spec.SpecParser;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SpecParserTest {

    @Test
    void loadsMinimalOpenApi() throws Exception {
        Path p =
                Path.of("src/test/resources/openapi-minimal.yaml")
                        .toAbsolutePath();
        ParsedOpenApiDocument doc = SpecParser.load(p);
        assertNotNull(doc.getRoot());
        ParsedOperation op = doc.getOperationsById().get("PrimeRESTAPI_GetFoo");
        assertNotNull(op);
        assertEquals("get", op.getHttpMethod().toLowerCase());
        assertEquals("/v1/entities/{entity_id}/foo", op.getPath());
    }

    @Test
    void schemaToJava() throws Exception {
        Path projectRoot = GeneratorPaths.findProjectRoot();
        GeneratorConfiguration cfg = GeneratorConfiguration.load(projectRoot);
        SharedTransforms t = new SharedTransforms(cfg);
        Path p = Path.of("src/test/resources/openapi-minimal.yaml").toAbsolutePath();
        ParsedOpenApiDocument doc = SpecParser.load(p);
        assertTrue(
                OpenApiSchemaCodegen.toJavaType(
                                doc.getRoot(), doc.getRoot().at("/components/schemas/FooItem"), t)
                        .getJavaType()
                        .length()
                        > 0);
    }
}
