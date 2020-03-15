package com.us.improve.designpatterns.factory.abstractfactory;

/**
 * @ClassName RedLineFactory
 * @Desciption 具体工厂：红色直线工厂
 * @Author loren
 * @Date 2020/3/15 9:51 PM
 * @Version 1.0
 **/
public class RedLineFactory implements IAbstractFactory {

    @Override
    public IColor produceColor() {
        return new Red();
    }

    @Override
    public IShape produceShape() {
        return new Line();
    }

}
