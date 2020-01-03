package com.example.formvalidation;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;


public class TxtInputModel extends BaseObservable  {

    public ObservableField <String> InputText= new ObservableField<>();
    public ObservableField<Boolean> Add      =new ObservableField<>();
    public final ObservableField<String> toast1= new ObservableField<>();

    public void onClick1 () {

        System.out.println("hello"+InputText.get().toString());
       if (!InputText.get().toString().isEmpty()) {
        item[] newListData = new item[]{
                new item(InputText.get().toString()),
        };

       // Toast toast = Toast.makeText(this, "Item added to list", Toast.LENGTH_SHORT);
        toast1.set("Item added to list");
          }
            else{
        //    Toast ntoast=Toast.makeText(this,"Enter a valid item",Toast.LENGTH_SHORT);
                toast1.set("Textfield is Empty");
            }

    }
    }







