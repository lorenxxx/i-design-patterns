package com.us.improve.designpatterns.memento;

/**
 * 原发器
 *
 * Created by Loren on 2018/11/6.
 */
public class Originator {

    public int x;

    public int y;

    public Originator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Memento save() {
        return new Memento(this.x, this.y);
    }

    public void restore(Memento memento) {
        this.x = memento.x;
        this.y = memento.y;
    }

}
