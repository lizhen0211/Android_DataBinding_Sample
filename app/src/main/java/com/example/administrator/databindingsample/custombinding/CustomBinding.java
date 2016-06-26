package com.example.administrator.databindingsample.custombinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.administrator.databindingsample.R;
import com.example.administrator.databindingsample.databinding.ContactItem;

public class CustomBinding extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContactItem binding = DataBindingUtil.setContentView(this, R.layout.activity_custom);
        binding.setContact(new Contact("rose", "13900000000", "china"));
    }
}
