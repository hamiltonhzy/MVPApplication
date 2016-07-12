package com.example.huangzhaoyi.mvpapplication.Presenter;

import com.example.huangzhaoyi.mvpapplication.Contract.UserContract;

/**
 * Created by huangzhaoyi on 2016/7/12.
 */
public class UserPresenter extends UserContract.Presenter {

    @Override
    public void start() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void login() {
        if (mModel.login()) {
            mView.showName("Core77");
        }
    }
}
