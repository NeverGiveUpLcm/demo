package com.itcast.demo.day09.entity;

import lombok.Data;

/**
 * @author lichunmiao
 * @date 2020/6/14
 */
@Data
public class Book {
    private String bookName;
    private String author;

    public void myInit(){
        System.out.println("11111");
    }
    public void myDestory(){
        System.out.println("22222");
    }
}
