package com.us.improve.designpatterns.decorate.decorator;

import com.us.improve.designpatterns.decorate.component.Beverage;

/**
 * 椰果
 * 具体装饰类
 *
 * Created by Loren on 2018/10/30.
 */
public class CoconutDecorator extends BeverageDecorator {

    private Beverage component;

    /**
     * 利用构造方法设置组件
     * @param component
     */
    public CoconutDecorator(Beverage component) {
        this.component = component;
    }

    /**
     * 加上描述
     * @return
     */
    @Override
    public String getDescription() {
        return component.getDescription() + " + 椰果";
    }

    /**
     * 加上价格
     * @return
     */
    @Override
    public double getCost() {
        return component.getCost() + 1.0;
    }

}
