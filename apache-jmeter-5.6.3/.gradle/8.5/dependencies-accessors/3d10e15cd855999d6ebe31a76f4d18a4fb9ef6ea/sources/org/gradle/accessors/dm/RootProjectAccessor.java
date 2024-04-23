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
public class RootProjectAccessor extends TypeSafeProjectDependencyFactory {


    @Inject
    public RootProjectAccessor(DefaultProjectDependencyFactory factory, ProjectFinder finder) {
        super(factory, finder);
    }

    /**
     * Creates a project dependency on the project at path ":"
     */
    public BuildLogicProjectDependency getBuildLogic() { return new BuildLogicProjectDependency(getFactory(), create(":")); }

    /**
     * Creates a project dependency on the project at path ":basics"
     */
    public BasicsProjectDependency getBasics() { return new BasicsProjectDependency(getFactory(), create(":basics")); }

    /**
     * Creates a project dependency on the project at path ":batchtest"
     */
    public BatchtestProjectDependency getBatchtest() { return new BatchtestProjectDependency(getFactory(), create(":batchtest")); }

    /**
     * Creates a project dependency on the project at path ":build-parameters"
     */
    public BuildParametersProjectDependency getBuildParameters() { return new BuildParametersProjectDependency(getFactory(), create(":build-parameters")); }

    /**
     * Creates a project dependency on the project at path ":jvm"
     */
    public JvmProjectDependency getJvm() { return new JvmProjectDependency(getFactory(), create(":jvm")); }

    /**
     * Creates a project dependency on the project at path ":publishing"
     */
    public PublishingProjectDependency getPublishing() { return new PublishingProjectDependency(getFactory(), create(":publishing")); }

    /**
     * Creates a project dependency on the project at path ":root-build"
     */
    public RootBuildProjectDependency getRootBuild() { return new RootBuildProjectDependency(getFactory(), create(":root-build")); }

    /**
     * Creates a project dependency on the project at path ":verification"
     */
    public VerificationProjectDependency getVerification() { return new VerificationProjectDependency(getFactory(), create(":verification")); }

}
