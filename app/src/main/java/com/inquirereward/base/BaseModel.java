package com.inquirereward.base;

import com.inquirereward.callback.MainCallBack;

public abstract class BaseModel<T> {
    // 參數
    protected String[] mParams;

    // 設置 Model 的參數
    public BaseModel params(String... args) {
        mParams = args;
        return this;
    }

    // 將 MainCallBack 交給子類別實作
    public abstract void execute(MainCallBack<T> callback);
}