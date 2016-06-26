package com.example.administrator.databindingsample.dynamicvariables;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.administrator.databindingsample.R;
import com.example.administrator.databindingsample.databinding.ActivityDynamicVariablesBinding;

import java.util.ArrayList;
import java.util.List;

public class DynamicVariables extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDynamicVariablesBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_dynamic_variables);
        MyListAdapter adapter = new MyListAdapter(loadData());
        binding.listview.setAdapter(adapter);
    }

    public List<User> loadData() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Rooney", "Wayne Mark"));
        users.add(new User("Rashford", "Marcus"));
        users.add(new User("Martial", "Anthony"));
        users.add(new User("Bailly", "Eric Bertrand"));
        users.add(new User("Beckham", "David"));
        return users;
    }
}
