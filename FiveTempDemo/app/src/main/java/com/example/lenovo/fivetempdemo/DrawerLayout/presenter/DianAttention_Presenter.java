package com.example.lenovo.fivetempdemo.DrawerLayout.presenter;

import com.example.lenovo.fivetempdemo.DrawerLayout.model.DianAttention_Model;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.DianAttention_View;

/**
 * Created by lenovo on 2018/4/27.
 */

public class DianAttention_Presenter {
    DianAttention_Model dianAttention_model;
    DianAttention_View dianAttention_view;

    public DianAttention_Presenter(DianAttention_View dianAttention_view) {
        this.dianAttention_view = dianAttention_view;
        dianAttention_model=new DianAttention_Model();
    }
    public void getDianAttentionPresenter(String token, String uid, String source, String appVersion,String followId){
        dianAttention_model.getDianAttentionModel(token, uid, source, appVersion,followId);
        dianAttention_model.getSetOnListener(new DianAttention_Model.SetOnListener() {
            @Override
            public void OnSuccess(String mag) {
                dianAttention_view.OnSuccess(mag);
            }

            @Override
            public void OnErrorr(String msg) {
                dianAttention_view.OnErrorr(msg);
            }
        });
    }
}
