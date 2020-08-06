package com.itcast.demo.day08.hashTable;

/**
 * 哈希表结构的实现
 *
 * @author lichunmiao
 * @date 2020/6/15
 */
public class HashTab {
    //哈希表是数组+链表的结构;一个哈希表对象中有多个链表,所以定义一个数组对象
    private EmpLinkedList[] empList;
    //定义哈希表中链表的数量
    private int maxSize;

    public HashTab(int maxSize) {
        this.maxSize = maxSize;
        empList = new EmpLinkedList[maxSize];
        for (int i = 0; i < empList.length; i++) {
            empList[i] = new EmpLinkedList();
        }
    }

    /**
     * 哈希表中添加雇员
     *
     * @param employee
     */
    public void add(Employee employee) {
        //估计雇员Id确定雇员要放在哪条链表中
        int hash = hash(employee.getId());
        empList[hash].add(employee);
    }

    /**
     * 遍历哈希表中的元素
     */
    public void traverse() {
        for (int i = 0; i < maxSize; i++) {
            System.out.println("第" + (i + 1) + "条链表中的雇员信息为:");
            empList[i].traverse();
        }
    }

    /**
     * 雇员id的hash算法,按照取模来确定雇员应添加到哪条链表当中
     *
     * @param id
     * @return
     */
    public int hash(int id) {
        return id % maxSize;
    }
}
