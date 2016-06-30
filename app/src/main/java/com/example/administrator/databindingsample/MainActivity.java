package com.example.administrator.databindingsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.databindingsample.aliasandnullcoalescing.AliasAndNullCoalescing;
import com.example.administrator.databindingsample.attributesetters.AttributeSetters;
import com.example.administrator.databindingsample.bindingevents.BindingEventActivity;
import com.example.administrator.databindingsample.custombinding.CustomBinding;
import com.example.administrator.databindingsample.dynamicvariables.DynamicVariables;
import com.example.administrator.databindingsample.includes.IncludesActivity;
import com.example.administrator.databindingsample.objectconversions.ObjectConversions;
import com.example.administrator.databindingsample.observableobjects.ObservableActivity;
import com.example.administrator.databindingsample.simplebinding.SimpleBindingActivity;
import com.example.administrator.databindingsample.viewswithids.ViewsWithIDs;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSimpleBinding(View view) {
        Intent intent = new Intent(MainActivity.this, SimpleBindingActivity.class);
        startActivity(intent);
    }

    public void startBindingEvent(View view) {
        Intent intent = new Intent(MainActivity.this, BindingEventActivity.class);
        startActivity(intent);
    }

    public void startImportAndAlias(View view) {
        Intent intent = new Intent(MainActivity.this, AliasAndNullCoalescing.class);
        startActivity(intent);
    }

    public void startCustomBinding(View view) {
        Intent intent = new Intent(MainActivity.this, CustomBinding.class);
        startActivity(intent);
    }

    public void startIncludesBinding(View view) {
        Intent intent = new Intent(MainActivity.this, IncludesActivity.class);
        startActivity(intent);
    }

    public void startObservableObjects(View view) {
        Intent intent = new Intent(MainActivity.this, ObservableActivity.class);
        startActivity(intent);
    }

    public void startViewsWithIDs(View view) {
        Intent intent = new Intent(MainActivity.this, ViewsWithIDs.class);
        startActivity(intent);
    }

    public void startDynamicVariables(View view) {
        Intent intent = new Intent(MainActivity.this, DynamicVariables.class);
        startActivity(intent);
    }

    public void startAttributeSetters(View view) {
        Intent intent = new Intent(MainActivity.this, AttributeSetters.class);
        startActivity(intent);
    }

    public void startObjectConversions(View view) {
        Intent intent = new Intent(MainActivity.this, ObjectConversions.class);
        startActivity(intent);
    }
}
