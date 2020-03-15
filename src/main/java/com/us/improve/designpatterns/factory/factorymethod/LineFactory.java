package com.us.improve.designpatterns.factory.factorymethod;

/**
 * @ClassName LineFactory
 * @Desciption 直线工厂
 * @Author loren
 * @Date 2020/3/15 9:33 PM
 * @Version 1.0
 **/
public class LineFactory implements IShapeFactory {

    @Override
    public IShape produce() {
        return new Line();
    }

}
