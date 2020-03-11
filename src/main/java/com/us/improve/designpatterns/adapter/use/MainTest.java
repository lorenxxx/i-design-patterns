package com.us.improve.designpatterns.adapter.use;

/**
 * @ClassName MainTest
 * @Desciption 测试类
 * @Author loren
 * @Date 2020/3/11 9:26 PM
 * @Version 1.0
 **/
public class MainTest {

    public static void main(String[] args) {
        IShape shape;

        shape = new Point();
        shape.display();

        shape = new Square();
        shape.display();

        // 无法满足IShape接口的多态特性，需要被适配
        //shape = new OldCircle();

        shape = new OldCircleAdapter();
        shape.display();
    }

}
