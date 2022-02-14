package com.monitoring.metric;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class CustomEndpointCounter {

    private final Counter endpointCounter;

    public CustomEndpointCounter(MeterRegistry meterRegistry) {
        endpointCounter = meterRegistry.counter("custom.endpoint.count");
    }

    public void increaseCounter() {
        endpointCounter.increment();
    }
}
