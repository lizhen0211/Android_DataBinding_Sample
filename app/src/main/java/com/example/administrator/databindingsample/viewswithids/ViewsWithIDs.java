package com.example.administrator.databindingsample.viewswithids;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.databindingsample.R;
import com.example.administrator.databindingsample.databinding.ActivityViewsWithIdsBinding;

public class ViewsWithIDs extends Activity {

    ActivityViewsWithIdsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_views_with_ids);
    }

    public void setName(View view){
        binding.firstName.setText("Pitt");
        binding.lastName.setText("Brad");
    }
}
