package com.example.huangzhaoyi.mvpapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.huangzhaoyi.mvpapplication.Model.BaseModel;
import com.example.huangzhaoyi.mvpapplication.Presenter.BasePresenter;
import com.example.huangzhaoyi.mvpapplication.Utils.TUtil;

/**
 * Created by huangzhaoyi on 2016/6/17.
 */
public abstract class BaseActivity<T extends BasePresenter, E extends BaseModel> extends AppCompatActivity {
    public Context mContext;
    public T mPresenter;
    public E mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext = this;
        this.mPresenter = TUtil.getT(this, 0);
        this.mModel = TUtil.getT(this, 1);
        this.setContentView(getLayoutId());
        initView();
        initPresenter();
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.onDestroy();
        }
        super.onDestroy();
    }

    public abstract void initView();

    /**
     * 简单页面无需mvp就不用管此方法即可,完美兼容各种实际场景的变通
     */
    public abstract void initPresenter();

    public abstract int getLayoutId();
}
