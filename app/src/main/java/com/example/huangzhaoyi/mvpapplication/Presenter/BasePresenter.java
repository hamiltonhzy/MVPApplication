package com.example.huangzhaoyi.mvpapplication.Presenter;

import android.content.Context;

/**
 * Created by huangzhaoyi on 2016/5/20.
 */
public abstract class BasePresenter<E, T> {
    public Context mContext;
    public E mModel;
    public T mView;

    public void setVM(Context ctx, T v, E m) {
        this.mContext = ctx;
        this.mModel = m;
        this.mView = v;
    }

    public abstract void start();

    public abstract void onDestroy();
}
