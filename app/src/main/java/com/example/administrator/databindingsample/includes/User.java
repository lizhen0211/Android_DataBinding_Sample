package com.example.administrator.databindingsample.includes;

/**
 * Created by lz on 2016/6/21.
 */
public class User {
    private final String name;
    private final String contact;

    public User(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public String getName() {
        return name;
    }
}
