package com.itcast.demo.day10;

/**
 * @author lichunmiao
 * @date 2020/6/17
 */
public class Calculate implements CalculateIn {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }
}
