package com.mvp.presenter;


import com.mvp.base.BasePresenter;
import com.mvp.base.DataModel;
import com.mvp.callback.MainCallBack;
import com.mvp.model.MainModel;
import com.mvp.view.MainView;

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
