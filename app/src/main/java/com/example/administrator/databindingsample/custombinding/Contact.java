package com.example.administrator.databindingsample.custombinding;

/**
 * Created by lz on 2016/6/21.
 */
public class Contact {
    private final String name;
    private final String tel;
    private final String address;

    public Contact(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}
