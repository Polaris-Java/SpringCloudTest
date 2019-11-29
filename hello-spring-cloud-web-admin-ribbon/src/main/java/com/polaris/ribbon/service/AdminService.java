package com.polaris.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * com.polaris.ribbon.config.service.AdminService
 *
 * @Description: AdminService
 * @Version: 1.0
 * @author: 北极星
 * @date: 2019/11/29
 */
@Service
public class AdminService {

    @Autowired
    RestTemplate restTemplate;

    public String sayHi(String message){
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message=" + message, String.class);
    }
}
