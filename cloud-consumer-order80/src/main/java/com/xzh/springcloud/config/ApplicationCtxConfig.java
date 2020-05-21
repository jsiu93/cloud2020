package com.xzh.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationCtxConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
