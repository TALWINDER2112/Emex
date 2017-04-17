package com.example.admin.uifinal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Admin on 16-04-2017.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments;
    private ArrayList<String> titles;

    /**
     * @param fm takes fragment manager
     */
    public ViewPageAdapter(final FragmentManager fm) {
        super(fm);
        fragments = new ArrayList<Fragment>();
        titles = new ArrayList<String>();

    }

    /**
     * @param fragment takes fragment object
     * @param string   takes string object
     */
    public void addData(final Fragment fragment, final String string) {
        fragments.add(fragment);
        titles.add(string);
    }

    @Override
    public Fragment getItem(final int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(final int position) {
        return titles.get(position);
    }
}
