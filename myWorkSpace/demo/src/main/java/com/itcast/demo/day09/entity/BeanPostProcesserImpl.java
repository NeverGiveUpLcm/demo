package com.itcast.demo.day09.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 后置处理器实现
 *
 * @author lichunmiao
 * @date 2020/6/16
 */
public class BeanPostProcesserImpl implements BeanPostProcessor {
    /**
     * 初始化之前调用
     * @param o
     * @param s
     * @return 返回传入的bean
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    /**
     * 初始化方法之后调用
     * @param o
     * @param s
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        //初始化之后返回的bean;返回的是什么,容器中保存的就是什么
        return o;
    }
}
