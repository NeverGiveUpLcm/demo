package com.itcast.demo.day08;

import java.util.LinkedList;

/**
 * 二分查找实现
 *
 * @author lichunmiao
 * @date 2020/6/1
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 10};
        LinkedList<Integer> list = binarySearchPlus(arr, 4, 8, 5);
        list.forEach(e -> {
            System.out.println("找到的值的index为:" + e);
        });

    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        //递归调用的话需要一个退出条件:当我们的left > right的时候就退出
        if (left > right) {
            //说明没找到
            return -1;
        }
        //二分查找是基于有序数组来实现的,通过与mid值的比较确定要找的值的位置
        //假设当前数组是按照从小到大的顺序排列的
        int mid = (left + right) / 2;
        //如果value值比mid值要小,说明value在mid值的左面
        if (value < arr[mid]) {
            //在mid的左面递归查找
            return binarySearch(arr, left, mid, value);
        }
        //如果value值比mid值要大,说明value在mid值的右面
        if (value > arr[mid]) {
            //在mid的右面递归查找
            return binarySearch(arr, mid + 1, right, value);
        }
        //如果value值正好等于mid，说明找到
        if (value == arr[mid]) {
            return mid;
        }
        return -1;
    }

    /**
     * 将所有满足条件的value所对应的索引都找出来
     *
     * @param arr
     * @param left
     * @param right
     * @param value
     * @return
     */
    public static LinkedList<Integer> binarySearchPlus(int[] arr, int left, int right, int value) {
        LinkedList<Integer> indexList = new LinkedList<>();
        //递归调用的话需要一个退出条件:当我们的left > right的时候就退出
        if (left > right) {
            //说明没找到
            return indexList;
        }
        //二分查找是基于有序数组来实现的,通过与mid值的比较确定要找的值的位置
        //假设当前数组是按照从小到大的顺序排列的
        int mid = (left + right) / 2;
        //如果value值比mid值要小,说明value在mid值的左面
        if (value < arr[mid]) {
            //在mid的左面递归查找
            return binarySearchPlus(arr, left, mid, value);
        }
        //如果value值比mid值要大,说明value在mid值的右面
        if (value > arr[mid]) {
            //在mid的右面递归查找
            return binarySearchPlus(arr, mid + 1, right, value);
        }
        //如果value值正好等于mid，说明找到
        if (value == arr[mid]) {
            int temp = mid;
            //向mid值的左边还是寻找
            while (temp >= left && arr[temp] == value) {
                indexList.add(temp);
                temp--;
            }
            temp = mid + 1;
            while (temp <= right && arr[temp] == value) {
                indexList.add(temp);
                temp++;
            }
        }
        return indexList;
    }

}
