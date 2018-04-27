package com.example.lenovo.fivetempdemo.DrawerLayout.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Seek_Random_Info;
import com.example.lenovo.fivetempdemo.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by lenovo on 2018/4/27.
 */

public class Seek_Random_Adapter extends RecyclerView.Adapter<Seek_Random_Adapter.Seek_Random_ViewHolder> {
    Context context;
    List<Seek_Random_Info.DataBean> data;
    private View inflate;
    boolean flag = true;

    public Seek_Random_Adapter(Context context, List<Seek_Random_Info.DataBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public Seek_Random_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        inflate = LayoutInflater.from(context).inflate(R.layout.random_item, parent, false);
        Seek_Random_ViewHolder seek_random_viewHolder = new Seek_Random_ViewHolder(inflate);
        return seek_random_viewHolder;
    }

    @Override
    public void onBindViewHolder(final Seek_Random_ViewHolder holder, int position) {
        Seek_Random_Info.DataBean dataBean = data.get(position);
        String username = dataBean.getUsername();
        String createtime = dataBean.getCreatetime();
        holder.name.setText(username);
        holder.time.setText(createtime);
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onButtonListener != null) {
                    onButtonListener.OnSuccess(holder.getLayoutPosition());
                }

                if (flag == true) {
                    holder.button.setText("取消关注");
                    flag = false;
                } else if (flag == false) {
                    holder.button.setText("+关注");
                    flag = true;
                }
            }

        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Seek_Random_ViewHolder extends RecyclerView.ViewHolder {

        private final TextView name;
        private final TextView time;
        private final Button button;

        public Seek_Random_ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            time = itemView.findViewById(R.id.time);
            button = itemView.findViewById(R.id.guanzhubtn);
        }
    }

    public interface OnButtonListener {
        void OnSuccess(int layoutPosition);
    }

    OnButtonListener onButtonListener;

    public void setOnButtonListener(OnButtonListener onButtonListener) {
        this.onButtonListener = onButtonListener;
    }
}
