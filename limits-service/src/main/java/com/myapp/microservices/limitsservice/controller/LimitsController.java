package com.myapp.microservices.limitsservice.controller;

import com.myapp.microservices.limitsservice.bean.Limits;
import com.myapp.microservices.limitsservice.config.Config;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsController {

    private final Config configuration;
    @GetMapping("/limits")
    public Limits getLimits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }

}
