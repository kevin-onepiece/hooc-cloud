package com.kevin.hooc.biz.ucenter.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BizUcenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizUcenterServerApplication.class, args);
    }

}
