package com.polaris.feign.service.hystrix;

import com.polaris.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * com.polaris.feign.service.hystrix.AdminServiceHystrix
 *
 * @Description: Hystrix 熔断器
 * @Version: 1.0
 * @author: 北极星
 * @date: 2019/12/4
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
