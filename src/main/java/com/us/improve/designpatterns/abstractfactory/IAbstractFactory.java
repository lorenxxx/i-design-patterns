package com.us.improve.designpatterns.abstractfactory;

/**
 * 抽象工厂角色
 *
 * Created by Loren on 2018/11/1.
 */
public interface IAbstractFactory {

    IAbstractProductFruit getFruit();

    IAbstractProductPack getPack();

}
