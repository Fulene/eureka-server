package com.practice.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {  // Replace consul the time to have a fixed ip address

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
