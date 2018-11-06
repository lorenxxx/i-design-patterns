package com.us.improve.designpatterns.composite.unuse;

/**
 * 具体迭代器-A类型
 *
 * Created by Loren on 2018/11/6.
 */
public class ConcreteIteratorA implements Iterator {

    /**
     * 使用数组存放数据
     */
    private String[] iterms;

    /**
     * 记录访问下标
     */
    private int index = 0;

    /**
     * 初始化
     *
     * @param typeA
     */
    public ConcreteIteratorA(String[] typeA) {
        this.iterms = typeA;
    }

    public boolean hasNext() {
        if (index >= iterms.length) {
            return false;
        }

        return true;
    }

    public Object next() {
        return iterms[index++];
    }

}
