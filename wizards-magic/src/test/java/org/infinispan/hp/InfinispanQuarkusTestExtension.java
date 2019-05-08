package org.infinispan.hp;

import java.util.Collections;
import java.util.Map;

import org.infinispan.test.jupiter.InfinispanServerExtension;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

public class InfinispanQuarkusTestExtension implements QuarkusTestResourceLifecycleManager {

    private InfinispanServerExtension infinispanServerExtension = InfinispanServerExtension.builder().build();

    @Override
    public Map<String, String> start() {
        infinispanServerExtension.start();
        return Collections.emptyMap();
    }

    @Override
    public void stop() {
        infinispanServerExtension.stop();
    }
}
