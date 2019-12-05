package com.polaris.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import rx.internal.operators.CompletableOnSubscribeConcat;

/**
 * com.polaris.config.ConfigApplication
 *
 * @Description: SpringCloudConfig Start
 * @Version: 1.0
 * @author: 北极星
 * @date: 2019/12/5
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
