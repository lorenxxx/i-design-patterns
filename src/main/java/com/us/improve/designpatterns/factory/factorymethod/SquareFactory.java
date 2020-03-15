package com.us.improve.designpatterns.factory.factorymethod;

/**
 * @ClassName SquareFactory
 * @Desciption 正方形工厂
 * @Author loren
 * @Date 2020/3/15 9:33 PM
 * @Version 1.0
 **/
public class SquareFactory implements IShapeFactory {

    @Override
    public IShape produce() {
        return new Square();
    }

}
