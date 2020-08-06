package com.itcast.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 主启动类
 *
 * @author lichunmiao
 * @date 2020/6/28
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
// 开启服务熔断的支持
@EnableCircuitBreaker
public class DeptProviderHystrix8003_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix8003_App.class, args);
    }
}
