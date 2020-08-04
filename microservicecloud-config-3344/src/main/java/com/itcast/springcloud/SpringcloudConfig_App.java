package com.itcast.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author lichunmiao
 * @date 2020/7/3
 */
@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfig_App {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfig_App.class,args);
    }
}
