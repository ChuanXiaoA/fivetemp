package com.example.lenovo.fivetempdemo.ReMenShiPin.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lenovo.fivetempdemo.R;
import com.example.lenovo.fivetempdemo.ReMenShiPin.Bean.HotVideoBean;

import java.util.List;

/**
 * Created by zh on 2018/4/25.
 */

public class MyHotAdapter extends RecyclerView.Adapter<MyHotAdapter.MyHolder> {
    List<HotVideoBean.DataBean> data;
    Context context;
    private String videoUrl;
    private View view;

    public MyHotAdapter(List<HotVideoBean.DataBean> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.hot_video, parent, false);
        MyHolder myHolder=new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        Log.i("sss",data.get(position).getCover()+"++++______________");
        Glide.with(context).load(data.get(position).getCover()).into(holder.image);
        videoUrl = data.get(position).getVideoUrl();
        final int wid = data.get(position).getWid();

        view.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (clickItemRestul!=null){
                  clickItemRestul.setOnItemListent(videoUrl,wid+"");
                 }
             }
         });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private final ImageView image;

        public MyHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.hot_video_image);
        }
    }
     public interface setClickItemRestul{
        void setOnItemListent(String videoUrl,String wid);
     }
     setClickItemRestul clickItemRestul;
    public void setOnRestulItem(setClickItemRestul clickItemRestul){
          this.clickItemRestul=clickItemRestul;
    }
}
