package com.us.improve.designpatterns.facade;

/**
 * @ClassName Client
 * @Desciption 客户端
 * @Author loren
 * @Date 2020/4/12 8:53 PM
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        String name = "Loren";

        // 不使用外观模式的调用方式
        UserService userService = new UserService();
        userService.createUser(name);
        WalletService walletService = new WalletService();
        walletService.createWallet();

        System.out.println();

        // 使用外观模式的调用方式
        UserWalletFacade userWalletFacade = new UserWalletFacade(userService, walletService);
        userWalletFacade.createUserAndWallet(name);
    }

}
