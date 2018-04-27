package com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Presenter;

import com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Bean.C_Bean_duanzi;
import com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_I_View.C_I_duanzi;
import com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Model.C_Model_duanzi;
import com.example.lenovo.fivetempdemo.Fragment.Fragment2;

/**
 * Created by lenovo on 2018/4/27.
 */

public class C_Presenter_duanzi implements C_Model_duanzi.C_P_duanzi{

    private final C_Model_duanzi c_model_duanzi;
    private final C_I_duanzi c_i_duanzi;

    public C_Presenter_duanzi(C_I_duanzi c_i_duanzi) {
        this.c_i_duanzi =c_i_duanzi;
        c_model_duanzi = new C_Model_duanzi(this);
    }

    public void getduanzi() {
        c_model_duanzi.getduanzi();
    }

    @Override
    public void success(C_Bean_duanzi c_bean_duanzi) {
        c_i_duanzi.success(c_bean_duanzi);
    }

    @Override
    public void failure() {

    }
}
