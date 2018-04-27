package com.example.lenovo.fivetempdemo.DrawerLayout.presenter;

import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.MyAttention_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.model.MyAttention_Model;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.MyAttention_View;

/**
 * Created by lenovo on 2018/4/26.
 */

public class MyAttention_Presenter {
    MyAttention_Model attention_model;
    MyAttention_View attention_view;

    public MyAttention_Presenter(MyAttention_View attention_view) {
        this.attention_view = attention_view;
        attention_model=new MyAttention_Model();
    }

    public void getAttentionPresenter(String token, String uid, String source,String appVersion){
        attention_model.getAttentionModel(token, uid, source, appVersion);
        attention_model.getSetOnListener(new MyAttention_Model.setOnListener() {
            @Override
            public void OnSuccess(MyAttention_Info attention_info) {
                attention_view.OnSuccess(attention_info);
            }
        });


    }
}
