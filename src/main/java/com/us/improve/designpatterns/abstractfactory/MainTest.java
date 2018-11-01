package com.us.improve.designpatterns.abstractfactory;

/**
 * Created by Loren on 2018/11/1.
 */
public class MainTest {

    public static void main(String[] args) {
        // 如果需要一个红色包装的苹果，就使用工厂A
        IAbstractFactory factory = new ConcreteFactoryA();
        // 利用工厂生产产品
        IAbstractProductPack pack = factory.getPack();
        IAbstractProductFruit fruit = factory.getFruit();

        // 组合成最终需要的产品
        pack.dis();
        System.out.print(" ");
        fruit.dis();

        System.out.println();
        System.out.println("--------");

        // 如果需要一个蓝色包装的香蕉，就使用工厂B
        factory = new ConcreteFactoryB();

        // 利用工厂生产产品
        pack = factory.getPack();
        fruit = factory.getFruit();

        // 组合成最终需要的产品
        pack.dis();
        System.out.print(" ");
        fruit.dis();

        // Q：如果需要一个蓝色包装的苹果怎么办？
        // A：增加一个具体工厂角色，用于生产蓝色包装和苹果
    }

}
