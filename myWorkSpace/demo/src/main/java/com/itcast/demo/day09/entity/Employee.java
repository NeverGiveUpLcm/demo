package com.itcast.demo.day09.entity;

import lombok.Data;

/**
 * 员工表
 *
 * @author lichunmiao
 * @date 2020/6/2
 */
@Data
public class Employee {
    private Integer id;
    private String name;
    private String gender;
    private String email;

}
