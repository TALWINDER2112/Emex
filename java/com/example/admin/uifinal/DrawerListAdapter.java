package com.example.admin.uifinal;

import android.app.FragmentManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 16-04-2017.
 */

public class DrawerListAdapter extends BaseAdapter{
    private Context mContext;
    ArrayList<NavigationItem> mNavigationItem;

    public DrawerListAdapter(final Context context, final ArrayList<NavigationItem> navigationItems) {
        mContext = context;
        mNavigationItem = navigationItems;
    }
    @Override
    public int getCount() {
        return mNavigationItem.size();
    }

    @Override
    public Object getItem(int position) {
        return mNavigationItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.drawer_item, null);
        }
        else {
            view = convertView;
        }
        TextView tvTitle = (TextView) view.findViewById(R.id.title);
        ImageView imgIcon = (ImageView) view.findViewById(R.id.icon);
        Switch switchNetworks = (Switch) view.findViewById(R.id.switchNetworks);
        tvTitle.setText(mNavigationItem.get(position).mTitle);
        imgIcon.setImageResource(mNavigationItem.get(position).mIcon);
        if (position == 0)
            switchNetworks.setVisibility(View.VISIBLE);

        return view;
    }
}
