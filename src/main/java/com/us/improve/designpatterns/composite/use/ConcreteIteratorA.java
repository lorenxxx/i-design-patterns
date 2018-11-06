package com.us.improve.designpatterns.composite.use;

/**
 * 具体迭代器-A类型
 *
 * Created by Loren on 2018/11/6.
 */
public class ConcreteIteratorA implements Iterator {

    /**
     * 使用数组存放数据
     */
    private String[] items;

    /**
     * 记录访问下标
     */
    private int index = 0;

    /**
     * 初始化
     */
    public ConcreteIteratorA(String[] typeA){
        this.items = typeA;
    }

    public boolean hasNext() {
        if (index >= items.length) {
            return false;
        }
        return true;
    }

    public Object next() {
        return items[index++];
    }

}
