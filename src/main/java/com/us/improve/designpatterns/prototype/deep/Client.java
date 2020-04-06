package com.us.improve.designpatterns.prototype.deep;

/**
 * @ClassName Client
 * @Desciption TODO
 * @Author loren
 * @Date 2020/4/6 8:51 PM
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        DogFood dogFood = new DogFood("bone");
        Dog dog = new Dog("WangCai", 5, dogFood);

        Dog dogClone = dog.clone();
        // 对比
        System.out.println("对象和属性对比:");
        System.out.println(dog == dogClone);
        System.out.println("name(String): " + (dog.getName() == dogClone.getName()));
        System.out.println("age(): " + (dog.getAge() == dogClone.getAge()));
        System.out.println("dogFood(DogFood): " + (dog.getDogFood() == dogClone.getDogFood()));

        // 属性修改
        System.out.println("属性修改对比");
        dog.getDogFood().setName("boneX");
        System.out.println(dog.getDogFood().getName() + " Vs " + dogClone.getDogFood().getName());
    }

}
