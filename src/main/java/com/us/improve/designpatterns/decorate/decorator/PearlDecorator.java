package com.us.improve.designpatterns.decorate.decorator;

import com.us.improve.designpatterns.decorate.component.Beverage;

/**
 * 珍珠
 * 具体装饰类
 *
 * Created by Loren on 2018/10/30.
 */
public class PearlDecorator extends BeverageDecorator {

    private Beverage component;

    /**
     * 利用构造方法设置组件
     * @param component
     */
    public PearlDecorator(Beverage component) {
        this.component = component;
    }

    /**
     * 加上描述
     * @return
     */
    @Override
    public String getDescription() {
        return component.getDescription() + " + 珍珠";
    }

    /**
     * 加上价钱
     * @return
     */
    @Override
    public double getCost() {
        return component.getCost() + 2.0;
    }

}
