package com.example.lenovo.fivetempdemo.DrawerLayout.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Attention_Info;
import com.example.lenovo.fivetempdemo.R;

import java.util.List;

/**
 * Created by lenovo on 2018/4/26.
 */

public class Attention_Adapter extends RecyclerView.Adapter<Attention_Adapter.AttentionViewHolder>{
        Context context;
    List<Attention_Info.DataBean> data;
    private View inflate;

    public Attention_Adapter(Context context, List<Attention_Info.DataBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public AttentionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        inflate = LayoutInflater.from(context).inflate(R.layout.attention_item, parent, false);
        AttentionViewHolder attentionViewHolder=new AttentionViewHolder(inflate);
        return attentionViewHolder;
    }

    @Override
    public void onBindViewHolder(AttentionViewHolder holder, int position) {
        Attention_Info.DataBean dataBean = data.get(position);
        String nickname = dataBean.getNickname();
        String icon = dataBean.getIcon();
        String createtime = dataBean.getCreatetime();
        Glide.with(context).load(icon).into(holder.icon);
        holder.createtime.setText(createtime);
        holder.nickname.setText(nickname);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class AttentionViewHolder extends RecyclerView.ViewHolder{

        private final ImageView icon;
        private final TextView nickname;
        private final TextView createtime;

        public AttentionViewHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.icon);
            nickname = itemView.findViewById(R.id.nickname);
            createtime = itemView.findViewById(R.id.createtime);
        }
    }

}
