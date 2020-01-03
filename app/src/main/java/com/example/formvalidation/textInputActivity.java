package com.example.formvalidation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

import static androidx.appcompat.widget.AppCompatDrawableManager.get;

public class textInputActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_input);

    }

    public void onSubmit1(View v) {
        Intent intent1 = new Intent(this, DashboardActivity.class);
        startActivity(intent1);
    }
    public void samTest(View vw){
        EditText editText=(EditText) findViewById(R.id.newItem);
        String string =editText.getText().toString();

        SharedPreferences sharedPreferences =getSharedPreferences("MyPref",0);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString("key1",string);
        editor.commit();

        Intent intent2 = new Intent(this, DashboardActivity.class);
        startActivity(intent2);

    }


      }




