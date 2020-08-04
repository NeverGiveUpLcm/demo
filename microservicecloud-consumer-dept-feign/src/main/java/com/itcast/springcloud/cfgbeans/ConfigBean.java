package com.itcast.springcloud.cfgbeans;

import com.itcast.springcloud.service.impl.UserServiceImpl;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类
 *
 * @author lichunmiao
 * @date 2020/6/29
 */
// @Configuration 注解,声明这个类是一个配置类,相当于之前的一个xml配置
@Configuration
public class ConfigBean {
    /**
     * @Bean注解会将方法的返回值注入到spring容器中,相当于之前配置文件中的<bean>标签
     */
    @Bean
    public UserServiceImpl getUserService(){
        return new UserServiceImpl();
    }

    @Bean
    //@LoadBalanced表示开始ribbon的负载均衡
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule getRule(){
        //这样会将我们重新选择的随机算法替代原有的默认的轮询算法
        return new RandomRule();
    }
}
