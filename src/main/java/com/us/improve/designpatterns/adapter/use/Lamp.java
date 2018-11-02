package com.us.improve.designpatterns.adapter.use;

/**
 * 电灯
 *
 * Created by Loren on 2018/11/2.
 */
public class Lamp implements Target {

    private String light = "电灯的光线";

    public void light() {
        System.out.println(light);
    }

    public void setLight(String light) {
        this.light = light;
    }

}
