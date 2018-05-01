package com.example.lenovo.fivetempdemo.DrawerLayout.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.SouSuo_Info;
import com.example.lenovo.fivetempdemo.R;

import java.util.List;

/**
 * Created by lenovo on 2018/5/1.
 */

public class SouSuo_Adapter extends RecyclerView.Adapter<SouSuo_Adapter.SouSuo_ViewHolder> {

    Context context;
    List<SouSuo_Info.DataBean> data;

    public SouSuo_Adapter(Context context, List<SouSuo_Info.DataBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public SouSuo_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.sousuo_item, parent, false);
        SouSuo_ViewHolder souSuo_viewHolder=new SouSuo_ViewHolder(inflate);
        return souSuo_viewHolder;
    }

    @Override
    public void onBindViewHolder(SouSuo_ViewHolder holder, int position) {
        SouSuo_Info.DataBean dataBean = data.get(position);
        String icon = dataBean.getIcon();
        String nickname = dataBean.getNickname();
        Glide.with(context).load(icon).into(holder.imageView);
        holder.textView.setText(nickname);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class SouSuo_ViewHolder extends RecyclerView.ViewHolder{

        private final ImageView imageView;
        private final TextView textView;

        public SouSuo_ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView9);
            textView = itemView.findViewById(R.id.textView2);

        }
    }
}
