package org.jboss.modcluster.container.catalina;

import org.jboss.modcluster.container.Engine;
import org.jboss.modcluster.container.Host;

public class CatalinaHostFactory implements HostFactory {
    @Override
    public Host createHost(CatalinaFactoryRegistry registry, org.apache.catalina.Host host, Engine engine) {
        return new CatalinaHost(registry, host, engine);
    }
}
