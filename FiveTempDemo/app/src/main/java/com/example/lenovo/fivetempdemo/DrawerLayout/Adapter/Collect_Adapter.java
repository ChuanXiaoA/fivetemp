package com.example.lenovo.fivetempdemo.DrawerLayout.Adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Collect_Info;
import com.example.lenovo.fivetempdemo.R;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

/**
 * Created by lenovo on 2018/4/27.
 */

public class Collect_Adapter extends RecyclerView.Adapter<Collect_Adapter.Collect_ViewHolder> {
    Context context;
    List<Collect_Info.DataBean> data;

    public Collect_Adapter(Context context, List<Collect_Info.DataBean> data) {
        this.context = context;
        this.data = data;
    }
    boolean flag=true;
    @Override
    public Collect_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.h_adapter_tuijian_item, parent, false);
        Collect_ViewHolder collect_viewHolder=new Collect_ViewHolder(inflate);
        return collect_viewHolder;
    }

    @Override
    public void onBindViewHolder(final Collect_ViewHolder holder, int position) {
        Collect_Info.DataBean dataBean = data.get(position);
        Collect_Info.DataBean.UserBean user = dataBean.getUser();
        String icon = user.getIcon();
        Uri uri = Uri.parse(icon);
        AbstractDraweeController build = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setTapToRetryEnabled(true)
                .build();
        holder.draweeView.setController(build);
        holder.textView1.setText(user.getNickname());
        holder.textView2.setText(dataBean.getCreateTime());
        holder.textView3.setText("张狂不是我的本性,但是惹我就等于自杀!");
        holder.jcVideoPlayer.setUp(dataBean.getVideoUrl(),"嫂子闭眼睛");


        holder.imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==true){
                    holder.imageView15.setImageResource(R.mipmap.liangxin);
                    flag=false;
                    Toast.makeText(context, "已点赞", Toast.LENGTH_SHORT).show();
                }else if(flag==false){
                    holder.imageView15.setImageResource(R.mipmap.huixin);
                    flag=true;
                    Toast.makeText(context, "已取消", Toast.LENGTH_SHORT).show();
                }
            }
        });

        holder.imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==true){
                    holder.imageView16.setImageResource(R.mipmap.liangxing);
                    flag=false;

                }else if(flag==false){
                    holder.imageView16.setImageResource(R.mipmap.huixing);
                    flag=true;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Collect_ViewHolder extends RecyclerView.ViewHolder{

        private final SimpleDraweeView draweeView;
        private final TextView textView1;
        private final TextView textView2;
        private final TextView textView3;
        private final ImageView imageView4;
        private final ImageView imageView3;
        private final ImageView imageView2;
        private final ImageView imageView1;
        private final JCVideoPlayer jcVideoPlayer;
        private final TextView textView4;
        private final TextView textView5;
        private final ImageView imageView15;
        private final ImageView imageView16;
        private final ImageView imageView17;
        private final ImageView imageView18;

        public Collect_ViewHolder(View itemView) {
            super(itemView);
            draweeView = itemView.findViewById(R.id.h_tuijian_img);
            textView1 = itemView.findViewById(R.id.h_tuijian_tv_name);
            textView2 = itemView.findViewById(R.id.h_tuijian_tv_sj);
            textView3 = itemView.findViewById(R.id.h_tuijian_tv_ping);
            imageView4 = itemView.findViewById(R.id.h_tuijian_img4);
            imageView3 = itemView.findViewById(R.id.h_tuijian_img3);
            imageView2 = itemView.findViewById(R.id.h_tuijian_img2);
            imageView1 = itemView.findViewById(R.id.h_tuijian_img1);
            jcVideoPlayer = itemView.findViewById(R.id.h_tuijian_vv);
            textView4 = itemView.findViewById(R.id.h_tuijian_tv_p1);
            textView5 = itemView.findViewById(R.id.h_tuijian_tv_p2);
            imageView15 = itemView.findViewById(R.id.imageView15);
            imageView16 = itemView.findViewById(R.id.imageView16);
            imageView17 = itemView.findViewById(R.id.imageView17);
            imageView18 = itemView.findViewById(R.id.imageView18);

        }
    }
}
