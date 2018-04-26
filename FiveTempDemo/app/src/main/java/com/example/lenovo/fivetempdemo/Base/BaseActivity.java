package com.example.lenovo.fivetempdemo.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by dell on 2018/3/14.
 */

public abstract class BaseActivity<P> extends AppCompatActivity {

    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        presenter = getPresenter();
        initView();
        getData();
    }

    public abstract int getLayout();

    public abstract P getPresenter();

    public abstract void initView();

    public abstract void getData();

}
