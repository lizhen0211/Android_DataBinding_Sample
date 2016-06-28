package com.example.administrator.databindingsample.attributesetters;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.databindingsample.R;
import com.example.administrator.databindingsample.databinding.ActivityAttributeSettersBinding;


public class AttributeSetters extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAttributeSettersBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_attribute_setters);
        binding.setRadius(80);
    }

    @BindingAdapter("android:paddingLeft")
    public static void setPaddingLeft(View view, int padding) {
        view.setPadding(padding,
                view.getPaddingTop(),
                view.getPaddingRight(),
                view.getPaddingBottom());
    }

}
