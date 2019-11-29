package com.polaris.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * com.polaris.ribbon.config.RestTemplateConfiguration
 *
 * @Description: RestTemplateConfiguration
 * @Version: 1.0
 * @author: 北极星
 * @date: 2019/11/29
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
