package com.us.improve.designpatterns.factory.simplefactory;

/**
 * @ClassName Client
 * @Desciption 客户端
 * @Author loren
 * @Date 2020/3/15 9:22 PM
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        IShape shape;

        shape = ShapeFactory.createShape("line");
        shape.display();

        shape = ShapeFactory.createShape("square");
        shape.display();
    }

}
