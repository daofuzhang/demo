package com.want.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2// 该注解开启Swagger2的自动配置
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);

	}

}
