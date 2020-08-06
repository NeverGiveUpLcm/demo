package com.itcast.demo.day09.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author lichunmiao
 * @date 2020/6/9
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String lastName;
    private int age;
    private String gender;
    private String email;
    private Car car;
    private List<Book> books;
    private Map<String,Object> maps;
    private Properties properties;




}
