package com.example.lenovo.fivetempdemo.DrawerLayout.presenter;

import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Seek_Random_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.model.Random_Model;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.Seek_Random_View;

/**
 * Created by lenovo on 2018/4/27.
 */

public class Seek_Random_Presenter {

    Random_Model random_model;
    Seek_Random_View random_view;

    public Seek_Random_Presenter(Seek_Random_View random_view) {
        this.random_view = random_view;
        random_model=new Random_Model();
    }
    public void getRandomPresenter(String source,String appVersion){
        random_model.getRandomModel(source,appVersion);
        random_model.getSetOnListener(new Random_Model.setOnListener() {
            @Override
            public void OnSuccess(Seek_Random_Info random_info) {
                random_view.OnSuccess(random_info);
            }
        });
    }

}
