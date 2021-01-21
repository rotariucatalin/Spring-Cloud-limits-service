package com.example.limitsservice;

import com.example.limitsservice.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimistConfigurationController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retreiveLimitsFromConfiguration() {


        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
