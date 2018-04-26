package com.example.lenovo.fivetempdemo.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.lenovo.fivetempdemo.Fragment.f1.F11;
import com.example.lenovo.fivetempdemo.Fragment.f1.F12;
import com.example.lenovo.fivetempdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/4/23.
 */

public class Fragment1 extends Fragment {

    private F11 f11;
    private F12 f12;
    private List<Fragment> list;
    String[] name = {"热门", "关注"};
    private TabLayout mTablayout;
    private ViewPager mViewpager;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        initView(view);
        f11 = new F11();
        f12 = new F12();
        list = new ArrayList<>();
        list.add(f11);
        list.add(f12);
        mTablayout.setupWithViewPager(mViewpager);

        mTablayout.setTabMode(TabLayout.MODE_FIXED);
        mViewpager.setAdapter(new FragmentPagerAdapter(getActivity().getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return name[position];
            }
        });


        return view;
    }

    private void initView(View view) {
        mTablayout = (TabLayout) view.findViewById(R.id.tablayout);
        mViewpager = (ViewPager) view.findViewById(R.id.viewpager);
    }
}
