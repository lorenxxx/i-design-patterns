package com.us.improve.designpatterns.templatemethod;

/**
 * @ClassName Facebook
 * @Desciption
 * @Author loren
 * @Date 2020/3/19 8:31 PM
 * @Version 1.0
 **/
public class Facebook extends AbstractNetwork {

    @Override
    protected void login() {
        System.out.println("Login Facebook, ok.");
    }

    @Override
    protected void sendData(String data) {
        System.out.println(data.toUpperCase());
    }

    @Override
    protected void logout() {
        System.out.println("Logout Facebook, ok");
    }

}

