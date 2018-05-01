package com.example.lenovo.fivetempdemo.DrawerLayout.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.lenovo.fivetempdemo.R;

public class Setting_Activity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mActivitySgezhiImageBank;
    /**
     * 退出登录
     */
    private Button mActivityShezhiButtonFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        initView();
    }

    public void activity_bt_bank(View view) {

    }

    private void initView() {
        mActivitySgezhiImageBank =  findViewById(R.id.activity_sgezhi_image_bank);
        mActivityShezhiButtonFinish =findViewById(R.id.activity_shezhi_button_finish);
        mActivityShezhiButtonFinish.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.activity_shezhi_button_finish:
                startActivity(new Intent(Setting_Activity.this,Login_Activity.class));
                break;
        }
    }
}
