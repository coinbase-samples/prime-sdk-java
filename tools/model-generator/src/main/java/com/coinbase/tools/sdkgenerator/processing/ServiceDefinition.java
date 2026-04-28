package com.coinbase.tools.sdkgenerator.processing;

/**
 * Per-tag service metadata. {@link #pascalName} is the PascalCase name segment (C# "namespace"
 * field) used to build e.g. {@code ActivitiesService} and {@code ActivitiesServiceImpl}.
 */
public final class ServiceDefinition {
    private final String folder;
    private final String pascalName;

    public ServiceDefinition(String folder, String pascalName) {
        this.folder = folder;
        this.pascalName = pascalName;
    }

    public String getFolder() {
        return folder;
    }

    public String getPascalName() {
        return pascalName;
    }

    public String getJavaInterfaceName() {
        return pascalName + "Service";
    }

    public String getJavaServiceImplName() {
        return pascalName + "ServiceImpl";
    }

    public String getJavaPackage() {
        return "com.coinbase.prime." + folder;
    }
}
