package com.kovalev.nikita.remind.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kovalev.nikita.remind.R;
import com.kovalev.nikita.remind.adapter.RemindListAdapter;
import com.kovalev.nikita.remind.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikit on 13.09.2017.
 */

public class HistoryFragment extends AbstractTabFragment {

    public static final int LAYOUT = R.layout.fragment_history;

    private List<RemindDTO> data;
    private RemindListAdapter adapter;

    public static HistoryFragment getInstance(Context context, List<RemindDTO> data) {

        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setData(data);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_history));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        adapter = new RemindListAdapter(data);
        rv.setAdapter(adapter);

        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setData(List<RemindDTO> data) {
        this.data = data;
    }

    public void refreshData(List<RemindDTO> data) {
        adapter.setData(data);
        adapter.notifyDataSetChanged();
    }
}
