package com.us.improve.designpatterns.prototype.use;

import java.util.Date;

/**
 * 使用原型模式
 *
 * Created by Loren on 2018/11/16.
 */
public class MainTest {

    public static void main(String[] args) {
        ConcretePrototype prototypeA = new ConcretePrototype();
        prototypeA.setName("Loren");
        prototypeA.setAge(27);
        prototypeA.setBirthday(new Date());

        ConcretePrototype prototypeB = prototypeA.clone();

        ConcretePrototype prototypeC = prototypeA.clone();
        prototypeC.setAge(100);

        prototypeA.dis();
        prototypeB.dis();
        prototypeC.dis();
    }

}
