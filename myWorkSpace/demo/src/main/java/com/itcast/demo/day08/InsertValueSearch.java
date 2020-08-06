package com.itcast.demo.day08;

/**
 * 插值查找
 *
 * @author lichunmiao
 * @date 2020/6/9
 */
public class InsertValueSearch {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        int i = insertValueSearch(arr, 50, 99, 85);
        System.out.println("找到的索引为:" + i);
    }

    /**
     * 插值查找的实现
     *
     * @param arr       查询的数组
     * @param left      数组的起始索引
     * @param right     数组的终止索引
     * @param findValue 要寻找的值
     * @return findValue所对应的数组索引下标
     */
    public static int insertValueSearch(int[] arr, int left, int right, int findValue) {
        System.out.println("11111111111111");
        //插值查找其实就是对二分查找的一个优化,通过实现自适应的mid来进行查找
        //当left>right或者findValue比最小值小或者findValue比最大值要大，说明没有找到findValue
        if (left > right || findValue < arr[left] || findValue > arr[right]) {
            return -1;
        }
        //获取自适应的mid值
        int mid = left + (right - left) * (findValue - arr[left]) / (arr[right] - arr[left]);
        if (findValue > arr[mid]) {
            return insertValueSearch(arr, mid + 1, right, findValue);
        } else if (findValue < arr[mid]) {
            return insertValueSearch(arr, left, mid - 1, findValue);
        } else {
            return mid;
        }
    }
}
