package com.example.administrator.databindingsample.aliasandnullcoalescing;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.administrator.databindingsample.databinding.ActivityAliasAndNullCoalescingBinding;
import com.example.administrator.databindingsample.R;

public class AliasAndNullCoalescing extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAliasAndNullCoalescingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_alias_and_null_coalescing);
        User user = new User("firstName", "lastName");
        user.setAdult(true);
        binding.setUser(user);
    }
}
