package com.example.admin.uifinal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class JobHistory extends Fragment {
    private RecyclerView recyclerView;
    private JobHistoryRecyclerAdapter jobHistoryRecyclerAdapter;

    /**
     * constructor for fragment
     */
    public JobHistory() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_preferences, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.job_history_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        jobHistoryRecyclerAdapter = new JobHistoryRecyclerAdapter(getActivity());
        recyclerView.setAdapter(jobHistoryRecyclerAdapter);


        return view;

    }

}
