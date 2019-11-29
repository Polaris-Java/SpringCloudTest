package com.polaris.ribbon.controller;

import com.polaris.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.polaris.ribbon.controller.AdminController
 *
 * @Description: AdminController
 * @Version: 1.0
 * @author: 北极星
 * @date: 2019/11/29
 */
@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String message) {
        return adminService.sayHi(message);
    }
}
