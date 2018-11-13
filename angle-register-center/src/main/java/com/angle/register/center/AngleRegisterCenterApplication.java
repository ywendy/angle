package com.angle.register.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author YJ
 * @date 2018/11/12 14:46
 */
@SpringBootApplication
@EnableEurekaServer
public class AngleRegisterCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AngleRegisterCenterApplication.class,args);
    }
}
