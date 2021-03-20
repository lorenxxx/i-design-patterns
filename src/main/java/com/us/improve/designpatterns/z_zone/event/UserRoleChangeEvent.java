package com.us.improve.designpatterns.z_zone.event;

import lombok.Data;

/**
 * @ClassName UserRoleChangeEvent
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/9 4:52 PM
 * @Version 1.0
 **/
@Data
public class UserRoleChangeEvent implements IEvent {

    private Integer userId;

    private Integer roleId;

}
