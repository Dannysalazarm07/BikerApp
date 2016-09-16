package com.example.daniel.bikerapp;

import com.firebase.client.Firebase;

/**
 * Created by MiguelPC on 24/08/2016.
 */
public class FireBaseDB extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }

}
