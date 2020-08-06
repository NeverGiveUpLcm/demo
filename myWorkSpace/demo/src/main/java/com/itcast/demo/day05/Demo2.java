package com.itcast.demo.day05;

import java.util.Arrays;

/**
 * 希尔排序练习
 *
 * @author lichunmiao
 * @date 2020/5/19
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,7,9,4,10,52,-42,-50};
        spellSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void spellSorting(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            int temp = 0;
            for (int i = gap; i < arr.length; i++) {
                //以gap步进，比较1前面的数字与i的大小关系
                //默认是从小到大的顺序，
//                for (int j = i - gap; j >= 0; j -= gap) {
//                    if (arr[j + gap] > arr[j]) {
//                        temp = arr[j];
//                        arr[j] = arr[j + gap];
//                        arr[j + gap] = temp;
//                        temp = 0;
//                    }
//                }
                int value = arr[i];
                int index = i-gap;
                while (index >=0 && value>arr[index]){
                    arr[index + gap] = arr[index];
                    index-=gap;
                }
                arr[index + gap] = value;
            }
        }
    }
}
