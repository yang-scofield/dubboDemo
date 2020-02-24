package com.deyuan.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboProducterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProducterApplication.class, args);
	}

}
