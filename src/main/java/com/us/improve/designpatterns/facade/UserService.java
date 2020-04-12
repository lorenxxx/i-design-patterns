package com.us.improve.designpatterns.facade;

/**
 * @ClassName UserService
 * @Desciption 用户服务
 * @Author loren
 * @Date 2020/4/12 8:49 PM
 * @Version 1.0
 **/
public class UserService {

    public void createUser(String name) {
        System.out.println("User[" + name + "] created...");
    }

}
