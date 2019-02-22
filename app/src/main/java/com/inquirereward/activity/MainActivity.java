package com.inquirereward.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.inquirereward.R;
import com.inquirereward.base.BaseActivity;
import com.inquirereward.base.BasePresenter;
import com.inquirereward.presenter.MainPresenter;
import com.inquirereward.view.MainView;

public class MainActivity extends BaseActivity implements MainView {
    private TextView text;
    private MainPresenter presenter;

    @Override
    protected BasePresenter getPresenter() {
        // 初始化 MainPresenter
        presenter = new MainPresenter();
        return presenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
    }

    @Override
    public void setData(String data) {
        text.setText(data);
    }

    // button 的 Click 事件
    public void changeData(View view) {
        presenter.getData("GG");
    }
}
