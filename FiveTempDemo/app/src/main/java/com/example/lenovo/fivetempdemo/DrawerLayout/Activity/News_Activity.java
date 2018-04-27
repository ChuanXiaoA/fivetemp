package com.example.lenovo.fivetempdemo.DrawerLayout.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.lenovo.fivetempdemo.DrawerLayout.Fragmenr.News_Fragment;
import com.example.lenovo.fivetempdemo.DrawerLayout.Fragmenr.Private_Fragment;
import com.example.lenovo.fivetempdemo.R;

import java.util.ArrayList;
import java.util.List;

public class News_Activity extends AppCompatActivity {

    private TabLayout mXxtztab;
    private ViewPager mXxtzviewpager;
    private News_Fragment news_fragment;
    private Private_Fragment private_fragment;
    private List<Fragment> fragmentList;
    String[] strings={"消息","私信"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_);
        initView();
        getData();
    }

    private void getData() {
        news_fragment = new News_Fragment();
        private_fragment = new Private_Fragment();
        fragmentList = new ArrayList<>();
        fragmentList.add(news_fragment);
        fragmentList.add(private_fragment);
        mXxtztab.setTabMode(TabLayout.MODE_FIXED);
        mXxtztab.setupWithViewPager(mXxtzviewpager);
        mXxtzviewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }

            @Override
            public int getCount() {
                return fragmentList.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return strings[position];
            }
        });
    }

    private void initView() {
        mXxtztab =  findViewById(R.id.xxtztab);
        mXxtzviewpager =  findViewById(R.id.xxtzviewpager);
    }
}
