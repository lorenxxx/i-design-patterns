package com.us.improve.designpatterns.abstractfactory;

/**
 * 具体工厂角色-能生产红色包装和苹果的产品族
 *
 * Created by Loren on 2018/11/1.
 */
public class ConcreteFactoryA implements IAbstractFactory {

    public IAbstractProductFruit getFruit() {
        return new ConcreteProductApple();
    }

    public IAbstractProductPack getPack() {
        return new ConcreteProductPackRed();
    }

}
