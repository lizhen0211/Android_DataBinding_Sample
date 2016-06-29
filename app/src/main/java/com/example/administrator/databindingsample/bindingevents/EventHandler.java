package com.example.administrator.databindingsample.bindingevents;

import android.view.View;
import android.widget.Toast;

/**
 * Created by lz on 2016/6/20.
 */
public class EventHandler {

    public void onClickFriend(View view) {
        Toast.makeText(view.getContext(), "onClickFriend", Toast.LENGTH_SHORT).show();
    }

    public void onClickEnemy(View view) {
        Toast.makeText(view.getContext(), "onClickEnemy", Toast.LENGTH_SHORT).show();
    }

    public void onSaveClick(View view, User user) {
        Toast.makeText(view.getContext(), "onSaveClick:" + user.getFirstName(), Toast.LENGTH_SHORT).show();
    }

}
