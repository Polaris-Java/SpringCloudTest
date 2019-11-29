package com.polaris.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * com.polaris.feign.service.AdminService
 *
 * @Description: Feign AdminService
 * @Version: 1.0
 * @author: 北极星
 * @date: 2019/11/29
 */
@Service
@FeignClient(value = "hello-spring-cloud-service-admin")
public interface AdminService {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "message") String message);

}
