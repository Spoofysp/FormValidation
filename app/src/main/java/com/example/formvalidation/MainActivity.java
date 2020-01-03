package com.example.formvalidation;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.example.formvalidation.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    Button closeButton;


    @Override

   protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);



  ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ViewModel viewModel = new ViewModel();
        binding.setViewModel(viewModel);


       closeButton =(Button) findViewById(R.id.submit);
        builder= new AlertDialog.Builder(this);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {


        //setting message from string.xml
               /* builder.setMessage(R.string.dialog_message)
                        .setMessage(R.string.dialog_title);*/

        //performing action on button click
               builder.setMessage("Do you want to submit this application ?").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                        Toast.makeText(getApplicationContext(),"You Choose yes action for checkbox ",Toast.LENGTH_SHORT).show();
                        onSubmit(v);
                    }
                })
                 .setNegativeButton("No", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int id) {
                         //Cancel option
                         dialog.cancel();
                         Toast.makeText(getApplicationContext(),"You choose no action for checkbox",Toast.LENGTH_SHORT).show();
                     }
                 });

                AlertDialog alert= builder.create();

                //setting message manually

                alert.setTitle("Sample");
            //    alert.setMessage("Trial");
                alert.show();

            }
        });
/////////to be coded alert dialogbox

    }

    @BindingAdapter({"toastMsg"})
    public static void toastMsg(View view, String message) {
        Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }


    public void onSubmit(View view) {

        EditText editText;
        editText = (EditText) findViewById(R.id.namef);
        String name = editText.getText().toString();


        editText = (EditText) findViewById(R.id.mobilef);

        String contactNo = editText.getText().toString();

        editText = (EditText) findViewById(R.id.emailf);
        String email = editText.getText().toString();

        RadioGroup rad;
        rad = (RadioGroup) findViewById(R.id.radioGroup);

    /*    rad.clearCheck();
        rad.setOnCheckedChangeListener(
                new radioGroup.OnCheckedChangeListener(){});*/
      int selectedId = rad.getCheckedRadioButtonId();
        RadioButton value = (RadioButton) findViewById(selectedId);
        String gender = value.getText().toString();

        Spinner spinner = (Spinner) findViewById(R.id.countryList);
        String country = spinner.getSelectedItem().toString();

        Switch sw = (Switch) findViewById(R.id.fordEmployee);
        //  Boolean switch=sw.isChecked();
        String swit = sw.getText().toString();

        editText = (EditText) findViewById(R.id.pass);
        String pwd = editText.getText().toString();
//
        editText = (EditText) findViewById(R.id.confpassf);
        String pwdcnf = editText.getText().toString();

//
        Intent intent = new Intent(this, WelcomeActivity.class);

        //Creating new object of bundle and adding the parameters

        Bundle bundle = new Bundle();
        bundle.putString("Name", name);
        bundle.putString("contact", contactNo);
        bundle.putString("email", email);
        bundle.putString("gender", gender);
        bundle.putString("Country", country);
          bundle.putString("Switch", swit);

        intent.putExtras(bundle);
        //startActivity(intent);

    }






        /*
         @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing list view with the custom adapter
        ArrayList <Item> itemList = new ArrayList<Item>();

        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(R.layout.list_item, itemList);
        recyclerView = (RecyclerView) findViewById(R.id.item_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemArrayAdapter);

        // Populating list items
        for(int i=0; i<100; i++) {
            itemList.add(new Item("Item " + i));
        }

    }

        */

    }





