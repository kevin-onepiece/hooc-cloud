package com.kevin.provider.ucenter.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan()
public class ProviderUcenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUcenterServerApplication.class, args);
    }

}
