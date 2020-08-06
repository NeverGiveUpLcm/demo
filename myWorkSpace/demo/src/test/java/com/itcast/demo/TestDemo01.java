package com.itcast.demo;

import com.itcast.demo.day09.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author lichunmiao
 * @date 2020/6/9
 */
public class TestDemo01 {

    /**
     * 从容器中获取这个组件
     */
    @Test
    public void test01() {
        //ApplicationContext:代表IOC容器
        //根据spring的配置文件得到ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("");
        //容器帮助我们创建好对象
        Person person01 = (Person) applicationContext.getBean("person01");
        System.out.println(person01);
    }

    @Test
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
        //如果ioc容器中这个类型的bean有多个,按照类型查找就会出错
//        Person person01 = applicationContext.getBean(Person.class);
        Person person02 = applicationContext.getBean("person03",Person.class);

        System.out.println(person02);
    }
}
