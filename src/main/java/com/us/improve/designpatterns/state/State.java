package com.us.improve.designpatterns.state;

/**
 * 抽象状态类
 *
 * Created by Loren on 2018/11/2.
 */
public interface State {

    /**
     * 加热的行为
     *
     * @param context
     */
    void heat(Context context);

    /**
     * 冷却
     *
     * @param context
     */
    void ice(Context context);

}
