package com.example.administrator.databindingsample.dynamicvariables;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.administrator.databindingsample.R;
import com.example.administrator.databindingsample.databinding.DynamicVariablesListItemBinding;

import java.util.List;

/**
 * Created by LZ on 2016/6/26.
 */
public class MyListAdapter extends BaseAdapter {

    private final List<User> users;

    public MyListAdapter(List<User> users) {
        this.users = users;
    }

    @Override
    public int getCount() {
        return users == null ? 0 : users.size();
    }

    @Override
    public Object getItem(int position) {
        return users == null ? null : users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DynamicVariablesListItemBinding binding;
        if (convertView == null) {
            binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                    R.layout.dynamic_variables_list_item, parent, false);
            convertView = binding.getRoot();
            convertView.setTag(binding);
        } else {
            binding = (DynamicVariablesListItemBinding) convertView.getTag();
        }
        binding.setUser(users.get(position));
        return convertView;
    }
}
