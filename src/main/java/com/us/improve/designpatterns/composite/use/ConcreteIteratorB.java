package com.us.improve.designpatterns.composite.use;

import java.util.List;

/**
 * 具体迭代器-B类型
 *
 * Created by Loren on 2018/11/6.
 */
public class ConcreteIteratorB implements Iterator {

    /**
     * 使用数组存放数据
     */
    private List<String> items;

    /**
     * 记录访问下标
     */
    private int index = 0;

    /**
     * 初始化
     */
    public ConcreteIteratorB(List<String> typeB){
        this.items = typeB;
    }

    public boolean hasNext() {
        if (index >= items.size()) {
            return false;
        }
        return true;
    }

    public Object next() {
        return items.get(index++);
    }

}
