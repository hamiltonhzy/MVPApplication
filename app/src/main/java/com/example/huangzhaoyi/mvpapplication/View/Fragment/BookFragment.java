package com.example.huangzhaoyi.mvpapplication.View.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.huangzhaoyi.mvpapplication.Contract.BookContract;
import com.example.huangzhaoyi.mvpapplication.Event.BookEvent;
import com.example.huangzhaoyi.mvpapplication.R;
import com.example.huangzhaoyi.mvpapplication.Utils.BusProvider;
import com.squareup.otto.Subscribe;

/**
 * View层的实现，负责UI展示
 * Created by huangzhaoyi on 2016/5/20.
 */
public class BookFragment extends Fragment implements BookContract.View, View.OnClickListener {
    private BookContract.Presenter mPresenter;
    private TextView mTxvBookName;
    private Button mBtnTest;

    public static BookFragment newInstance() {
        BookFragment fragment = new BookFragment();
        return fragment;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BusProvider.getInstance().register(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.book_fragment_layout, container, false);
        this.mTxvBookName = (TextView) root.findViewById(R.id.txvBookName);
        this.mBtnTest = (Button) root.findViewById(R.id.btnTest);
        this.mBtnTest.setOnClickListener(this);
        setRetainInstance(true);
        return root;
    }

    @Override
    public void onDestroy() {
        BusProvider.getInstance().unregister(this);
        super.onDestroy();
    }

    @Override
    public void setPresenter(BookContract.Presenter presenter) {
        this.mPresenter = presenter;
    }

    public void showBookName(String bookName) {
        this.mTxvBookName.setText(bookName);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnTest) {
            if (mPresenter != null) {
                this.mPresenter.start();
            }
        }
    }

    @Subscribe
    public void onEvent(BookEvent event) {
        Object[] params = event.getParams();
        switch (event.getEventId()) {
            case BookEvent.EVENT_SHOW_BOOKNAME:
                String bookName = (String) params[0];
                showBookName(bookName);
                break;
            default:
                break;
        }
    }
}
