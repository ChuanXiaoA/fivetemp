package com.example.lenovo.fivetempdemo.DrawerLayout.presenter;


import com.example.lenovo.fivetempdemo.DrawerLayout.model.Reg_Model;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.Reg_View;

/**
 * Created by lenovo on 2018/4/25.
 */

public class Reg_Presenter {

    Reg_Model regModel;
    Reg_View regView;

    public Reg_Presenter(Reg_View regView) {
        this.regView = regView;
        regModel=new Reg_Model();
    }
    public void getRegPresenter11(String type,String mobile,String password){

        regModel.getRegModel(type,mobile,password);
        regModel.getSetOnReg(new Reg_Model.setOnReg() {
            @Override
            public void OnSuccess(String msg) {
                regView.OnSuccess(msg);
            }

            @Override
            public void OnErorr(String msg) {
                regView.OnErorr(msg);
            }
        });
    }
}
