package com.xzh.springcloud.lb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
@Slf4j
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndInc() {
        int curr;
        int next;

        do {
            curr = atomicInteger.get();
            next = curr >= Integer.MAX_VALUE ? 0 : curr + 1;
        } while (!this.atomicInteger.compareAndSet(curr, next));
        log.info("next:{}", next);
        return next;

    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int i = this.getAndInc() % serviceInstances.size();
        return serviceInstances.get(i);
    }

}
