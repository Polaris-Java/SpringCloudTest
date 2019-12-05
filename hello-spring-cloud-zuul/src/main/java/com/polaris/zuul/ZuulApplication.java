package com.polaris.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.util.HashMap;
import java.util.Map;

/**
 * com.polaris.zuul.ZuulApplication
 *
 * @Description: Zuul 网关
 * @Version: 1.0
 * @author: 北极星
 * @date: 2019/12/4
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
