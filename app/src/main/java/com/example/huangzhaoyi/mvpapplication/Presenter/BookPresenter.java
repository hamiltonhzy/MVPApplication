package com.example.huangzhaoyi.mvpapplication.Presenter;

import com.example.huangzhaoyi.mvpapplication.Contract.BookContract;
import com.example.huangzhaoyi.mvpapplication.Entity.Book;
import com.example.huangzhaoyi.mvpapplication.Event.BookEvent;
import com.example.huangzhaoyi.mvpapplication.Utils.BusProvider;

/**
 * Created by huangzhaoyi on 2016/5/20.
 */
public class BookPresenter extends BookContract.Presenter {

    @Override
    public void loadData() {
        Book book = mModel.getBookItem();
        if (book != null) {
            BookEvent event = new BookEvent(BookEvent.EVENT_SHOW_BOOKNAME);
            event.setParams(new Object[]{book.getBookName()});
            BusProvider.getInstance().post(event);
        }
    }

    @Override
    public void start() {
        loadData();
    }

    @Override
    public void onDestroy() {

    }
}
