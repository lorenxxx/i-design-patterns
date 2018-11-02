package com.us.improve.designpatterns.adapter.use;

/**
 * Created by Loren on 2018/11/2.
 */
public class MainTest {

    public static void main(String[] args) {
        // 现在我们有电灯Lamp、手电筒Torch
        // 我们现在需要光线，于是我们点亮电灯
        Target lamp = new Lamp();
        lamp.light();

        // 但是现在电灯坏了，我们需要用手电筒造个灯
        Torch torch = new Torch();
        Target unrealLamp = new Adapter(torch);

        unrealLamp.light();
    }

}