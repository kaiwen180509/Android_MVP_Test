package com.inquirereward.model;

import com.inquirereward.base.BaseModel;
import com.inquirereward.callback.MainCallBack;

public class MainModel extends BaseModel<String> {

    @Override
    public void execute(final MainCallBack<String> callback) {
        callback.setTextView();
    }
}