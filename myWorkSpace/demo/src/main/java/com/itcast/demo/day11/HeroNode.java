package com.itcast.demo.day11;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lichunmiao
 * @date 2020/6/29
 */
@Setter
@Getter
public class HeroNode {
    private Integer heroNo;
    private String HeroName;
    /**
     * 左节点
     */
    private HeroNode left;
    /**
     * 右节点
     */
    private HeroNode right;

    public HeroNode(Integer heroNo, String heroName) {
        this.heroNo = heroNo;
        HeroName = heroName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "heroNo=" + heroNo +
                ", HeroName='" + HeroName + '\'' +
                '}';
    }

    /**
     * 前序遍历
     */
    public void preOrder() {
        System.out.println("当前节点为:" + this);
        if (this.getLeft() != null) {
            this.getLeft().preOrder();
        }
        if (this.getRight() != null) {
            this.getRight().preOrder();
        }
    }

    /**
     * 中序遍历
     */
    public void infixOrder() {
        if (this.getLeft() != null) {
            this.getLeft().infixOrder();
        }
        System.out.println("当前节点为:" + this);
        if (this.getRight() != null) {
            this.getRight().infixOrder();
        }
    }

    /**
     * 后续遍历
     */
    public void postOrder() {
        if (this.getLeft() != null) {
            this.getLeft().postOrder();
        }
        if (this.getRight() != null) {
            this.getRight().postOrder();
        }
        System.out.println("当前节点为:" + this);
    }
}
