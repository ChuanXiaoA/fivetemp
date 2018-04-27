package com.example.lenovo.fivetempdemo.Fragment.f1;

import android.content.Intent;
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

import com.example.lenovo.fivetempdemo.FuJinVideo.Bean.Nearby_Bean;
import com.example.lenovo.fivetempdemo.FuJinVideo.Neaarby_Adapter.MyNearAdapter;
import com.example.lenovo.fivetempdemo.FuJinVideo.Nearby_Presenter.MyPreseNearby;
import com.example.lenovo.fivetempdemo.FuJinVideo.Nearby_View.MyNearbyView;
import com.example.lenovo.fivetempdemo.R;
import com.example.lenovo.fivetempdemo.ReMenShiPin.ItemFenge.MyDecoration;
import com.example.lenovo.fivetempdemo.ReMenShiPin.View.Activity.HotVideoActivity;

import java.util.List;


/**
 * Created by lenovo on 2018/4/23.
 */

public class F32 extends Fragment implements MyNearbyView {

    private RecyclerView deayby_recy;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f32, container, false);
        deayby_recy = view.findViewById(R.id.Dearby_Recy);
        //附近视频展示列表布局  瀑布流
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        deayby_recy.setLayoutManager(staggeredGridLayoutManager);
        //给每个Item添加分割线
        deayby_recy.addItemDecoration(new MyDecoration(getActivity(),MyDecoration.VERTICAL_LIST));
        MyPreseNearby myPreseNearby=new MyPreseNearby(this);
        myPreseNearby.resterNearby("android","android","101");
        return view;
    }

    @Override
    public void setNearbySuccess(Nearby_Bean nearby_bean) {
        Log.i("Nearby",nearby_bean.getMsg());
        List<Nearby_Bean.DataBean> data = nearby_bean.getData();
        MyNearAdapter myNearAdapter=new MyNearAdapter(data,getActivity());
        deayby_recy.setAdapter(myNearAdapter);
        myNearAdapter.setRetulstback(new MyNearAdapter.setNearbyRestultdata() {
            @Override
            public void setPostionBack(String wid) {
                Intent intent=new Intent(getActivity(), HotVideoActivity.class);
                intent.putExtra("wid",wid);
                startActivity(intent);
            }
        });
    }

    @Override
    public void setNearbyError(String msg) {
        Toast.makeText(getActivity(),msg,Toast.LENGTH_SHORT).show();
    }
}
