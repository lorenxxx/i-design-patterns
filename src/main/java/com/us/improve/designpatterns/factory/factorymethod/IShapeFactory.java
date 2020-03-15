package com.us.improve.designpatterns.factory.factorymethod;

/**
 * @ClassName IShapeFactory
 * @Desciption 形状工厂抽象
 * @Author loren
 * @Date 2020/3/15 9:31 PM
 * @Version 1.0
 **/
public interface IShapeFactory {

    /**
     * 生产
     */
    IShape produce();

}
