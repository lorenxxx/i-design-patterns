package com.us.improve.designpatterns.memento;

/**
 * Created by Loren on 2018/11/6.
 */
public class MainTest {

    public static void main(String[] args) {
        // 构建一个负责任用于保存备忘录
        Caretaker caretaker = new Caretaker();

        // 构建我们初始的位置
        Originator originator = new Originator(1, 1);

        // 然后x方向前进一步
        originator.x++;

        // 保存当前位置
        caretaker.memento = originator.save();
        System.out.println("当前的位置在：x=" + originator.x + "  y=" + originator.y);

        //然后随便走
        originator.x++;
        originator.x++;
        originator.y++;
        //当前位置
        System.out.println("当前的位置在：x=" + originator.x + "  y=" + originator.y);

        //回到历史位置
        originator.restore(caretaker.memento);

        //当前位置
        System.out.println("当前的位置在：x=" + originator.x + "  y=" + originator.y);
    }

}
