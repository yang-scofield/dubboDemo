package com.deyuan.dubbo.controller;

import com.deyuan.dubbo.services.HelloService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangdeyuan
 * @date 2020/2/24  15:08
 * @description
 */
@RestController
@RequestMapping(value = "/apis")
public class HelloController {


    @Reference
    @Autowired
    private HelloService helloService;
    @GetMapping(value = "/hello")
    public String hello(String name){
        return helloService.sayHello(name);
    }
}
