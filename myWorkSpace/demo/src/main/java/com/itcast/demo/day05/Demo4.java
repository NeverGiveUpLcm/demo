package com.itcast.demo.day05;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author lichunmiao
 * @date 2020/5/21
 */
public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9,100,30,-9,3};
        popopSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void popopSorting(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j+1]<arr[j]){
                    temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
    }
}
