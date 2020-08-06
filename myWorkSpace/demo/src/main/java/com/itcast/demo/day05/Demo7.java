package com.itcast.demo.day05;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @author lichunmiao
 * @date 2020/5/22
 */
public class Demo7 {
    public static void main(String[] args) {
        int[] arr= {1,5,6,7,8,2,3,4,10,50,-9,-8};
        mergerSorting(arr,0,11,new int[12]);
        System.out.println(Arrays.toString(arr));

//        int[] arr = {1, 4, 2, 3};
//        merge(arr, 0, 3, 1, new int[4]);
//        System.out.println(Arrays.toString(arr));


    }

    public static void mergerSorting(int[] arr, int left, int right, int[] temp) {
        int mid = (left + right) / 2;
        if (left < mid) {
            mergerSorting(arr, left, mid, temp);
        }
        if (mid + 1 < right) {
            mergerSorting(arr, mid + 1, right, temp);
        }
        merge(arr, left, right, mid, temp);


    }

    /**
     * 合并的方法
     */
    public static void merge(int[] arr, int left, int right, int mid, int[] temp) {
        int l = left;
        int r = right;
        int a = mid + 1;
        int index = 0;
        while (l <= mid && a <= r) {
            while (arr[l] < arr[a] && l <= mid) {
                temp[index] = arr[l];
                index++;
                l++;
            }
            while (a <= r && arr[a] < arr[l]) {
                temp[index] = arr[a];
                index++;
                a++;
            }
        }
        if (l >= mid) {
            while (a <= r) {
                temp[index] = arr[a];
                a++;
                index++;
            }
        }
        if (a >= r) {
            while (l <= mid) {
                temp[index] = arr[l];
                l++;
                index++;
            }
        }
        //至此新数组保存完毕
        //需要将新数组的数保存到之前的数组
        int templ = left;
        index = 0;
        while (templ <= r) {
            arr[templ] = temp[index];
            templ++;
            index++;
        }

    }
}
