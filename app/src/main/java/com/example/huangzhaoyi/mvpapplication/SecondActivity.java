package com.example.huangzhaoyi.mvpapplication;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.TextView;

import com.example.huangzhaoyi.mvpapplication.Contract.UserContract;
import com.example.huangzhaoyi.mvpapplication.Model.UserModel;
import com.example.huangzhaoyi.mvpapplication.Presenter.UserPresenter;

public class SecondActivity extends BaseActivity<UserPresenter, UserModel> implements UserContract.View {
    private TextView mTxvUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mPresenter.login();
            }
        }, 5000);
    }

    @Override
    public void initView() {
        this.mTxvUserName = (TextView) findViewById(R.id.txvUserName);
    }

    @Override
    public void initPresenter() {
        this.mPresenter.setVM(mContext, this, mModel);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_second;
    }

    @Override
    public void setPresenter(UserContract.Presenter presenter) {

    }

    @Override
    public void showName(String name) {
        if (!TextUtils.isEmpty(name)) {
            this.mTxvUserName.setText(name);
        }
    }
}
