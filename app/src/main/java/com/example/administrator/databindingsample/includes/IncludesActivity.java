package com.example.administrator.databindingsample.includes;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.administrator.databindingsample.R;
import com.example.administrator.databindingsample.databinding.ActivityIncludesBinding;

public class IncludesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityIncludesBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_includes);
        binding.setUser(new User("name", "contact"));
    }
}
