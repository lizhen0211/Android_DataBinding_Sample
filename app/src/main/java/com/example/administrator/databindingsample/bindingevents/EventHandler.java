package com.example.administrator.databindingsample.bindingevents;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by lz on 2016/6/20.
 */
public class EventHandler {

    private Context _context;

    public EventHandler(Context context) {
        _context = context;
    }

    public void onClickFriend(View view) {
        Toast.makeText(_context, "onClickFriend", Toast.LENGTH_SHORT).show();
    }

    public void onClickEnemy(View view) {
        Toast.makeText(_context, "onClickEnemy", Toast.LENGTH_SHORT).show();
    }

}
