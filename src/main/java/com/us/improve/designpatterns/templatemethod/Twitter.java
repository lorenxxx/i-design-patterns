package com.us.improve.designpatterns.templatemethod;

/**
 * @ClassName Twitter
 * @Desciption TODO
 * @Author loren
 * @Date 2020/3/19 8:33 PM
 * @Version 1.0
 **/
public class Twitter extends AbstractNetwork {

    @Override
    protected void login() {
        System.out.println("Login Twitter, ok.");
    }

    @Override
    protected void sendData(String data) {
        System.out.println(data.toLowerCase());
    }

    @Override
    protected void logout() {
        System.out.println("Logout Twitter, ok.");
    }

}
