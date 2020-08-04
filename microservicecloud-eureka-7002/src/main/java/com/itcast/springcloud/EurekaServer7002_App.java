package com.itcast.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lichunmiao
 * @date 2020/6/29
 */
@SpringBootApplication
//@EnableEurekaServer 服务端启动类,声明这是一个Eureka的服务端,接受其他微服务注册进来
@EnableEurekaServer
public class EurekaServer7002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
