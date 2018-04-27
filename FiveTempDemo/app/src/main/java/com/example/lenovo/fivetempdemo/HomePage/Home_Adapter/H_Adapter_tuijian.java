package com.example.lenovo.fivetempdemo.HomePage.Home_Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_tuijian;
import com.example.lenovo.fivetempdemo.R;

import java.util.List;

/**
 * Created by lenovo on 2018/4/26.
 */

public class H_Adapter_tuijian extends RecyclerView.Adapter {

    private Context context;
    private List<H_Bean_tuijian.DataBean> data;
    private View inflate;

    public H_Adapter_tuijian(Context context, List<H_Bean_tuijian.DataBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        inflate = LayoutInflater.from(context).inflate(R.layout.h_adapter_tuijian_item, parent, false);
        MyViewHolder myViewHolder=new MyViewHolder(inflate);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;

        //name
        if (data.get(position).getUser().getNickname()!=null){
            myViewHolder.name.setText(data.get(position).getUser().getNickname());
        }
        //时间
        myViewHolder.sj.setText(data.get(position).getCreateTime());
        //评论
        if (data.get(position).getWorkDesc()!=null){
            myViewHolder.ping.setText(data.get(position).getWorkDesc()+"");
        }
        //头像
        Glide.with(context)
                .load(data.get(position).getUser().getIcon())
                .into(myViewHolder.img);

    }

    @Override
    public int getItemCount() {
        Log.i("zz","--"+data.size());
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private final ImageView img;
        private final TextView name;
        private final TextView sj;
        private final TextView ping;
        private final TextView p1;
        private final TextView p2;

        public MyViewHolder(View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.h_tuijian_img);
            name = itemView.findViewById(R.id.h_tuijian_tv_name);
            sj = itemView.findViewById(R.id.h_tuijian_tv_sj);
            ping = itemView.findViewById(R.id.h_tuijian_tv_ping);
            p1 = itemView.findViewById(R.id.h_tuijian_tv_p1);
            p2 = itemView.findViewById(R.id.h_tuijian_tv_p2);

        }
    }

}
