package com.itcast.springcloud;

import com.itcast.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 消费者启动类
 *
 * @author lichunmiao
 * @date 2020/6/29
 */
@SpringBootApplication
//@EnableEurekaClient 声明服务消费者也作为eureka的客户端
@EnableEurekaClient
/**
 * name: 针对 服务Id为MICROSERVICECLOUD-DEPT 的微服务使用自定义的负载均衡策略
 * configuration: 自定义的负载均衡算法的配置类
 */
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
