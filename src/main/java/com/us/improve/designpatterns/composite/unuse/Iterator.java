package com.us.improve.designpatterns.composite.unuse;

/**
 * 抽象迭代器
 *
 * Created by Loren on 2018/11/6.
 */
public interface Iterator {

    /**
     * 用于判断是否还有下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 返回遍历的下一个元素
     *
     * @return
     */
    Object next();

}
