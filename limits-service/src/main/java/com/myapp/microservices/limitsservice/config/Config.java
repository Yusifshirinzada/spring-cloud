package com.myapp.microservices.limitsservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limits-service")
@Data
@Component
public class Config {
    private int minimum;
    private int maximum;
}
