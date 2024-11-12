package com.kirsing.picturediscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PictureDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PictureDiscoveryServiceApplication.class, args);
    }

}
