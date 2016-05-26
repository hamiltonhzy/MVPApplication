package com.example.huangzhaoyi.mvpapplication.Contract;

import com.example.huangzhaoyi.mvpapplication.Presenter.BasePresenter;
import com.example.huangzhaoyi.mvpapplication.View.BaseView;

/**
 * Created by huangzhaoyi on 2016/5/20.
 */
public interface BookContract {

    interface View extends BaseView<Presenter> {
        // 显示书名
        void showBookName(String bookName);
    }

    interface Presenter extends BasePresenter {
        // 加载数据
        void loadData();
    }
}
