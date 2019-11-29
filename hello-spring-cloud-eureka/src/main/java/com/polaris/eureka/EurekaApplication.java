package com.polaris.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * com.polaris.eureka.EurekaApplication
 *
 * @Description: Eureka Server Start Class
 * @Version: 1.0
 * @author: 北极星
 * @date: 2019/11/29
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
