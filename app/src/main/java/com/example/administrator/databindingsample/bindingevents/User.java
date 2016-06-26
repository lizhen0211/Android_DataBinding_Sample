package com.example.administrator.databindingsample.bindingevents;

/**
 * Created by lz on 2016/6/20.
 */
public class User {
    private final String firstName;
    private final String lastName;
    private boolean isFriend;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public boolean isFriend() {
        return isFriend;
    }

    public void setFriend(boolean friend) {
        isFriend = friend;
    }
}
