package com.example.administrator.databindingsample.observableobjects;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by LZ on 2016/6/25.
 */
public class UserB {
    public final ObservableField<String> firstName = new ObservableField<String>();
    public final ObservableField<String> lastName = new ObservableField<String>();
    public final ObservableInt age = new ObservableInt();
}
