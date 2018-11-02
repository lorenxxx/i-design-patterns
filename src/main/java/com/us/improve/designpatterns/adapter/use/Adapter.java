package com.us.improve.designpatterns.adapter.use;

/**
 * 适配器-将手电筒转换为灯光
 *
 * Created by Loren on 2018/11/2.
 */
public class Adapter implements Target {

    private Torch torch;

    public Adapter(Torch torch) {
        this.torch = torch;
    }

    public void light() {
        System.out.println(torch.light());
    }

}
