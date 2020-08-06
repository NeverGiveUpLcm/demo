package com.itcast.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 消费者启动类
 *
 * @author lichunmiao
 * @date 2020/6/29
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.itcast.springcloud.service"})
//@ComponentScan("com.itcast.springcloud")
public class DeptConsumerFeign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_App.class, args);
    }
}
