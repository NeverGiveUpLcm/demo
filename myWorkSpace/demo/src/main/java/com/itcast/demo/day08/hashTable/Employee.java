package com.itcast.demo.day08.hashTable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 雇员
 *
 * @author lichunmiao
 * @date 2020/6/15
 */
@Getter
@Setter
public class Employee {
    private int id;
    private String name;
    private Employee next;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
