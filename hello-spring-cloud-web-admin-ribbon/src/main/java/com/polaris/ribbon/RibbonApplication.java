package com.polaris.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * com.polaris.ribbon.RibbonApplication
 *
 * @Description: Ribbon Server Start Class
 * @Version: 1.0
 * @author: 北极星
 * @date: 2019/11/29
 */

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class,args);
    }
}
