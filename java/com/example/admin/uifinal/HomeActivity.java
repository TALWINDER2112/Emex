package com.example.admin.uifinal;

import android.app.FragmentManager;;
import android.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ListView mDrawerList;
    private RelativeLayout mDrawerPane;
    private DrawerLayout mDrawerLayout;
    ArrayList<NavigationItem> mNavigationItem = new ArrayList<NavigationItem>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initDrawerList();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        // Populate the Navigtion Drawer with options
        mDrawerPane = (RelativeLayout) findViewById(R.id.drawerPane);
        mDrawerList = (ListView) findViewById(R.id.navList);
        DrawerListAdapter adapter = new DrawerListAdapter(this, mNavigationItem);
        mDrawerList.setAdapter(adapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 2) {
                    FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.mainContent, new PreferencesFragment()).commit();
                    mDrawerLayout.closeDrawers();
                }
            }
        });



    }


    private void initDrawerList() {
        mNavigationItem.add(new NavigationItem("Networks View", R.drawable.icon_networks));
        mNavigationItem.add(new NavigationItem("Payment ", R.drawable.icon_payment_normal));
        mNavigationItem.add(new NavigationItem("Job History ", R.drawable.icon_job_normal));
        mNavigationItem.add(new NavigationItem("Emergency Contacts ", R.drawable.icon_emergency_normal));
        mNavigationItem.add(new NavigationItem("Help ", R.drawable.icon_help_normal));
        mNavigationItem.add(new NavigationItem("Logout ", R.drawable.icon_logout_normal));
    }
}
