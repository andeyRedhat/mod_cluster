package org.jboss.modcluster.container.catalina;

import org.jboss.modcluster.container.Engine;
import org.jboss.modcluster.container.Host;

public interface HostFactory {
    Host createHost(CatalinaFactoryRegistry registry, org.apache.catalina.Host host, Engine engine);
}
