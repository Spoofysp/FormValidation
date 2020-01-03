package com.example.formvalidation;



import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.formvalidation.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends AppCompatActivity {

       // ActivityWelcomeBinding bind = DataBindingUtil.setContentView(this,R.layout.activity_welcome);
        public Bundle getbundle=null;


        public ObservableField<String> usrname = new ObservableField<>();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            //  Intent mIntent = getIntent();
            getbundle=this.getIntent().getExtras();


             usrname.set(getbundle.getString("Name").toString().toUpperCase());
            System.out.println(getbundle.getString("Name").toString());
            EditText editText1=(EditText) findViewById(R.id.name);
            editText1.setText(getbundle.getString("Name").toUpperCase());

            EditText number=(EditText)findViewById(R.id.number);
            number.setText(getbundle.getString("contact"));

            EditText email=(EditText)findViewById(R.id.email);
            email.setText(getbundle.getString("email"));

            EditText gender=(EditText)findViewById(R.id.gender);
            gender.setText(getbundle.getString("gender"));



            EditText country=(EditText)findViewById(R.id.country);
            country.setText(getbundle.getString("Country"));
}
    }
