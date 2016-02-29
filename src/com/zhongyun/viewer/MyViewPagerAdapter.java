package com.zhongyun.viewer;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Monkey on 2015/6/29.
 */
public class MyViewPagerAdapter extends FragmentStatePagerAdapter {

    private int[] mTitles;
    private List<Fragment> mFragments;
    private Context mContext;

    public MyViewPagerAdapter(Context context,FragmentManager fm, int[] mTitles, List<Fragment> mFragments) {
        super(fm);
        mContext = context;
        this.mTitles = mTitles;
        this.mFragments = mFragments;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getString(mTitles[position]);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
