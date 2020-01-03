package com.example.formvalidation;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={SharedPrefModule.class})
public interface Components {

    void inject (DashboardActivity dashboardActivity);

}
