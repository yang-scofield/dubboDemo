package com.deyuan.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.deyuan.dubbo.services.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangdeyuan
 * @date 2020/2/24  15:12
 * @description
 */
@RestController
@RequestMapping(value = "/apis")
public class HelloController {


    @Reference(version = "1.0.0")
    private HelloService helloService;
    @GetMapping(value = "/hello")
    public String hello(String name){
        return "from provider： "+helloService.sayHello(name);
    }
}
