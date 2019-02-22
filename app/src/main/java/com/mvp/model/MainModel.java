package com.mvp.model;

import com.mvp.base.BaseModel;
import com.mvp.callback.MainCallBack;

public class MainModel extends BaseModel<String> {

    @Override
    public void execute(final MainCallBack<String> callback) {
        callback.setTextView();
    }
}