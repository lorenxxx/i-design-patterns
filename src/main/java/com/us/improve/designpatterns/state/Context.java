package com.us.improve.designpatterns.state;

/**
 * 环境类
 *
 * Created by Loren on 2018/11/2.
 */
public class Context {

    /**
     * 当前状态
     */
    private State state;

    private State concreteStateHot;

    private State concreteStateCold;

    private State concreteStateNormal;

    public Context(ConcreteStateHot concreteStateHot, ConcreteStateCold concreteStateCold, ConcreteStateNormal concreteStateNormal) {
        this.concreteStateHot = concreteStateHot;
        this.concreteStateCold = concreteStateCold;
        this.concreteStateNormal = concreteStateNormal;
    }

    /**
     * 加热
     */
    public void heat() {
        state.heat(this);
    }

    public void ice() {
        state.ice(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getConcreteStateHot() {
        return concreteStateHot;
    }

    public void setConcreteStateHot(State concreteStateHot) {
        this.concreteStateHot = concreteStateHot;
    }

    public State getConcreteStateCold() {
        return concreteStateCold;
    }

    public void setConcreteStateCold(State concreteStateCold) {
        this.concreteStateCold = concreteStateCold;
    }

    public State getConcreteStateNormal() {
        return concreteStateNormal;
    }

    public void setConcreteStateNormal(State concreteStateNormal) {
        this.concreteStateNormal = concreteStateNormal;
    }

}
