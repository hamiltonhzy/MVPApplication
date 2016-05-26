package com.example.huangzhaoyi.mvpapplication.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.huangzhaoyi.mvpapplication.Contract.BookContract;
import com.example.huangzhaoyi.mvpapplication.R;

/**
 * Created by huangzhaoyi on 2016/5/20.
 */
public class BookFragment extends Fragment implements BookContract.View {
    private BookContract.Presenter mPresenter;
    private TextView mTxvBookId;

    public static BookFragment newInstance() {
        BookFragment fragment = new BookFragment();
        return fragment;
    }

    @Override
    public void onResume() {
        super.onResume();
        this.mPresenter.start();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.book_fragment_layout, container, false);
        this.mTxvBookId = (TextView) root.findViewById(R.id.txvBookId);
        setRetainInstance(true);
        return root;
    }

    @Override
    public void setPresenter(BookContract.Presenter presenter) {
        if (presenter != null) {
            mPresenter = presenter;
        }
    }

    @Override
    public void showBookName(String bookName) {
        this.mTxvBookId.setText(bookName);
    }
}
