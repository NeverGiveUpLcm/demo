package com.itcast.demo.day05;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author lichunmiao
 * @date 2020/5/22
 */
public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {1,5,9,23,14,2,-9,3};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //获取最小的值
            int max = arr[i];
            //获取最小值的索引
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = max;
        }
    }


}
