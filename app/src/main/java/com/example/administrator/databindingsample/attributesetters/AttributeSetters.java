package com.example.administrator.databindingsample.attributesetters;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.databindingsample.R;
import com.example.administrator.databindingsample.databinding.ActivityAttributeSettersBinding;
import com.squareup.picasso.Picasso;


public class AttributeSetters extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAttributeSettersBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_attribute_setters);
        binding.setRadius(80);
        binding.setImageUrl("http://img3.imgtn.bdimg.com/it/u=3461475865,399128756&fm=21&gp=0.jpg");
    }

//    @BindingAdapter("android:paddingLeft")
//    public static void setPaddingLeft(View view, int padding) {
//        view.setPadding(padding,
//                view.getPaddingTop(),
//                view.getPaddingRight(),
//                view.getPaddingBottom());
//    }

    @BindingAdapter("android:paddingLeft")
    public static void setPaddingLeft(View view, int oldPadding, int newPadding) {
        if (oldPadding != newPadding) {
            view.setPadding(newPadding,
                    view.getPaddingTop(),
                    view.getPaddingRight(),
                    view.getPaddingBottom());
        }
    }

    @BindingAdapter({"bind:imageUrl", "bind:error" })
    public static void loadImage(ImageView view, String url, Drawable error) {
        //Picasso.with(view.getContext()).load(url).error(error).into(view);
        Picasso.with(view.getContext()).load(R.drawable.android).error(error).into(view);
    }

}
