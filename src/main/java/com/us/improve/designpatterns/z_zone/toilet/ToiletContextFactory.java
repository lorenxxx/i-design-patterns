package com.us.improve.designpatterns.z_zone.toilet;

import com.us.improve.designpatterns.z_zone.toilet.enums.ToiletStateEnum;

/**
 * @ClassName ToiletContextFactory
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 3:51 PM
 * @Version 1.0
 **/
public class ToiletContextFactory {

    public static ToiletContext createToiletConext(Toilet toilet) {
        ToiletContext context = new ToiletContext();
        context.setToilet(toilet);

        IState stateOccupy = new StateOccupy();
        IState stateRelease = new StateRelease();

        context.setState(toilet.getState().equals(ToiletStateEnum.OCCUPY.getValue()) ? stateOccupy : stateRelease);
        context.setStateOccupy(stateOccupy);
        context.setStateRelease(stateRelease);

        return context;

    }

}
