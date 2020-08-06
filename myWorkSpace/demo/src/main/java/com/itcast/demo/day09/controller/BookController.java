package com.itcast.demo.day09.controller;

import com.itcast.demo.day09.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author lichunmiao
 * @date 2020/6/17
 */
@Controller
public class BookController {
    /**
     * 自动装配,自动的为这个属性赋值
     * @Autowired: spring会自动的为这个属性赋值;一定是去容器中找到这个属性所对应的组件
     * @Qualifier("bookService01"): 指定一个名作为id,让spring别使用变量名作为id
     */
    @Qualifier("bookService01")
    @Autowired(required = false)
    private BookService bookService;

    /**
     * 方法上有@Autowired的话:
     * 1)、这个方法也会在bean创建的时候自动运行
     * 2)、这个方法上的每一个参数都会自动注入值
     * 3)、可以在参数位置上使用@Qualifier注解
     */
    @Autowired
    public void getBook(@Qualifier("bookService") BookService bookService){

    }
}
