package com.itcast.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 主启动类
 *
 * @author lichunmiao
 * @date 2020/6/28
 */
@SpringBootApplication
//@EnableEurekaClient,表明是eureka的客户端,本服务启动之后会自动注册进eureka服务中
@EnableEurekaClient
//@EnableDiscoveryClient,声明服务发现
@EnableDiscoveryClient
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}
