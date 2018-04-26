package com.example.lenovo.fivetempdemo.DrawerLayout.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Drawer_Info;
import com.example.lenovo.fivetempdemo.R;

import java.util.List;


/**
 * Created by lenovo on 2018/4/24.
 */

public class Drawer_Adapter extends RecyclerView.Adapter<Drawer_Adapter.DrawerViewHolder> {
    Context context;
    List<Drawer_Info> list;
    private View inflate;

    public Drawer_Adapter(Context context, List<Drawer_Info> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public DrawerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        inflate = LayoutInflater.from(context).inflate(R.layout.drawerlayout_rlv, parent, false);
        DrawerViewHolder drawerViewHolder=new DrawerViewHolder(inflate);
        return drawerViewHolder;
    }

    @Override
    public void onBindViewHolder(DrawerViewHolder holder, int position) {
        final Drawer_Info drawerInfo = list.get(position);
        holder.imageView.setImageResource(drawerInfo.getImg());
        holder.textView.setText(drawerInfo.getName());

        inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(setOnItemListener!=null){
                    setOnItemListener.OnSuccess(drawerInfo.getName());
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DrawerViewHolder extends RecyclerView.ViewHolder{

        private final ImageView imageView;
        private final TextView textView;

        public DrawerViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.drawer_img);
            textView = itemView.findViewById(R.id.drawer_text);
        }
    }

    public interface setOnItemListener{
        void OnSuccess(String name);
    }
    setOnItemListener setOnItemListener;
    public void getsetOnItemListener(setOnItemListener setOnItemListener){

        this.setOnItemListener=setOnItemListener;
    }

}
