package com.us.improve.designpatterns.prototype.use;

import lombok.Data;

import java.util.Date;

/**
 * 具体原型类
 *
 * Created by Loren on 2018/11/16.
 */
@Data
public class ConcretePrototype implements Cloneable {

    private String name;

    private int age;

    private Date birthday;

    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void dis() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("birthday: " + birthday);
    }

}
