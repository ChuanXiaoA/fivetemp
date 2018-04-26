package com.example.lenovo.fivetempdemo.DrawerLayout.Activity;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.lenovo.fivetempdemo.Base.BaseActivity;
import com.example.lenovo.fivetempdemo.DrawerLayout.Adapter.Attention_Adapter;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Attention_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.presenter.Attention_Presenter;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.Attention_View;
import com.example.lenovo.fivetempdemo.R;
import com.example.lenovo.fivetempdemo.Utils.SPUtil;

import java.util.List;

public class Attention_Activity extends BaseActivity<Attention_Presenter> implements Attention_View {


    /**
     * 返回
     */
    private TextView mFanhui;
    /**
     * 我的关注
     */
    private TextView mMyguanzhu;
    /**
     * 热门关注
     */
    private TextView mRemenguanzhu;
    private RecyclerView mWodeguanzhurlv;

    @Override
    public int getLayout() {
        return R.layout.activity_attention;
    }

    @Override
    public Attention_Presenter getPresenter() {
        presenter = new Attention_Presenter(this);
        return presenter;
    }

    @Override
    public void initView() {

        mFanhui = findViewById(R.id.fanhui);
        mMyguanzhu =  findViewById(R.id.myguanzhu);
        mRemenguanzhu = findViewById(R.id.remenguanzhu);
        mWodeguanzhurlv =  findViewById(R.id.wodeguanzhurlv);
    }

    @Override
    public void getData() {
        SPUtil spUtil=new SPUtil(this,"SPU");
        String uid = spUtil.getString("uid", null);
        String token = spUtil.getString("token", null);

        presenter.getAttentionPresenter(token,uid,"android",String.valueOf(101));
        mWodeguanzhurlv.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void OnSuccess(Attention_Info attention_info) {
        List<Attention_Info.DataBean> data = attention_info.getData();
        mWodeguanzhurlv.setAdapter(new Attention_Adapter(this,data));
    }

}
