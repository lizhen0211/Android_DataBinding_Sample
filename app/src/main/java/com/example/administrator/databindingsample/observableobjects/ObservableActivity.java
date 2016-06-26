package com.example.administrator.databindingsample.observableobjects;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.databindingsample.R;
import com.example.administrator.databindingsample.databinding.ActivityObservableBinding;

/**
 * Created by LZ on 2016/6/25.
 */
public class ObservableActivity extends Activity {

    UserA userA;
    UserB userB;
    ObservableArrayMap<String, Object> userMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObservableBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observable);
        userA = new UserA();
        userA.setFirstName("userA firstName One");
        userA.setLastName("userA lastName One");

        userB = new UserB();
        userB.firstName.set("userB firstName One");
        userB.lastName.set("userB lastName One");
        userB.age.set(10);

        userMap = new ObservableArrayMap<String, Object>();
        userMap.put("firstName", "Google");
        userMap.put("lastName", "Inc.");
        userMap.put("age", 17);
        binding.setUserA(userA);
        binding.setUserB(userB);
        binding.setUsermap(userMap);
    }

    public void modify_user_A(View view) {
        userA.setFirstName("userA firstName two");
        userA.setLastName("userA LastName two");
    }

    public void modify_user_B(View view) {
        userB.firstName.set("userB firstName two");
        userB.lastName.set("userB LastName two");
        userB.age.set(11);
    }
}
