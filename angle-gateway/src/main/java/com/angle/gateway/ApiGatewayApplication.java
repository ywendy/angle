package com.angle.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author YJ
 * @date 2018/11/14 13:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {


    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class,args);
    }
}
