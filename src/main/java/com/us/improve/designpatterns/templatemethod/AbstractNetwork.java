package com.us.improve.designpatterns.templatemethod;

/**
 * @ClassName AbstractNetwork
 * @Desciption 抽象社交网络
 * @Author loren
 * @Date 2020/3/19 8:23 PM
 * @Version 1.0
 **/
public abstract class AbstractNetwork {

    /**
     * 定义算法框架
     *
     * final关键字，避免子类重写算法骨架
     */
    public final void postMsg(String msg) {
        login();
        sendData(msg);
        logout();
    }

    /**
     * 登录
     *
     * 抽象方法，需子类自己实现
     */
    protected abstract void login();

    /**
     * 发送数据
     *
     * 抽象方法，需子类自己实现
     *
     * @param data
     */
    protected abstract void sendData(String data);

    /**
     * 登出
     *
     * 抽象方法，需子类自己实现
     */
    protected abstract void logout();

}
