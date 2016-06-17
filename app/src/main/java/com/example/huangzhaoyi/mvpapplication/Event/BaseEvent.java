package com.example.huangzhaoyi.mvpapplication.Event;

/**
 * Created by huangzhaoyi on 2016/6/17.
 */
public abstract class BaseEvent {
    private int eventId;
    private Object[] params;

    public BaseEvent(int eventId) {
        this.eventId = eventId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }
}
