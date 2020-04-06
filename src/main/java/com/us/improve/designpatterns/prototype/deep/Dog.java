package com.us.improve.designpatterns.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

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
public class Dog implements Serializable {

    private static final long serialVersionUID = 1523001236428418551L;

    private String name;

    private int age;

    private DogFood dogFood;

    @Override
    public Dog clone() {
        Dog dog = null;
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);
            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            return (Dog) oi.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dog;
    }

}
