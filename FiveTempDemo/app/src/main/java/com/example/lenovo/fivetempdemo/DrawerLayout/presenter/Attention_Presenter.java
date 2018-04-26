package com.example.lenovo.fivetempdemo.DrawerLayout.presenter;

import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Attention_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.model.Attention_Model;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.Attention_View;

/**
 * Created by lenovo on 2018/4/26.
 */

public class Attention_Presenter {
    Attention_Model attention_model;
    Attention_View attention_view;

    public Attention_Presenter(Attention_View attention_view) {
        this.attention_view = attention_view;
        attention_model=new Attention_Model();
    }

    public void getAttentionPresenter(String token, String uid, String source,String appVersion){
        attention_model.getAttentionModel(token, uid, source, appVersion);
        attention_model.getSetOnListener(new Attention_Model.setOnListener() {
            @Override
            public void OnSuccess(Attention_Info attention_info) {
                attention_view.OnSuccess(attention_info);
            }
        });


    }
}
