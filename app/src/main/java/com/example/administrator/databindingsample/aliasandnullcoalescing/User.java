package com.example.administrator.databindingsample.aliasandnullcoalescing;

/**
 * Created by lz on 2016/6/20.
 */
public class User {
    private final String firstName;
    private final String lastName;
    private boolean adult;
    private String displayName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
