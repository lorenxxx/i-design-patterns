package com.us.improve.designpatterns.z_zone.toilet;

import lombok.Data;

/**
 * @ClassName ToiletContext
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 3:16 PM
 * @Version 1.0
 **/
@Data
public class ToiletContext {

    private Toilet toilet;

    private IState state;

    private IState stateOccupy;

    private IState stateRelease;

    public void occupy() {
        state.occupy(this);
    }

    public void release() {
        state.release(this);
    }

}
