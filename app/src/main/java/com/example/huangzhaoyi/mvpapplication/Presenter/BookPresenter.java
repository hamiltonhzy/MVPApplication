package com.example.huangzhaoyi.mvpapplication.Presenter;

import android.os.Handler;
import android.os.Message;

import com.example.huangzhaoyi.mvpapplication.Contract.BookContract;
import com.example.huangzhaoyi.mvpapplication.Model.Book;

/**
 * Created by huangzhaoyi on 2016/5/20.
 */
public class BookPresenter implements BookContract.Presenter {
    private BookContract.View mView;
    private Book mBook;

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String bookName = mBook.getBookName();
            mView.showBookName(bookName);
        }
    };

    public BookPresenter(BookContract.View view) {
        mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void start() {
        loadData();
    }

    @Override
    public void loadData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mBook = new Book();
                mBook.setBookId(1);
                mBook.setBookName("我欲封天");
                mHandler.sendEmptyMessage(0);
            }
        }).start();
    }


}
