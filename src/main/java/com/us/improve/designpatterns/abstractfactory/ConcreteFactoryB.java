package com.us.improve.designpatterns.abstractfactory;

/**
 * 具体工厂角色-能生产蓝色包装和香蕉
 *
 * Created by Loren on 2018/11/1.
 */
public class ConcreteFactoryB implements IAbstractFactory {

    public IAbstractProductFruit getFruit() {
        return new ConcreteProductBanana();
    }

    public IAbstractProductPack getPack() {
        return new ConcreteProductPackBlue();
    }

}
