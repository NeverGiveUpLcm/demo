package com.itcast.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义Ribbon算法
 *
 * @author lichunmiao
 * @date 2020/6/30
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule getRule() {
        return new RandomRule_LCM();
    }

}
