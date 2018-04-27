package com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Adapter;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Bean.C_Bean_duanzi;
import com.example.lenovo.fivetempdemo.HomePage.Home_Adapter.H_Adapter_tuijian;
import com.example.lenovo.fivetempdemo.R;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by lenovo on 2018/4/27.
 */

public class C_Adapter_duanzi extends RecyclerView.Adapter{

    private List<C_Bean_duanzi.DataBean> data;
    private Context context;
    private boolean fals = true;

    public C_Adapter_duanzi(List<C_Bean_duanzi.DataBean> data, Context context) {
        this.data = data;
        this.context = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.c_adapter_duanzi_iten, parent, false);
        MyduanziViewHodel myduanziViewHodel = new MyduanziViewHodel(inflate);
        return myduanziViewHodel;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final MyduanziViewHodel myduanziViewHodel = (MyduanziViewHodel) holder;

        //头像
        C_Bean_duanzi.DataBean.UserBean user = data.get(position).getUser();

        if (user.getIcon()!=null){
            Uri uri = Uri.parse(data.get(position).getUser().getIcon());
            AbstractDraweeController build = Fresco.newDraweeControllerBuilder()
                    .setUri(uri)
                    .setTapToRetryEnabled(true)
                    .build();
            myduanziViewHodel.img.setController(build);
        }

//        if (Uri.parse(data.get(position).getUser().getIcon())==null){
//            myduanziViewHodel.img.setImageResource(R.mipmap.touxiang);
//
//        }else {
//
//        }
        //name
        if (data.get(position).getUser().getNickname()!=null){
            myduanziViewHodel.tv_name.setText(data.get(position).getUser().getNickname());
        }
        //时间
        myduanziViewHodel.tv_sj.setText(data.get(position).getCreateTime());
        //评论
        if (data.get(position).getContent()!=null){
            myduanziViewHodel.tv_nr.setText(data.get(position).getContent()+"");
        }


        //属性动画
        myduanziViewHodel.img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fals){
                    //fals = false;
                    ObjectAnimator animato = ObjectAnimator.ofFloat( myduanziViewHodel.img1, "rotation", 0f, 180f);
                    animato.setDuration(1000);
                    animato.start();
//                ObjectAnimator ani = ObjectAnimator.ofFloat( myViewHolder.img1, "alpha", 1f, 0f);
//                ani.setDuration(1000);//时间1s
//                ani.start();
//                ObjectAnimator ani21 = ObjectAnimator.ofFloat( myViewHolder.img1, "alpha", 0f, 1f);
//                ani21.setDuration(1000);//时间1s
//                ani21.start();
                    ObjectAnimator animator = ObjectAnimator.ofFloat( myduanziViewHodel.img2, "alpha", 1f, 0f, 1f);
                    animator.setDuration(1000);//时间1s
                    animator.start();
                    ObjectAnimator animator2 = ObjectAnimator.ofFloat( myduanziViewHodel.img2, "rotation", 0f, 360f, 0f);
                    animator2.setDuration(1000);
                    animator2.start();
                    ObjectAnimator animator3 = ObjectAnimator.ofFloat( myduanziViewHodel.img2, "translationX", 0f, -90f);
                    animator3.setDuration(1000);
                    animator3.start();
                    ObjectAnimator ani1 = ObjectAnimator.ofFloat( myduanziViewHodel.img3, "alpha", 1f, 0f, 1f);
                    ani1.setDuration(1000);//时间1s
                    ani1.start();
                    ObjectAnimator ani2 = ObjectAnimator.ofFloat(myduanziViewHodel.img3, "rotation", 0f, 360f, 0f);
                    ani2.setDuration(1000);
                    ani2.start();
                    ObjectAnimator ani3 = ObjectAnimator.ofFloat(myduanziViewHodel.img3, "translationX", 0f, -180f);
                    ani3.setDuration(1000);
                    ani3.start();
                    ObjectAnimator anim1 = ObjectAnimator.ofFloat(myduanziViewHodel.img4, "alpha", 1f, 0f, 1f);
                    anim1.setDuration(1000);//时间1s
                    anim1.start();
                    ObjectAnimator anim2 = ObjectAnimator.ofFloat(myduanziViewHodel.img4, "rotation", 0f, 360f, 0f);
                    anim2.setDuration(1000);
                    anim2.start();
                    ObjectAnimator anim3 = ObjectAnimator.ofFloat(myduanziViewHodel.img4, "translationX", 0f, -270f);
                    anim3.setDuration(1000);
                    anim3.start();
                }else {
                    fals =true;
                    ObjectAnimator anima = ObjectAnimator.ofFloat(myduanziViewHodel.img1, "rotation", 180f, 0f);
                    anima.setDuration(1000);
                    anima.start();
//                ObjectAnimator ani = ObjectAnimator.ofFloat(myViewHolder.img1, "alpha", 0f, 1f);
//                ani.setDuration(1000);//时间1s
//                ani.start();
//                ObjectAnimator ani21 = ObjectAnimator.ofFloat(myViewHolder.img1, "alpha", 1f, 0f);
//                ani21.setDuration(1000);//时间1s
//                ani21.start();
                    ObjectAnimator animator = ObjectAnimator.ofFloat(myduanziViewHodel.img2, "alpha", 1f, 0f);
                    animator.setDuration(1000);//时间1s
                    animator.start();
                    ObjectAnimator animator2 = ObjectAnimator.ofFloat(myduanziViewHodel.img2, "rotation", 0f, 360f, 0f);
                    animator2.setDuration(1000);
                    animator2.start();
                    ObjectAnimator animator3 = ObjectAnimator.ofFloat(myduanziViewHodel.img2, "translationX", -90f, 0f);
                    animator3.setDuration(1000);
                    animator3.start();
                    ObjectAnimator ani1 = ObjectAnimator.ofFloat(myduanziViewHodel.img3, "alpha", 1f, 0f);
                    ani1.setDuration(1000);//时间1s
                    ani1.start();
                    ObjectAnimator ani2 = ObjectAnimator.ofFloat(myduanziViewHodel.img3, "rotation", 0f, 360f, 0f);
                    ani2.setDuration(1000);
                    ani2.start();
                    ObjectAnimator ani3 = ObjectAnimator.ofFloat(myduanziViewHodel.img3, "translationX", -180f, 0f);
                    ani3.setDuration(1000);
                    ani3.start();
                    ObjectAnimator anim1 = ObjectAnimator.ofFloat(myduanziViewHodel.img4, "alpha", 1f, 0f);
                    anim1.setDuration(1000);//时间1s
                    anim1.start();
                    ObjectAnimator anim2 = ObjectAnimator.ofFloat(myduanziViewHodel.img4, "rotation", 0f, 360f, 0f);
                    anim2.setDuration(1000);
                    anim2.start();
                    ObjectAnimator anim3 = ObjectAnimator.ofFloat(myduanziViewHodel.img4, "translationX", -270f, 0f);
                    anim3.setDuration(1000);
                    anim3.start();
                }


            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyduanziViewHodel extends RecyclerView.ViewHolder{

        private final SimpleDraweeView img;
        private final TextView tv_name;
        private final TextView tv_sj;
        private final TextView tv_nr;

        private final ImageView img1;
        private final ImageView img2;
        private final ImageView img3;
        private final ImageView img4;

        public MyduanziViewHodel(View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.c_duanzi_img);
            tv_name = itemView.findViewById(R.id.c_duanzi_name);
            tv_sj = itemView.findViewById(R.id.c_duanzi_sj);
            tv_nr = itemView.findViewById(R.id.c_duanzi_nr);

            //属性动画
            img1 = itemView.findViewById(R.id.h_tuijian_img1);
            img2 = itemView.findViewById(R.id.h_tuijian_img2);
            img3 = itemView.findViewById(R.id.h_tuijian_img3);
            img4 = itemView.findViewById(R.id.h_tuijian_img4);

        }
    }
}
