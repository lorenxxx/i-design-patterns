package com.us.improve.designpatterns.composite.use;

/**
 * Created by Loren on 2018/11/6.
 */
public class MainTest {

    public static void main(String[] args) {
        //初始化数据
        TypeA typeA = new TypeA();
        TypeB typeB = new TypeB();
        TypeB typeB2 = new TypeB();

        //构建数据结构
        //这个为根节点
        Composite root = new Composite(null);
        Composite typeAComposite = new Composite(typeA.createIterator());
        Composite typeBComposite = new Composite(typeB.createIterator());
        //当前这个节点是在A类型下的B类型数据
        Composite typeB2Composite = new Composite(typeB2.createIterator());
        root.list.add(typeAComposite);
        root.list.add(typeBComposite);
        typeAComposite.list.add(typeB2Composite);

        root.print();
    }

}
