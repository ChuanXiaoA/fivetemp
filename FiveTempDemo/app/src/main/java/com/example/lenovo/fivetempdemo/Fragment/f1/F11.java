package com.example.lenovo.fivetempdemo.Fragment.f1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lenovo.fivetempdemo.HomePage.Home_Adapter.H_Adapter_tuijian;
import com.example.lenovo.fivetempdemo.HomePage.Home_I_View.H_I_lunbo;
import com.example.lenovo.fivetempdemo.HomePage.Home_I_View.H_I_tuijian;
import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_lunbo;
import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_tuijian;
import com.example.lenovo.fivetempdemo.HomePage.Home_Presenter.H_Presenter_lunbo;
import com.example.lenovo.fivetempdemo.HomePage.Home_Presenter.H_Presenter_tuijian;
import com.example.lenovo.fivetempdemo.R;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/4/23.
 */

public class F11 extends Fragment implements H_I_lunbo , H_I_tuijian{

    private Banner mF11Banner;
    //轮播集合
    private List<String> imgs = new ArrayList<>();
    private View view;
    private RecyclerView mF11Rlv;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f11, container, false);
        //调用初始化
        initView(view);
        //轮播实现
        H_Presenter_lunbo h_presenter = new H_Presenter_lunbo(this);
        h_presenter.getlunbo();

        //推荐实现
        H_Presenter_tuijian h_presenter_tuijian = new H_Presenter_tuijian(this);
        h_presenter_tuijian.gettuijian();

        return view;
    }

    //初始化
    private void initView(View view) {
        mF11Banner = (Banner) view.findViewById(R.id.f11_Banner);
        mF11Rlv = (RecyclerView) view.findViewById(R.id.f11_rlv);
        //添加Android自带的分割线
        mF11Rlv.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        mF11Rlv.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    //轮播成功
    @Override
    public void success(H_Bean_lunbo h_bean_lunbo) {

        Log.i("xxx", "11111111----");

        //返回轮播集合
        List<H_Bean_lunbo.DataBean> data = h_bean_lunbo.getData();
        //清空集合
        imgs.clear();
        for (int i = 0; i < data.size(); i++) {
            String icon = data.get(i).getIcon();
            imgs.add(icon);
            Log.i("xxx", "11111111----111" + icon);
        }
        //一秒轮播
        mF11Banner.setDelayTime(1000);
        //加载图片
        mF11Banner.setImages(imgs);
        //图片加载框架

        mF11Banner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context).load(path).into(imageView);
            }
        });
        mF11Banner.start();
    }

    //推荐成功
    @Override
    public void success(H_Bean_tuijian h_bean_tuijian) {
        //
        Log.i("aa","99999");
        List<H_Bean_tuijian.DataBean> data = h_bean_tuijian.getData();

        H_Adapter_tuijian h_adapter_tuijian = new H_Adapter_tuijian(getActivity(),data);
        Log.i("aa","99999111");
        mF11Rlv.setAdapter(h_adapter_tuijian);
    }

    @Override
    public void failure1() {

    }

    //轮播失败
    @Override
    public void failure() {

    }
}