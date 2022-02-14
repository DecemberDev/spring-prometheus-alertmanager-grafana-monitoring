package com.monitoring.controller;

import com.monitoring.metric.CustomEndpointCounter;
import com.monitoring.service.CustomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    private final CustomService customService;
    private final CustomEndpointCounter customEndpointCounter;

    public CustomController(CustomService customService, CustomEndpointCounter customEndpointCounter) {
        this.customService = customService;
        this.customEndpointCounter = customEndpointCounter;
    }

    @GetMapping("/endpoint")
    public String helloController() {
        customEndpointCounter.increaseCounter();
        return customService.hello();
    }
}
