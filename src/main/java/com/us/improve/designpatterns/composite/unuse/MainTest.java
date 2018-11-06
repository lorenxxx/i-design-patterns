package com.us.improve.designpatterns.composite.unuse;

/**
 * Created by Loren on 2018/11/6.
 */
public class MainTest {

    public static void main(String[] args) {
        // 我们现在需要类型A和类型B的数据
        TypeA typeA = new TypeA();
        TypeB typeB = new TypeB();

        Iterator iterator = typeA.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = typeB.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
