package com.itcast.demo.day09.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author lichunmiao
 * @date 2020/6/5
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private String course;
    private String address;
    private Date birth;

}
