package com.fireopinion2.recycleview;

import android.content.Context;
import android.content.Intent;

public class Contact {
    public String phoneNumber;
    public String name;
    private int sno;


    public Contact(int sno, String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.sno=sno;
    }

}
