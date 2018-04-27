package com.example.lenovo.fivetempdemo.DrawerLayout.Activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.lenovo.fivetempdemo.Base.BaseActivity;
import com.example.lenovo.fivetempdemo.DrawerLayout.Adapter.Collect_Adapter;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Collect_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.presenter.Collect_Presenter;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.Collect_View;
import com.example.lenovo.fivetempdemo.R;
import com.example.lenovo.fivetempdemo.Utils.SPUtil;

import java.util.List;

public class Collect_Activity extends BaseActivity<Collect_Presenter> implements Collect_View {

    /**
     * 返回
     */
    private TextView mFanhui;
    /**
     * 我的收藏
     */
    private TextView mMyshoucang;
    /**
     * 删除
     */
    private TextView mShanchu;
    private RecyclerView mShoucangrlv;

    @Override
    public int getLayout() {
        return R.layout.activity_collect_;
    }

    @Override
    public Collect_Presenter getPresenter() {
        presenter=new Collect_Presenter(this);
        return presenter;
    }

    @Override
    public void initView() {

        mFanhui =  findViewById(R.id.fanhui);
        mMyshoucang =  findViewById(R.id.myshoucang);
        mShanchu =  findViewById(R.id.shanchu);
        mShoucangrlv =  findViewById(R.id.shoucangrlv);
    }

    @Override
    public void getData() {
        SPUtil spUti=new SPUtil(this,"SPU");
        String uid = spUti.getString("uid", null);
        String token = spUti.getString("token", null);
        presenter.getCollectPresenter(token,uid,"android",101+"");
        mShoucangrlv.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void OnSuccess(Collect_Info collect_info) {
        List<Collect_Info.DataBean> data = collect_info.getData();
        mShoucangrlv.setAdapter(new Collect_Adapter(this,data));
    }
}
