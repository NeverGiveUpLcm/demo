package com.itcast.demo.day05;

import java.util.Arrays;

/**
 * 快速排序练习
 *
 * @author lichunmiao
 * @date 2020/5/21
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 12, 56, 34, 8, 6,-9,100,-5};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        //定义从左边开始比较的位置
        int l = left;
        //定义从右边开始比较的位置
        int r = right;
        //定义一个基准，我们选择中间位置的值
        int mid = (left + right) / 2;
        int midNum = arr[(left + right) / 2];

        //开始继续循环比较，当l >= r的时候跳出循环，说明全部的数都已经比较完毕
        //定义一个临时变量temp
        int temp = 0;
        while (l < r) {
            //从左边开始寻找比mid大的值
            while (arr[l] < midNum) {
                l++;
            }
            //从右边开始寻找比mid小的值
            while (arr[r] > midNum) {
                r--;
            }
//            System.out.println(l);
//            System.out.println(r);
            //如果一次循环下来，l>=r的话则直接return
            if (l >= r) {
                break;
            }
            //左边的数和右边的数进行交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            //如果交换完之后 arr[l] = arr[mid]
        }
        if (l==r){
            r--;
            l++;
        }
//        System.out.println(left);
//        System.out.println(mid);
        if (left < r) {
            quickSort(arr, left, r);
            }
        if (right > l) {
            quickSort(arr, l, right);
        }


    }
}
