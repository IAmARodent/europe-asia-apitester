package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class SrcProjectDependency extends DelegatingProjectDependency {

    @Inject
    public SrcProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":src:bom"
     */
    public Src_BomProjectDependency getBom() { return new Src_BomProjectDependency(getFactory(), create(":src:bom")); }

    /**
     * Creates a project dependency on the project at path ":src:bom-testing"
     */
    public Src_BomTestingProjectDependency getBomTesting() { return new Src_BomTestingProjectDependency(getFactory(), create(":src:bom-testing")); }

    /**
     * Creates a project dependency on the project at path ":src:bom-thirdparty"
     */
    public Src_BomThirdpartyProjectDependency getBomThirdparty() { return new Src_BomThirdpartyProjectDependency(getFactory(), create(":src:bom-thirdparty")); }

    /**
     * Creates a project dependency on the project at path ":src:bshclient"
     */
    public Src_BshclientProjectDependency getBshclient() { return new Src_BshclientProjectDependency(getFactory(), create(":src:bshclient")); }

    /**
     * Creates a project dependency on the project at path ":src:components"
     */
    public Src_ComponentsProjectDependency getComponents() { return new Src_ComponentsProjectDependency(getFactory(), create(":src:components")); }

    /**
     * Creates a project dependency on the project at path ":src:config"
     */
    public Src_ConfigProjectDependency getConfig() { return new Src_ConfigProjectDependency(getFactory(), create(":src:config")); }

    /**
     * Creates a project dependency on the project at path ":src:core"
     */
    public Src_CoreProjectDependency getCore() { return new Src_CoreProjectDependency(getFactory(), create(":src:core")); }

    /**
     * Creates a project dependency on the project at path ":src:dist"
     */
    public Src_DistProjectDependency getDist() { return new Src_DistProjectDependency(getFactory(), create(":src:dist")); }

    /**
     * Creates a project dependency on the project at path ":src:dist-check"
     */
    public Src_DistCheckProjectDependency getDistCheck() { return new Src_DistCheckProjectDependency(getFactory(), create(":src:dist-check")); }

    /**
     * Creates a project dependency on the project at path ":src:examples"
     */
    public Src_ExamplesProjectDependency getExamples() { return new Src_ExamplesProjectDependency(getFactory(), create(":src:examples")); }

    /**
     * Creates a project dependency on the project at path ":src:functions"
     */
    public Src_FunctionsProjectDependency getFunctions() { return new Src_FunctionsProjectDependency(getFactory(), create(":src:functions")); }

    /**
     * Creates a project dependency on the project at path ":src:generator"
     */
    public Src_GeneratorProjectDependency getGenerator() { return new Src_GeneratorProjectDependency(getFactory(), create(":src:generator")); }

    /**
     * Creates a project dependency on the project at path ":src:jorphan"
     */
    public Src_JorphanProjectDependency getJorphan() { return new Src_JorphanProjectDependency(getFactory(), create(":src:jorphan")); }

    /**
     * Creates a project dependency on the project at path ":src:launcher"
     */
    public Src_LauncherProjectDependency getLauncher() { return new Src_LauncherProjectDependency(getFactory(), create(":src:launcher")); }

    /**
     * Creates a project dependency on the project at path ":src:licenses"
     */
    public Src_LicensesProjectDependency getLicenses() { return new Src_LicensesProjectDependency(getFactory(), create(":src:licenses")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol"
     */
    public Src_ProtocolProjectDependency getProtocol() { return new Src_ProtocolProjectDependency(getFactory(), create(":src:protocol")); }

    /**
     * Creates a project dependency on the project at path ":src:release"
     */
    public Src_ReleaseProjectDependency getRelease() { return new Src_ReleaseProjectDependency(getFactory(), create(":src:release")); }

    /**
     * Creates a project dependency on the project at path ":src:test-services"
     */
    public Src_TestServicesProjectDependency getTestServices() { return new Src_TestServicesProjectDependency(getFactory(), create(":src:test-services")); }

    /**
     * Creates a project dependency on the project at path ":src:testkit"
     */
    public Src_TestkitProjectDependency getTestkit() { return new Src_TestkitProjectDependency(getFactory(), create(":src:testkit")); }

    /**
     * Creates a project dependency on the project at path ":src:testkit-wiremock"
     */
    public Src_TestkitWiremockProjectDependency getTestkitWiremock() { return new Src_TestkitWiremockProjectDependency(getFactory(), create(":src:testkit-wiremock")); }

}
