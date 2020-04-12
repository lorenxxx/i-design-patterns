package com.us.improve.designpatterns.facade;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserWalletFacade
 * @Desciption 用户和钱包的外观
 * @Author loren
 * @Date 2020/4/12 8:52 PM
 * @Version 1.0
 **/
@NoArgsConstructor
@AllArgsConstructor
public class UserWalletFacade {

    private UserService userService;

    private WalletService walletService;

    public void createUserAndWallet(String name) {
        userService.createUser(name);
        walletService.createWallet();
    }

}
