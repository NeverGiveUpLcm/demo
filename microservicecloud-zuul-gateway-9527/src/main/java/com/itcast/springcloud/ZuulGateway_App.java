package com.itcast.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author lichunmiao
 * @date 2020/7/2
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway_App {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway_App.class, args);
    }
}
