package com.itcast.demo.day11;

/**
 * @author lichunmiao
 * @date 2020/6/29
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        //创建一棵树
        HeroNode heroNode1 = new HeroNode(1, "宋江");
        HeroNode heroNode2 = new HeroNode(2, "无用");
        HeroNode heroNode3 = new HeroNode(3, "卢俊义");
        HeroNode heroNode4 = new HeroNode(4, "林冲");
        HeroNode heroNode5 = new HeroNode(5, "关胜");
        heroNode1.setLeft(heroNode2);
        heroNode1.setRight(heroNode3);
        heroNode3.setLeft(heroNode5);
        heroNode3.setRight(heroNode4);
        BinaryTree binaryTree = new BinaryTree(heroNode1);
        System.out.println("=========前序===========");
        binaryTree.preOrder();
        System.out.println("=========中序===========");
        binaryTree.infixOrder();
        System.out.println("=========后序===========");
        binaryTree.postOrder();

    }
}
