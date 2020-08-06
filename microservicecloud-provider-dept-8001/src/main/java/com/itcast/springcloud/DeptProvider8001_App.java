package com.itcast.springcloud;

import org.mybatis.spring.annotation.MapperScan;
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
//注册进eureka中心
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan({"com.itcast.springcloud.dao"})
public class DeptProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}
