package com.itcast.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author lichunmiao
 * @date 2020/7/2
 */
@SpringBootApplication
//开启服务监控
@EnableHystrixDashboard
public class HystrixDashboard_App {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard_App.class,args);
    }
}
