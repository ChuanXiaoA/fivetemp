package com.example.lenovo.fivetempdemo.Creation;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.lenovo.fivetempdemo.Base.BaseActivity;
import com.example.lenovo.fivetempdemo.R;
import com.example.lenovo.fivetempdemo.VideoActivity;

public class CreationActivity extends BaseActivity {

    /**
     * 取消
     */
    private TextView mQuxiao;
    private ImageView mLuzishipin;
    private ImageView mFabiaoduanzi;

    @Override
    public int getLayout() {
        return R.layout.activity_creation;
    }

    @Override
    public Object getPresenter() {


        return null;
    }

    @Override
    public void initView() {

        mQuxiao = findViewById(R.id.quxiao);
        mLuzishipin =  findViewById(R.id.luzishipin);
        mFabiaoduanzi = findViewById(R.id.fabiaoduanzi);
    }

    @Override
    public void getData() {
        mLuzishipin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CreationActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });
    }
}
