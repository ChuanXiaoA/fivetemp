package com.example.lenovo.fivetempdemo.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Bean.C_Bean_duanzi;
import com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_I_View.C_I_duanzi;
import com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Presenter.C_Presenter_duanzi;
import com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Adapter.C_Adapter_duanzi;
import com.example.lenovo.fivetempdemo.R;
import com.example.lenovo.fivetempdemo.Utils.AutoUtils;

import java.util.List;


/**
 * Created by lenovo on 2018/4/23.
 */

public class Fragment2 extends Fragment implements C_I_duanzi{
    private View view;
    private RecyclerView mF2Rlv;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        initView(view);
        AutoUtils.auto(view);
        C_Presenter_duanzi c_presenter_duanzi = new C_Presenter_duanzi(this);
        c_presenter_duanzi.getduanzi();

        return view;
    }

    private void initView(View view) {
        mF2Rlv = (RecyclerView) view.findViewById(R.id.f2_rlv);
        mF2Rlv.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    //段子成功
    @Override
    public void success(C_Bean_duanzi c_bean_duanzi) {
        List<C_Bean_duanzi.DataBean> data = c_bean_duanzi.getData();

        if (c_bean_duanzi.getCode().equals("0")){
            Toast.makeText(getActivity(),c_bean_duanzi.getMsg(),Toast.LENGTH_LONG).show();

            C_Adapter_duanzi c_adapter_duanzi = new C_Adapter_duanzi(data,getActivity());
            mF2Rlv.setAdapter(c_adapter_duanzi);

        }else {
            Toast.makeText(getActivity(),c_bean_duanzi.getMsg(),Toast.LENGTH_LONG).show();
        }


    }
    //段子失败
    @Override
    public void failure() {

    }
}
