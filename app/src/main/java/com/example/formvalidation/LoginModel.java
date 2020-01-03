package com.example.formvalidation;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class LoginModel extends BaseObservable {
    public final ObservableField<String> username= new ObservableField<>();
    public final ObservableField<String> password= new ObservableField<>();

}
