package com.itcast.demo.day13;

/**
 * @author lichunmiao
 * @date 2020/7/14
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         * 數組的特點是有序的，而且有下標，可以根據下標準確的查找到數據,但是對於增刪改操作就比較複雜,需要對數組進行copy操作
         * 效率較低
         * 鏈錶的話是以節點來存儲數據的,節點存儲了下個節點的地址,所以增刪改比較方法，但是查詢就比較複雜,需要從頭到尾進行遍歷查找
         * 二叉樹來存儲數據的話,對於增刪改查操作都有很大的效率的提升。
         */
        HeroNode heroNode1 = new HeroNode(1,"宋江");
        HeroNode heroNode2 = new HeroNode(2,"吴用");
        HeroNode heroNode3 = new HeroNode(3,"卢俊义");
        HeroNode heroNode4 = new HeroNode(4,"林冲");
        HeroNode heroNode5 = new HeroNode(5,"李逵");

        heroNode1.setLeft(heroNode2);
        heroNode1.setRight(heroNode3);
        heroNode3.setRight(heroNode4);
        heroNode3.setLeft(heroNode5);
        BinaryTree binaryTree = new BinaryTree(heroNode1);
//        System.out.println("前序遍历结果为:====================" );
//        binaryTree.preorderTraversal(heroNode1);
//        System.out.println("中序遍历结果为:====================" );
//        binaryTree.inOrderTraversal(heroNode1);
//        System.out.println("后序遍历结果为:====================" );
//        binaryTree.postOrderTraversal(heroNode1);
        /**
        //前序查找
        System.out.println("开始进行前序查找:========================");
        HeroNode resultNode1 = binaryTree.preOrderSearch(5, heroNode1);
        System.out.println("找到的节点为:" + resultNode1);
        **/
        //中序查找
        System.out.println("开始进行中序查找:========================");
        HeroNode resultNode2 = binaryTree.midOrderSearch(5, heroNode1);
        System.out.println("找到的节点为:" + resultNode2);
        /**
        //后序查找
        System.out.println("开始进行后序查找:========================");
        HeroNode resultNode3 = binaryTree.postOrderSearch(5, heroNode1);
        System.out.println("找到的节点为:" + resultNode3);
        **/

    }





}
