package com.example.huangzhaoyi.mvpapplication.Utils;

import com.squareup.otto.Bus;

/**
 * EventBus事件总线类
 * Created by huangzhaoyi on 2016/6/17.
 */
public class BusProvider {
    private static final Bus mInstance = new Bus();

    public static Bus getInstance() {
        return mInstance;
    }
}
