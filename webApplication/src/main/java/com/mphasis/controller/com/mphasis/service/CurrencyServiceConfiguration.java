package com.mphasis.controller.com.mphasis.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
@Setter
@Getter
public class CurrencyServiceConfiguration {
    private String url;
    private String username;
    private String key;
}
