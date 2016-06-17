package com.example.huangzhaoyi.mvpapplication.Event;

/**
 * Created by huangzhaoyi on 2016/6/17.
 */
public class BookEvent extends BaseEvent {
    public static final int EVENT_SHOW_BOOKNAME = 1;

    public BookEvent(int eventId) {
        super(eventId);
    }
}
