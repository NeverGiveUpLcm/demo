package com.itcast.springcloud.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 部门
 *
 * @author lichunmiao
 * @date 2020/6/28
 */
@Data
public class Dept implements Serializable {
    private Long deptno;

    private String dname;

    private String db_source;
}
