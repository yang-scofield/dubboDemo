package com.deyuan.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deyuan.dubbo.services.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author yangdeyuan
 * @date 2020/2/24  15:07
 * @description
 */
@Service(version = "1.0.0")
@Component
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String name) {
        return " hello to "+name+", you can get anything from me";
    }
}
