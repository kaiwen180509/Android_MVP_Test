package com.inquirereward.presenter;


import com.inquirereward.base.BasePresenter;
import com.inquirereward.base.DataModel;
import com.inquirereward.callback.MainCallBack;
import com.inquirereward.model.MainModel;
import com.inquirereward.view.MainView;

public class MainPresenter extends BasePresenter<MainView> {

    public void getData(final String params) {
        // 檢查 View 是否連接
        if (!isViewAttached()) {
            return;
        }

        // 調用 Model 取得資料
        DataModel.request(MainModel.class).params(params).execute(new MainCallBack<String>() {
            @Override
            public void setTextView() {
                getView().setData(params);
            }

            @Override
            public void onComplete() {

            }
        });
    }
}
