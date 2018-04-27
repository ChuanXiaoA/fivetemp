package com.example.lenovo.fivetempdemo.Creation;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.lenovo.fivetempdemo.Base.BaseActivity;
import com.example.lenovo.fivetempdemo.R;
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

    }
}
