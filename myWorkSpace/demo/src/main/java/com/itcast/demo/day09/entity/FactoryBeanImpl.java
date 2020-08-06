package com.itcast.demo.day09.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * 实现了FactoryBean接口的类是spring认识的工厂类
 * spring会自动的调用工厂方法创建对象
 *
 * @author lichunmiao
 * @date 2020/6/16
 */
public class FactoryBeanImpl implements FactoryBean<Airplane> {
    /**
     * getObject :工厂方法
     * @return 返回创建的对象
     * @throws Exception
     */
    @Override
    public Airplane getObject() throws Exception {
        return new Airplane();
    }

    /**
     * 返回创建的对象的类型
     * spring 会自动调用这个方法来确认创建的对象是什么类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Airplane.class;
    }

    /**
     * isSingleton
     * @return 是单例么？
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
