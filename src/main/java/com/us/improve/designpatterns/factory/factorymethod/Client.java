package com.us.improve.designpatterns.factory.factorymethod;

/**
 * @ClassName Client
 * @Desciption 客户端
 * @Author loren
 * @Date 2020/3/15 9:34 PM
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        IShapeFactory shapeFactory;
        IShape shape;

        shapeFactory = new LineFactory();
        shape = shapeFactory.produce();
        shape.display();

        shapeFactory = new SquareFactory();
        shape = shapeFactory.produce();
        shape.display();
    }

}
