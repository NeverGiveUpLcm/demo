package com.itcast.demo.day08;

import java.util.Arrays;

/**
 * 斐波那契查找实现
 *
 * @author lichunmiao
 * @date 2020/6/12
 */
public class FibSearch {
    public static int maxSize = 20;

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,15,18,20};
        int index = fibSearch(arr, 12);
        System.out.println(index);
    }

    public static int fibSearch(int[] arr, int findValue) {
        //定义要查询数组的起始索引
        int low = 0;
        //定义要查询数字的截止索引
        int high = arr.length - 1;
        //获取一个斐波那契数列
        int[] fib = getFib();
        //要确定可以使用的斐波那契数列中的某个值,确定k的值
        //表示斐波那契分割数值的下标
        int k = 0;
        //存放每次拆分的mid值
        int mid = 0;
        //要查询的数组长度要小于等于斐波那契数列中的某个值
        while (arr.length > fib[k]) {
            k++;
        }
        //确定K之后,要将查询数据的长度补全到k
        int[] arrNew = Arrays.copyOf(arr, fib[k]);
        for (int i = high + 1; i < arrNew.length; i++) {
            arrNew[i] = arrNew[high];
        }
        //使用while循环处理,帮助我们找到要找到的key
        while (true) {
            //当low > high的时候,跳出while循环,说明没有找到
            if (low > high){
                return -1;
            }
            //动态mid,相当于斐波那契数列中的k分为[k-1] 和[k-2]所对应的中间值
            mid = low + fib[k - 1] - 1;
            //判断findValue和[mid]的大小
            //如果findValue比[mid]小,说明要从mid的左边开始寻找
            if (findValue < arrNew[mid]) {
                high = mid - 1;
                //这里为什么要-1呢？
                //当我们从mid的左边寻找的时候,其实就已经将斐波那契数列拆分了
                //F(K) = F(k-1) + F(K-2);
                //我们在左面寻找到的数组长度范围其实就是[low-->F(k-1)]
                //接下来其实就是我们要对F(k-1)进行拆分来获取中间值mid
                k -= 1;
            } else
                //如果findValue比[mid]大,说明要从mid的右边开始寻找
                if (findValue > arrNew[mid]) {
                    low = mid + 1;
                    //同样的为什么要-2呢？
                    //因为在mid的右边查找，要寻找的数组的长度其实就是F(k-2);
                    //只不过右面的数组的范围变成了[mid + 1 -----> high]
                    //数组的length其实还是F(k-2)
                    k -= 2;
                } else
                    //如果findValue等于[mid],说明找到了
                    if (findValue == arrNew[mid]) {
                        //mid可能存在于数组扩容后的数据当中[1,2,3,4,5,5,5],可能找到的mid在5号索引
                        if (mid < arr.length) {
                            return mid;
                        }
                        if (mid >= arr.length) {
                            return arr.length - 1;

                        }
                    } else {
                        return -1;
                    }
        }


    }

    /**
     * 创建一个长度为maxSize的斐波那契数列
     *
     * @return 返回一个斐波那契数列
     */
    public static int[] getFib() {
        //斐波那契数列满足一个长度为n的有序数列
        //数列中的值满足 F(n) = F(n-1) + F(n-2) 这样的条件
        //非递归方法得到一个斐波那契数列
        int[] fibArr = new int[maxSize];
        fibArr[0] = 1;
        fibArr[1] = 1;
        for (int i = 2; i < maxSize; i++) {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }
        return fibArr;
    }

}
