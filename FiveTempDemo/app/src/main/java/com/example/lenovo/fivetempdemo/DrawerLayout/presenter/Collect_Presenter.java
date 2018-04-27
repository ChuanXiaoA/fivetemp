package com.example.lenovo.fivetempdemo.DrawerLayout.presenter;

import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Collect_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.model.Collect_Model;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.Collect_View;

/**
 * Created by lenovo on 2018/4/27.
 */

public class Collect_Presenter {
    Collect_Model collect_model;
    Collect_View collect_view;

    public Collect_Presenter(Collect_View collect_view) {
        this.collect_view = collect_view;
        collect_model=new Collect_Model();
    }
    public void getCollectPresenter(String token, String uid, String source, String appVersion){
        collect_model.getCollectModel(token, uid, source, appVersion);
        collect_model.getSetOnListener(new Collect_Model.setOnListener() {
            @Override
            public void OnSuccess(Collect_Info collect_info) {
                collect_view.OnSuccess(collect_info);
            }
        });

    }
}
