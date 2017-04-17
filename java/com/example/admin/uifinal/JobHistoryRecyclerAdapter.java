package com.example.admin.uifinal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 4/15/2017.
 */

public class JobHistoryRecyclerAdapter extends RecyclerView.Adapter<JobHistoryRecyclerAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Data> dataList;

    /**
     * @param context takes Activity context
     */
    public JobHistoryRecyclerAdapter(final Context context) {
        this.context = context;
        dataList = new ArrayList<Data>();
        Data data = new Data("14 June, 2016 04:23 PM", "5.6 km", "Suresh Kumar", "3846 W 38 Rd, Shiv Srishti Marg \n"
                + "Mumbai");
        Data data2 = new Data("15 June, 2016 04:23 PM", "8.6 km", "Rajesh Kumar", "3846 W 38 Rd, Shiv Srishti Marg \n"
                + "Mumbai");
        dataList.add(data);
        dataList.add(data2);
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.job_recycler_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.tvDate.setText(dataList.get(position).getDate());
        holder.tvDistance.setText(dataList.get(position).getDistance());
        holder.tvName.setText(dataList.get(position).getName());
        holder.tvAddress.setText(dataList.get(position).getAdress());


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    /**
     * view holder for job history recycler view
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvDate;
        private TextView tvDistance;
        private TextView tvName;
        private TextView tvAddress;


        /**
         * @param itemView takes the item view
         */
        public ViewHolder(final View itemView) {
            super(itemView);
            tvDate = (TextView) itemView.findViewById(R.id.date_tv);
            tvDistance = (TextView) itemView.findViewById(R.id.distance_tv);
            tvName = (TextView) itemView.findViewById(R.id.name_tv);
            tvAddress = (TextView) itemView.findViewById(R.id.address_tv);


        }

        /**
         * @return date
         */
        public TextView getTvDate() {
            return tvDate;
        }

        /**
         * @param tvDate takes date
         */
        public void setTvDate(final TextView tvDate) {
            this.tvDate = tvDate;
        }

        /**
         * @return distance
         */
        public TextView getTvDistance() {
            return tvDistance;
        }

        /**
         * @param tvDistance takes distance
         */
        public void setTvDistance(final TextView tvDistance) {
            this.tvDistance = tvDistance;
        }

        /**
         * @return name
         */
        public TextView getTvName() {
            return tvName;
        }

        /**
         * @param tvName takes name
         */
        public void setTvName(final TextView tvName) {
            this.tvName = tvName;
        }

        /**
         * @return adress
         */
        public TextView getTvAddress() {
            return tvAddress;
        }

        /**
         * @param tvAddress takes adress
         */
        public void setTvAddress(final TextView tvAddress) {
            this.tvAddress = tvAddress;
        }

    }
}
