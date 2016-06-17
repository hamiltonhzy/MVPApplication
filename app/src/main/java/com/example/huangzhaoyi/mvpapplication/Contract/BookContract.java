package com.example.huangzhaoyi.mvpapplication.Contract;

import com.example.huangzhaoyi.mvpapplication.Entity.Book;
import com.example.huangzhaoyi.mvpapplication.Model.BaseModel;
import com.example.huangzhaoyi.mvpapplication.Presenter.BasePresenter;
import com.example.huangzhaoyi.mvpapplication.View.BaseView;

/**
 * Created by huangzhaoyi on 2016/5/20.
 */
public interface BookContract {
    interface Model extends BaseModel {
        // 获取书
        Book getBookItem();
    }

    interface View extends BaseView<Presenter> {
    }

    abstract class Presenter extends BasePresenter<Model, View> {
        // 加载数据
        public abstract void loadData();
    }
}
