package com.example.huangzhaoyi.mvpapplication.Contract;

import com.example.huangzhaoyi.mvpapplication.Model.BaseModel;
import com.example.huangzhaoyi.mvpapplication.Presenter.BasePresenter;
import com.example.huangzhaoyi.mvpapplication.View.BaseView;

/**
 * Created by huangzhaoyi on 2016/7/12.
 */
public interface UserContract {

    interface Model extends BaseModel {
        boolean login();
    }

    interface View extends BaseView<Presenter> {
        void showName(String name);
    }

    abstract class Presenter extends BasePresenter<Model, View> {

        public abstract void login();
    }
}
