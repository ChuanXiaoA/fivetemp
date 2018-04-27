package com.example.lenovo.fivetempdemo.FuJinVideo.Neaarby_Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lenovo.fivetempdemo.FuJinVideo.Bean.Nearby_Bean;
import com.example.lenovo.fivetempdemo.R;

import java.util.List;

/**
 * Created by zh on 2018/4/27.
 */

public class MyNearAdapter extends RecyclerView.Adapter<MyNearAdapter.MyHolder> {
    List<Nearby_Bean.DataBean> data;
    Context context;
    private View view;

    public MyNearAdapter(List<Nearby_Bean.DataBean> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.dearby_imag, parent, false);
        MyHolder myHolder=new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        Glide.with(context).load(data.get(position).getUser().getIcon()).into(holder.dear_ima);
        final int wid = data.get(position).getWid();
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nearbyRestultdata!=null){
                    nearbyRestultdata.setPostionBack(wid+"");
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private final ImageView dear_ima;

        public MyHolder(View itemView) {
            super(itemView);
            dear_ima = itemView.findViewById(R.id.dearby_image);
        }
    }
    public interface setNearbyRestultdata{
        void setPostionBack(String wid);
    }
    setNearbyRestultdata nearbyRestultdata;
    public void setRetulstback(setNearbyRestultdata nearbyRestultdata){
      this.nearbyRestultdata=nearbyRestultdata;
    }
}
