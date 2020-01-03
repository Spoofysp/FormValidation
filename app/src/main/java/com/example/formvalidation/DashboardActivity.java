package com.example.formvalidation;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.DaggerCollections;

public class DashboardActivity extends AppCompatActivity {

    RecyclerView recyclerView;
 item[] newListData;
private Components component;
@Inject
SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

       component=DaggerComponents.builder().sharedPrefModule(new SharedPrefModule(this)).build();

       component.inject(this);



       // SharedPreferences sharedPreferences=getSharedPreferences("MyPref",0);
        String string= sharedPreferences.getString("key1","noText");
       // Bundle bundle = this.getIntent().getExtras();
      //  String string =bundle.getString("newitem");
        System.out.println("hello"+string);
        item[] newListData = new item[] {


               new item("Email"),
               new item("Info"),
               new item("Delete"),
               new item("Dialer"),
               new item("Alert"),
               new item("Map"),
               new item("Email"),
               new item("Info"),
               new item("Delete"),
               new item("Dialer"),
               new item("Alert"),
               new item("Map"),
                new item(string),
       };






          ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(R.id.listView,newListData);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        ItemArrayAdapter adapter = new ItemArrayAdapter(newListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);







    }




}
