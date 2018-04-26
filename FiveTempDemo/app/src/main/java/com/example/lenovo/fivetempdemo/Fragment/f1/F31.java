package com.example.lenovo.fivetempdemo.Fragment.f1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.lenovo.fivetempdemo.R;
import com.example.lenovo.fivetempdemo.ReMenShiPin.Adapter.MyHotAdapter;
import com.example.lenovo.fivetempdemo.ReMenShiPin.Bean.HotVideoBean;
import com.example.lenovo.fivetempdemo.ReMenShiPin.ItemFenge.MyDecoration;
import com.example.lenovo.fivetempdemo.ReMenShiPin.Presenter.MyHotPresenter;
import com.example.lenovo.fivetempdemo.ReMenShiPin.View.MyViewHot;

import java.util.List;

;

/**
 * Created by lenovo on 2018/4/23.
 */

public class F31 extends Fragment implements MyViewHot{
    private MyHotPresenter myHotPresenter;
    private RecyclerView hotvideo_recy1;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.f31,container,false);

        hotvideo_recy1 = view.findViewById(R.id.hotvideo_recy);
       HotVideo();//热门请求方法
        

        return view;
    }
    //请求热门方法
    public void HotVideo(){
        myHotPresenter = new MyHotPresenter(this);
        //热门展示列表布局  瀑布流
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        hotvideo_recy1.setLayoutManager(staggeredGridLayoutManager);
        myHotPresenter.reteleHotVideo("1","android","android","101");
        //给每个Item添加分割线
        hotvideo_recy1.addItemDecoration(new MyDecoration(getActivity(),MyDecoration.VERTICAL_LIST));

    }
  //热门请求成功接口方法
    @Override
    public void setSuccess(HotVideoBean hotVideoBean) {
        Log.i("sss",hotVideoBean.getMsg()+"++++++++++");
        Toast.makeText(getActivity(),hotVideoBean.getMsg(),Toast.LENGTH_SHORT).show();

        List<HotVideoBean.DataBean> data = hotVideoBean.getData();
        Log.i("zzz",data.get(0).getCover());
        MyHotAdapter myHotAdapter= new MyHotAdapter(data,getContext());
        hotvideo_recy1.setAdapter(myHotAdapter);
        //RecyclerView每个Item点击事件  来获取视频
        myHotAdapter.setOnRestulItem(new MyHotAdapter.setClickItemRestul() {
            @Override
            public void setOnItemListent(String videoUrl) {

            }
        });
    }
//热门视频请求失败方法
    @Override
    public void setError(String msg) {
        Log.i("xxx",msg+"王八蛋");
        Toast.makeText(getActivity(),msg,Toast.LENGTH_SHORT).show();
    }

}
