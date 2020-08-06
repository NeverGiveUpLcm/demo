package com.itcast.demo.day13;

/**
 * 二叉树
 *
 * @author lichunmiao
 * @date 2020/7/14
 */
public class BinaryTree {
    /**
     * 首先定义一个根节点
     */
    private HeroNode root;

    public HeroNode getRoot() {
        return root;
    }

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    public BinaryTree(HeroNode root) {
        this.root = root;
    }

    /**
     * 前序遍历二叉树
     *
     * @param current 子树的父节点
     */
    public void preorderTraversal(HeroNode current) {
        if (root == null) {
            return;
        }
        //前序遍历二叉树,首先遍历父节点
        System.out.println("当前节点为:" + current);
        if (current.getLeft() != null) {
            preorderTraversal(current.getLeft());
        }
        if (current.getRight() != null) {
            preorderTraversal(current.getRight());
        }
    }

    /**
     * 中序遍历二叉树
     *
     * @param current 子树的父节点
     */
    public void inOrderTraversal(HeroNode current) {
        if (root == null) {
            return;
        }
        if (current.getLeft() != null) {
            inOrderTraversal(current.getLeft());
        }
        System.out.println("当前节点为:" + current);
        if (current.getRight() != null) {
            inOrderTraversal(current.getRight());
        }
    }

    /**
     * 后序遍历二叉树
     *
     * @param current 子树的父节点
     */
    public void postOrderTraversal(HeroNode current) {
        if (root == null) {
            return;
        }
        if (current.getLeft() != null) {
            postOrderTraversal(current.getLeft());
        }
        if (current.getRight() != null) {
            postOrderTraversal(current.getRight());
        }
        System.out.println("当前节点为:" + current);
    }

    /**
     * 前序查找节点
     *
     * @param heroNo  查找的节点no
     * @param current 当前父节点
     */
    public HeroNode preOrderSearch(int heroNo, HeroNode current) {
        System.out.println("前序查找================次数");
        if (root == null) {
            System.out.println("当前二叉树为空");
            return null;
        }
        //判断heroNo是否等于当前节点的HeroNo
        if (heroNo == current.getHeroNo()) {
            return current;
        }
        //定义一个变量来保存向左递归或者向右递归的返回值
        HeroNode resultNode = null;
        if (current.getLeft() != null) {
            resultNode = preOrderSearch(heroNo, current.getLeft());
        }
        if (resultNode != null) {
            return resultNode;
        }
        if (current.getRight() != null) {
            resultNode = preOrderSearch(heroNo, current.getRight());
        }
        return resultNode;
    }

    /**
     * 中序查找节点
     *
     * @param heroNo  查找的节点no
     * @param current
     * @return 当前父节点
     */
    public HeroNode midOrderSearch(int heroNo, HeroNode current) {
        if (root == null) {
            System.out.println("当前二叉树为空");
            return null;
        }
        //定义一个变量来接收左递归或者右递归查询的返回值
        HeroNode resultNode = null;
        if (current.getLeft() != null) {
            resultNode = midOrderSearch(heroNo, current.getLeft());
        }
        if (resultNode != null) {
            return resultNode;
        }
        //判断heroNo是否等于当前节点的HeroNo
        if (heroNo == current.getHeroNo()) {
            return current;
        }
        if (current.getRight() != null) {
            resultNode = midOrderSearch(heroNo, current.getRight());
        }
        return resultNode;
    }

    /**
     * 后序查找节点
     *
     * @param heroNo  查找的节点no
     * @param current
     * @return 当前父节点
     */
    public HeroNode postOrderSearch(int heroNo, HeroNode current) {
        if (root == null) {
            System.out.println("当前二叉树为空");
            return null;
        }
        HeroNode resultNode = null;
        if (current.getLeft() != null) {
            resultNode = postOrderSearch(heroNo, current.getLeft());
        }
        if (resultNode != null) {
            return resultNode;
        }
        if (current.getRight() != null) {
            resultNode = postOrderSearch(heroNo, current.getRight());
        }
        if (resultNode != null) {
            return resultNode;
        }
        //判断heroNo是否等于当前节点的HeroNo
        if (heroNo == current.getHeroNo()) {
            return current;
        }
        return null;
    }

}
