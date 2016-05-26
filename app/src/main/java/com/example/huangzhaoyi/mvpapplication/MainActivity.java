package com.example.huangzhaoyi.mvpapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.huangzhaoyi.mvpapplication.Fragment.BookFragment;
import com.example.huangzhaoyi.mvpapplication.Presenter.BookPresenter;
import com.example.huangzhaoyi.mvpapplication.Utils.ActivityUtils;

public class MainActivity extends AppCompatActivity {
    private BookFragment mBookFragment;
    private BookPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBookFragment = (BookFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);

        if (mBookFragment == null) {
            mBookFragment = BookFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), mBookFragment, R.id.contentFrame);
        }

        mPresenter = new BookPresenter(mBookFragment);
    }
}
