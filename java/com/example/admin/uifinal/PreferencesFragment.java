package com.example.admin.uifinal;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;

/**
 * Created by Admin on 16-04-2017.
 */

public class PreferencesFragment extends Fragment {
    private ViewPager viewPager;
    private ViewPageAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    private Toolbar toolbar;
    private TextView tvTitle;
    private ImageButton btnDrawer;
    public PreferencesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_preferences, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);

        tvTitle.setText("Job History");
        viewPagerAdapter = new ViewPageAdapter(getFragmentManager());
        viewPagerAdapter.addData(new JobHistory(), "Job History");
        viewPagerAdapter.addData(new MissedJobsFragment(), "Missed Jobs");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        setViewPagerListener();
        return view;    }
}
