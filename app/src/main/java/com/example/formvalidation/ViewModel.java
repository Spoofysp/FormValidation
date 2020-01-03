package com.example.formvalidation;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;

public class ViewModel extends BaseObservable {
    public final  ObservableField <String> userName= new ObservableField();
    public final  ObservableField <String> mobile= new ObservableField();
    public final  ObservableField <String> email= new ObservableField();
    public final  ObservableField <Boolean> gender= new ObservableField();
    public final  ObservableField <String> fordEmp= new ObservableField();
    public final  ObservableField <String> country= new ObservableField();
    public final  ObservableField <String> password= new ObservableField();
    public final  ObservableField <Boolean> button = new ObservableField(false);

   boolean i,j,k,l,m,n,o =false;

    public final ObservableField<String> toast= new ObservableField<>();


    public void nameVal(){
        if( (TextUtils.isEmpty(userName.get())) ||(userName.get().length()<5)){

            System.out.println("Username should be minimum of 5 char");
            toast.set("Username should be minimum of 5 char");

        }
        else{
            m=true;
            buttonEnable();
        }

    }

    public void mobileVal(){
        int len=10;
        if(mobile.get().length()<len){

            System.out.println("mobile no. error");
            toast.set("mobile no. error");

        }
        else{
            i=true;
            buttonEnable();
        }

    }

    public void email(){
        String emailPattern ="[a-zA-Z0-9._-]+@[a-z]+.+[a-z]";

        if(!(email.get().matches(emailPattern))){
            System.out.println("error in mail id");
            toast.set("error in mail id");
        }
        else{
            j=true;
            buttonEnable();
        }
    }


    public  void genderVal(View view){
        boolean checked=((RadioButton) view).isChecked();
        if(view.getId()==-1){
            System.out.println("Please select Gender");
            toast.set("Please select Gender");
        }
        else{
            System.out.println("gender done");
            view.requestFocus();
            k=true;
            buttonEnable();
        }

    }


    public void countryVal(AdapterView<?> parent, View view,int pos, long id){

        if(parent.getSelectedItem().equals("select")){
            System.out.println("Choose a Country");
            toast.set("Choose a Country");
        }
        else{
            l=true;
            buttonEnable();
        }

    }


    public void buttonEnable(){
        if((i=true) && (j=true) && (k=true) && (l=true)&&(m=true)){
           button.set(true);
         //  toast.set("Successfully Registered");

        }
        else button.set(false);
        toast.set("Check if all fields are filled");
    }


}
