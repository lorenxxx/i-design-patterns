package com.us.improve.designpatterns.factory.abstractfactory;

/**
 * @ClassName Client
 * @Desciption 客户端
 * @Author loren
 * @Date 2020/3/15 9:53 PM
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        IAbstractFactory abstractFactory;
        IColor color;
        IShape shape;

        abstractFactory = new RedLineFactory();
        color = abstractFactory.produceColor();
        shape = abstractFactory.produceShape();

        color.display();
        shape.display();

        System.out.println();

        abstractFactory = new BlueSquareFactory();
        color = abstractFactory.produceColor();
        shape = abstractFactory.produceShape();

        color.display();
        shape.display();

        // Q：如果需要红色正方形工厂怎么办？
        // A：增加一个具体工厂角色，用于生产红色和正方形
    }

}
