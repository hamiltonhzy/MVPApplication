package com.example.huangzhaoyi.mvpapplication.Model;

import com.example.huangzhaoyi.mvpapplication.Contract.BookContract;
import com.example.huangzhaoyi.mvpapplication.Entity.Book;

/**
 * Created by huangzhaoyi on 2016/6/17.
 */
public class BookModel implements BookContract.Model {

    @Override
    public Book getBookItem() {
        Book book = new Book();
        book.setBookId(1);
        book.setBookName("我欲封天");
        return book;
    }
}
