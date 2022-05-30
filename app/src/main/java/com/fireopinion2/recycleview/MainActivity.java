package com.fireopinion2.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    Contact o1 =new Contact(1,"8393887841","Nadeem");
    Contact o2 =new Contact(2,"7017960426","Ahmad");
    Contact o3 =new Contact(3,"9997380192","Muneer");
    Contact o4 =new Contact(4,"9675354244","Shehzad");
    Contact o5 =new Contact(5,"7409166696","Tanveer");
    Contact o6 =new Contact(6,"9897862586","Shehzad");
    Contact o7 =new Contact(7,"8923860394","Sajid");
    Contact o8 =new Contact(8,"9045321123","Suhail");
    Contact o9 =new Contact(9,"8791075113","Tamrej");

    Contact [] contacts={o1,o2,o3,o4,o5,o6,o7,o8,o9};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad=new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

    }
}