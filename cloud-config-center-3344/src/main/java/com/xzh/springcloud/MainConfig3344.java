package com.xzh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MainConfig3344 {
    public static void main(String[] args) {
        SpringApplication.run(MainConfig3344.class, args);
    }
}
