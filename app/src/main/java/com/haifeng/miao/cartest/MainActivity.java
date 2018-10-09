package com.haifeng.miao.cartest;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.haifeng.miao.cartest.fragment.FourFragment;
import com.haifeng.miao.cartest.fragment.OneFragment;
import com.haifeng.miao.cartest.fragment.ThreeFragment;
import com.haifeng.miao.cartest.fragment.TwoFragment;
import com.haifeng.miao.cartest.fragment.UserFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTablayout;
    private ViewPager mViewPager;
    private List<String> mTitle;
    private List<Fragment> mFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
    }

    private void initView() {
        mTablayout = (TabLayout) findViewById(R.id.mTablayout);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        //加载
        mViewPager.setOffscreenPageLimit(mFragment.size());
        //适配器
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            //选中的item
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }
            //返回item个数
            @Override
            public int getCount() {
                return mFragment.size();
            }
            //title
            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });
        mTablayout.setupWithViewPager(mViewPager);
    }

    private void initData() {
        mTitle = new ArrayList<>();
        mTitle.add("科目一");
        mTitle.add("科目二");
        mTitle.add("科目三");
        mTitle.add("科目四");
        mTitle.add("精选");

        mFragment = new ArrayList<>();
        mFragment.add(new OneFragment());
        mFragment.add(new TwoFragment());
        mFragment.add(new ThreeFragment());
        mFragment.add(new FourFragment());
        mFragment.add(new UserFragment());

    }
}
