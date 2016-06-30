package com.example.administrator.databindingsample.objectconversions;

import android.app.Activity;
import android.databinding.BindingConversion;
import android.databinding.DataBindingUtil;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.example.administrator.databindingsample.R;
import com.example.administrator.databindingsample.databinding.ActivityObjectConversionsBinding;

public class ObjectConversions extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObjectConversionsBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_object_conversions);
        binding.setIsError(true);
    }

    @BindingConversion
    public static ColorDrawable convertColorToDrawable(int color) {
        return new ColorDrawable(color);
    }
}
