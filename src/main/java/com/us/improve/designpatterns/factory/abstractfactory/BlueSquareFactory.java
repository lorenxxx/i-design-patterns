package com.us.improve.designpatterns.factory.abstractfactory;

/**
 * @ClassName BlueSquareFactory
 * @Desciption 具体工厂：蓝色正方形工厂
 * @Author loren
 * @Date 2020/3/15 9:52 PM
 * @Version 1.0
 **/
public class BlueSquareFactory implements IAbstractFactory {

    @Override
    public IColor produceColor() {
        return new Blue();
    }

    @Override
    public IShape produceShape() {
        return new Square();
    }

}
