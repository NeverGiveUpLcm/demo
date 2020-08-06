package com.itcast.demo.day05;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author lichunmiao
 * @date 2020/5/22
 */
public class Demo6 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 52, 12, 33, -9, 10, 15};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        //插入排序是将数组分成两个部分 一部分是有序数字 另一部非是无序数组
        //通过遍历无序数组，将数字放在有序数组的合适位置
        for (int i = 1; i < arr.length; i++) {
            int index = i - 1;
            int value = arr[i];
            while (index >= 0 && value < arr[index]) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = value;
        }

    }
}
