package com.itcast.demo.day11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 二叉树
 *
 * @author lichunmiao
 * @date 2020/6/29
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BinaryTree {
    /**
     * 需要一个根节点
     */
    private HeroNode root;



    /**
     * 前序遍历
     */
    public void preOrder() {
        if (root == null) {
            System.out.println("当前树为空,无法进行遍历");
            return;
        }
        root.preOrder();
    }

    /**
     * 中序遍历
     */
    public  void infixOrder(){
        if (root == null) {
            System.out.println("当前树为空,无法进行遍历");
            return;
        }
        root.infixOrder();
    }

    /**
     * 后续遍历
     */
    public  void postOrder(){
        if (root == null) {
            System.out.println("当前树为空,无法进行遍历");
            return;
        }
        root.postOrder();
    }
}
