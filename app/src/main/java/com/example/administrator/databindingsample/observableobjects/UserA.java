package com.example.administrator.databindingsample.observableobjects;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.administrator.databindingsample.BR;

/**
 * Created by LZ on 2016/6/25.
 */
public class UserA extends BaseObservable {
    private String firstName;
    private String lastName;

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
