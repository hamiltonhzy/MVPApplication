package com.example.huangzhaoyi.mvpapplication;

import android.os.Bundle;

import com.example.huangzhaoyi.mvpapplication.View.Fragment.BookFragment;
import com.example.huangzhaoyi.mvpapplication.Model.BookModel;
import com.example.huangzhaoyi.mvpapplication.Presenter.BookPresenter;
import com.example.huangzhaoyi.mvpapplication.Utils.ActivityUtils;

public class MainActivity extends BaseActivity<BookPresenter, BookModel> {
    private BookFragment mBookFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        if (mBookFragment == null) {
            this.mBookFragment = BookFragment.newInstance();
            this.mBookFragment.setPresenter(mPresenter);
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), mBookFragment, R.id.contentFrame);
        }
    }

    @Override
    public void initPresenter() {
        this.mPresenter.setVM(mContext, mBookFragment, mModel);
    }

}
