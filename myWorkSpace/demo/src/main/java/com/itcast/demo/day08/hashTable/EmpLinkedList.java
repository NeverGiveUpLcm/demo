package com.itcast.demo.day08.hashTable;

/**
 * 雇员链表
 *
 * @author lichunmiao
 * @date 2020/6/15
 */
public class EmpLinkedList {
    //定义头结点
    private Employee head;

    /**
     * 链表添加方法
     *
     * @param employee 要添加的雇员
     */
    public void add(Employee employee) {
        //判断链表是否是空的
        if (head == null) {
            head = employee;
            return;
        }
        //链表不为空的话,找到链表的尾节点,将employee放在尾节点
        Employee temp = head;
        while (true) {
            //如果到尾节点,则直接跳出循环
            if (temp.getNext() == null) {
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(employee);
    }

    /**
     * 链表遍历的方法
     */
    public void traverse() {
        //判断链表是否为空
        if (head == null) {
            System.out.println("链表为空,无法进行遍历");
            return;
        }
        Employee temp = head;
        while(true){
            System.out.println("编号为" + temp.getId() + "的雇员信息为:" + temp);
            if (temp.getNext() == null){
                break;
            }
            temp = temp.getNext();
        }
    }
}
