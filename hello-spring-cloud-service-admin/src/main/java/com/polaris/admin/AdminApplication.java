package com.polaris.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * com.polaris.admin.AdminApplication
 *
 * @Description: Admin Server start Class
 * @Version: 1.0
 * @author: 北极星
 * @date: 2019/11/29
 */

@SpringBootApplication
@EnableEurekaClient
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
