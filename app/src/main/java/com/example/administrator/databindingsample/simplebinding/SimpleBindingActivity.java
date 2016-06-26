package com.example.administrator.databindingsample.simplebinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.administrator.databindingsample.R;
import com.example.administrator.databindingsample.databinding.ActivitySimpleBinding;

public class SimpleBindingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySimpleBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_simple);
        User user = new User("Test", "UserA");
        binding.setUser(user);
    }
}
