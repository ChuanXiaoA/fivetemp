package com.example.lenovo.fivetempdemo.DrawerLayout.presenter;

import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.SouSuo_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.model.SouSuo_Model;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.SouSuo_View;

/**
 * Created by lenovo on 2018/5/1.
 */

public class SouSuo_Presenter {


    SouSuo_Model souSuo_model;
    SouSuo_View souSuo_view;

    public SouSuo_Presenter(SouSuo_View souSuo_view) {
        this.souSuo_view = souSuo_view;
        souSuo_model=new SouSuo_Model();

    }

    public void getSouSuoPresenter(String source, String appVersion, String name){
        souSuo_model.getSouSuoModel(source,appVersion,name);
        souSuo_model.getSetOnListener(new SouSuo_Model.setOnListener() {
            @Override
            public void OnSuccess(SouSuo_Info souSuo_info) {
                souSuo_view.OnSuccess(souSuo_info);
            }
        });

    }
}
