package com.example.administrator.databindingsample.bindingevents;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.databindingsample.R;
import com.example.administrator.databindingsample.databinding.ActivityEventBinding;

/**
 * Created by lz on 2016/6/20.
 */
public class BindingEventActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEventBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_event);
        User user = new User("firstName", "lastName");
        EventHandler handler = new EventHandler(BindingEventActivity.this);
        //user.setFriend(true);
        binding.setUser(user);
        binding.setHandlers(handler);
    }
}
