package com.itcast.demo.day13;

/**
 * 節點
 *
 * @author lichunmiao
 * @date 2020/7/14
 */
public class HeroNode {
    /**
     * 节点顺序
     */
    private Integer heroNo;
    /**、
     * 节点名称
     */
    private String name;

    /**
     * 左子节点
     */
    private HeroNode left;

    /**
     * 右子节点
     */
    private HeroNode right;

    public HeroNode(Integer heroNo, String name) {
        this.heroNo = heroNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    public Integer getHeroNo() {
        return heroNo;
    }

    public void setHeroNo(Integer heroNo) {
        this.heroNo = heroNo;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "name='" + name + '\'' +
                '}';
    }
}
