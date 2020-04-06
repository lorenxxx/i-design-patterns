package com.us.improve.designpatterns.prototype.shallow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Dog
 * @Desciption 狗
 * @Author loren
 * @Date 2020/4/6 8:50 PM
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog implements Cloneable {

    private String name;

    private int age;

    private DogFood dogFood;

    @Override
    public Dog clone() {
        Dog dog = null;
        try {
            // 浅拷贝实现: 直接调用Object的clone()方法
            dog = (Dog) super.clone();

            // 深拷贝实现: 自定义实现
//            dog.setName(new String(this.getName()));
//            dog.setDogFood(new DogFood(this.getDogFood().getName()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return dog;
    }

}
