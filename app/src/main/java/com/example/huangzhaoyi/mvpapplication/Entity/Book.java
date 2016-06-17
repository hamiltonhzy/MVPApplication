package com.example.huangzhaoyi.mvpapplication.Entity;

import java.io.Serializable;

/**
 * Created by huangzhaoyi on 2016/5/20.
 */
public class Book implements Serializable {
    private int bookId;
    private String bookName;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
