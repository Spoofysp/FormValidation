package com.example.formvalidation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.formvalidation.databinding.ActivityMainBinding;
import com.example.formvalidation.databinding.LoginBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class LoginActivity extends AppCompatActivity {

    LoginModel loginModel = new LoginModel();
    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.login);
       ;
        LoginBinding binding1 =DataBindingUtil.setContentView(this,R.layout.login);


        binding1.setLogin(loginModel);


    }

    public void onClick(View view){
        if((loginModel.username.get().toString().equals("admin"))&&(loginModel.password.get().toString().equals("admin"))){
            Intent intent4 = new Intent(this, textInputActivity.class);
            startActivity(intent4);
        }
    }
}
