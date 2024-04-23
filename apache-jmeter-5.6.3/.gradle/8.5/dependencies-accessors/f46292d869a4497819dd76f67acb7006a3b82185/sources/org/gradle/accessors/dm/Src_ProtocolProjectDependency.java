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
public class Src_ProtocolProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Src_ProtocolProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":src:protocol:bolt"
     */
    public Src_Protocol_BoltProjectDependency getBolt() { return new Src_Protocol_BoltProjectDependency(getFactory(), create(":src:protocol:bolt")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol:ftp"
     */
    public Src_Protocol_FtpProjectDependency getFtp() { return new Src_Protocol_FtpProjectDependency(getFactory(), create(":src:protocol:ftp")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol:http"
     */
    public Src_Protocol_HttpProjectDependency getHttp() { return new Src_Protocol_HttpProjectDependency(getFactory(), create(":src:protocol:http")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol:java"
     */
    public Src_Protocol_JavaProjectDependency getJava() { return new Src_Protocol_JavaProjectDependency(getFactory(), create(":src:protocol:java")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol:jdbc"
     */
    public Src_Protocol_JdbcProjectDependency getJdbc() { return new Src_Protocol_JdbcProjectDependency(getFactory(), create(":src:protocol:jdbc")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol:jms"
     */
    public Src_Protocol_JmsProjectDependency getJms() { return new Src_Protocol_JmsProjectDependency(getFactory(), create(":src:protocol:jms")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol:junit"
     */
    public Src_Protocol_JunitProjectDependency getJunit() { return new Src_Protocol_JunitProjectDependency(getFactory(), create(":src:protocol:junit")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol:junit-sample"
     */
    public Src_Protocol_JunitSampleProjectDependency getJunitSample() { return new Src_Protocol_JunitSampleProjectDependency(getFactory(), create(":src:protocol:junit-sample")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol:ldap"
     */
    public Src_Protocol_LdapProjectDependency getLdap() { return new Src_Protocol_LdapProjectDependency(getFactory(), create(":src:protocol:ldap")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol:mail"
     */
    public Src_Protocol_MailProjectDependency getMail() { return new Src_Protocol_MailProjectDependency(getFactory(), create(":src:protocol:mail")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol:mongodb"
     */
    public Src_Protocol_MongodbProjectDependency getMongodb() { return new Src_Protocol_MongodbProjectDependency(getFactory(), create(":src:protocol:mongodb")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol:native"
     */
    public Src_Protocol_NativeProjectDependency getNative() { return new Src_Protocol_NativeProjectDependency(getFactory(), create(":src:protocol:native")); }

    /**
     * Creates a project dependency on the project at path ":src:protocol:tcp"
     */
    public Src_Protocol_TcpProjectDependency getTcp() { return new Src_Protocol_TcpProjectDependency(getFactory(), create(":src:protocol:tcp")); }

}
