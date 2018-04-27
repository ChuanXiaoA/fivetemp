package com.example.lenovo.fivetempdemo.HomePage.Home_Adapter;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_tuijian;
import com.example.lenovo.fivetempdemo.R;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

/**
 * Created by lenovo on 2018/4/26.
 */



public class H_Adapter_tuijian extends RecyclerView.Adapter {
    //属性动画
    private int a = 0;
    private ObjectAnimator animator;
    private ObjectAnimator fanimator;
    private ObjectAnimator animator1;
    private ObjectAnimator fanimator1;
    private ObjectAnimator animator2;
    private ObjectAnimator fanimator2;
    private ObjectAnimator animator3;
    private ObjectAnimator fanimator3;

    private Context context;
    private List<H_Bean_tuijian.DataBean> data;
    private View inflate;
    private boolean fals = true;

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
        final MyViewHolder myViewHolder = (MyViewHolder) holder;

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
        Uri uri = Uri.parse(data.get(position).getUser().getIcon());
        AbstractDraweeController build = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setTapToRetryEnabled(true)
                .build();
        myViewHolder.img.setController(build);
//        Glide.with(context)
//                .load(data.get(position).getUser().getIcon())
//                .into(myViewHolder.img);
        //视频
        myViewHolder.vv.setUp(data.get(position).getVideoUrl()+"",data.get(position).getWid()+"");

        //属性动画
        myViewHolder.img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fals){
                    fals = false;
                    ObjectAnimator animato = ObjectAnimator.ofFloat( myViewHolder.img1, "rotation", 0f, 180f);
                    animato.setDuration(1000);
                    animato.start();
//                ObjectAnimator ani = ObjectAnimator.ofFloat( myViewHolder.img1, "alpha", 1f, 0f);
//                ani.setDuration(1000);//时间1s
//                ani.start();
//                ObjectAnimator ani21 = ObjectAnimator.ofFloat( myViewHolder.img1, "alpha", 0f, 1f);
//                ani21.setDuration(1000);//时间1s
//                ani21.start();
                    ObjectAnimator animator = ObjectAnimator.ofFloat( myViewHolder.img2, "alpha", 1f, 0f, 1f);
                    animator.setDuration(1000);//时间1s
                    animator.start();
                    ObjectAnimator animator2 = ObjectAnimator.ofFloat( myViewHolder.img2, "rotation", 0f, 360f, 0f);
                    animator2.setDuration(1000);
                    animator2.start();
                    ObjectAnimator animator3 = ObjectAnimator.ofFloat( myViewHolder.img2, "translationX", 0f, -90f);
                    animator3.setDuration(1000);
                    animator3.start();
                    ObjectAnimator ani1 = ObjectAnimator.ofFloat( myViewHolder.img3, "alpha", 1f, 0f, 1f);
                    ani1.setDuration(1000);//时间1s
                    ani1.start();
                    ObjectAnimator ani2 = ObjectAnimator.ofFloat(myViewHolder.img3, "rotation", 0f, 360f, 0f);
                    ani2.setDuration(1000);
                    ani2.start();
                    ObjectAnimator ani3 = ObjectAnimator.ofFloat(myViewHolder.img3, "translationX", 0f, -180f);
                    ani3.setDuration(1000);
                    ani3.start();
                    ObjectAnimator anim1 = ObjectAnimator.ofFloat(myViewHolder.img4, "alpha", 1f, 0f, 1f);
                    anim1.setDuration(1000);//时间1s
                    anim1.start();
                    ObjectAnimator anim2 = ObjectAnimator.ofFloat(myViewHolder.img4, "rotation", 0f, 360f, 0f);
                    anim2.setDuration(1000);
                    anim2.start();
                    ObjectAnimator anim3 = ObjectAnimator.ofFloat(myViewHolder.img4, "translationX", 0f, -270f);
                    anim3.setDuration(1000);
                    anim3.start();
                }else {
                    fals =true;
                    ObjectAnimator anima = ObjectAnimator.ofFloat(myViewHolder.img1, "rotation", 180f, 0f);
                    anima.setDuration(1000);
                    anima.start();
//                ObjectAnimator ani = ObjectAnimator.ofFloat(myViewHolder.img1, "alpha", 0f, 1f);
//                ani.setDuration(1000);//时间1s
//                ani.start();
//                ObjectAnimator ani21 = ObjectAnimator.ofFloat(myViewHolder.img1, "alpha", 1f, 0f);
//                ani21.setDuration(1000);//时间1s
//                ani21.start();
                    ObjectAnimator animator = ObjectAnimator.ofFloat(myViewHolder.img2, "alpha", 1f, 0f);
                    animator.setDuration(1000);//时间1s
                    animator.start();
                    ObjectAnimator animator2 = ObjectAnimator.ofFloat(myViewHolder.img2, "rotation", 0f, 360f, 0f);
                    animator2.setDuration(1000);
                    animator2.start();
                    ObjectAnimator animator3 = ObjectAnimator.ofFloat(myViewHolder.img2, "translationX", -90f, 0f);
                    animator3.setDuration(1000);
                    animator3.start();
                    ObjectAnimator ani1 = ObjectAnimator.ofFloat(myViewHolder.img3, "alpha", 1f, 0f);
                    ani1.setDuration(1000);//时间1s
                    ani1.start();
                    ObjectAnimator ani2 = ObjectAnimator.ofFloat(myViewHolder.img3, "rotation", 0f, 360f, 0f);
                    ani2.setDuration(1000);
                    ani2.start();
                    ObjectAnimator ani3 = ObjectAnimator.ofFloat(myViewHolder.img3, "translationX", -180f, 0f);
                    ani3.setDuration(1000);
                    ani3.start();
                    ObjectAnimator anim1 = ObjectAnimator.ofFloat(myViewHolder.img4, "alpha", 1f, 0f);
                    anim1.setDuration(1000);//时间1s
                    anim1.start();
                    ObjectAnimator anim2 = ObjectAnimator.ofFloat(myViewHolder.img4, "rotation", 0f, 360f, 0f);
                    anim2.setDuration(1000);
                    anim2.start();
                    ObjectAnimator anim3 = ObjectAnimator.ofFloat(myViewHolder.img4, "translationX", -270f, 0f);
                    anim3.setDuration(1000);
                    anim3.start();
                }


            }
        });


    }

    @Override
    public int getItemCount() {
        Log.i("zz","--"+data.size());
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private final SimpleDraweeView img;
        private final TextView name;
        private final TextView sj;
        private final TextView ping;
        private final TextView p1;
        private final TextView p2;
        private final JCVideoPlayer vv;
        private final ImageView img1;
        private final ImageView img2;
        private final ImageView img3;
        private final ImageView img4;

        public MyViewHolder(View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.h_tuijian_img);

            //昵称
            name = itemView.findViewById(R.id.h_tuijian_tv_name);
            //时间
            sj = itemView.findViewById(R.id.h_tuijian_tv_sj);
            //视频
            vv = itemView.findViewById(R.id.h_tuijian_vv);
            //标题
            ping = itemView.findViewById(R.id.h_tuijian_tv_ping);
            //评论
            p1 = itemView.findViewById(R.id.h_tuijian_tv_p1);
            p2 = itemView.findViewById(R.id.h_tuijian_tv_p2);
            //属性动画
            img1 = itemView.findViewById(R.id.h_tuijian_img1);
            img2 = itemView.findViewById(R.id.h_tuijian_img2);
            img3 = itemView.findViewById(R.id.h_tuijian_img3);
            img4 = itemView.findViewById(R.id.h_tuijian_img4);

        }
    }

}
