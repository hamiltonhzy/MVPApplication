package com.example.huangzhaoyi.mvpapplication.Model;

import com.example.huangzhaoyi.mvpapplication.Contract.UserContract;

/**
 * Created by huangzhaoyi on 2016/7/12.
 */
public class UserModel implements UserContract.Model {

    @Override
    public boolean login() {
        return true;
    }
}
