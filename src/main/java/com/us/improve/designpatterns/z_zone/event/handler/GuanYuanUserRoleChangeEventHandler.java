package com.us.improve.designpatterns.z_zone.event.handler;

import com.us.improve.designpatterns.z_zone.event.IEvent;
import com.us.improve.designpatterns.z_zone.event.UserRoleChangeEvent;

/**
 * @ClassName GuanYuanUserRoleChangeEventHandler
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/9 5:10 PM
 * @Version 1.0
 **/
public class GuanYuanUserRoleChangeEventHandler extends AbstractEventConditionalHandler {

    @Override
    public boolean checkCondition(IEvent event) {
        if (event instanceof UserRoleChangeEvent) {
            UserRoleChangeEvent userRoleChangeEvent = (UserRoleChangeEvent) event;
            // 模拟条件判断
            if (userRoleChangeEvent.getRoleId().equals(1)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void doHandle(IEvent event) {
        // 做具体的业务
    }

}
