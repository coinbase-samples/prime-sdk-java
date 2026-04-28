package com.coinbase.tools.sdkgenerator.processing;

public final class NamingResolver {

    private NamingResolver() {}

    public static ServiceDefinition requireService(GeneratorConfiguration cfg, String serviceKey) {
        ServiceDefinition def = cfg.getServices().get(serviceKey);
        if (def == null) {
            throw new IllegalStateException("Unknown service key '" + serviceKey + "' in operation bindings.");
        }
        return def;
    }
}
