package com.coinbase.tools.sdkgenerator.phases;

import com.coinbase.tools.sdkgenerator.CopyrightHelper;
import com.coinbase.tools.sdkgenerator.processing.GeneratorConfiguration;
import com.coinbase.tools.sdkgenerator.processing.ServiceDefinition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/** Emits {@code com.coinbase.prime.factory.PrimeServiceFactory}. */
public final class FactoryPhase {

    private FactoryPhase() {}

    public static String emit(GeneratorConfiguration cfg) {
        List<ServiceDefinition> defs =
                cfg.getServices().values().stream()
                        .sorted(Comparator.comparing(ServiceDefinition::getFolder))
                        .collect(Collectors.toCollection(ArrayList::new));
        StringBuilder s = new StringBuilder();
        s.append(CopyrightHelper.javaFileHeader());
        s.append("package com.coinbase.prime.factory;\n\n");
        for (ServiceDefinition d : defs) {
            s.append("import com.coinbase.prime.").append(d.getFolder()).append(".").append(d.getJavaInterfaceName()).append(";\n");
            s.append("import com.coinbase.prime.").append(d.getFolder()).append(".").append(d.getJavaServiceImplName()).append(";\n");
        }
        s.append("import com.coinbase.prime.client.CoinbasePrimeClient;\n\n");
        s.append("public class PrimeServiceFactory {\n");
        for (ServiceDefinition d : defs) {
            String method = "create" + d.getPascalName() + "Service";
            s.append("    public static ")
                    .append(d.getJavaInterfaceName())
                    .append(" ")
                    .append(method)
                    .append("(CoinbasePrimeClient client) {\n");
            s.append("        return new ")
                    .append(d.getJavaServiceImplName())
                    .append("(client);\n");
            s.append("    }\n\n");
        }
        s.append("}\n");
        return s.toString();
    }
}
