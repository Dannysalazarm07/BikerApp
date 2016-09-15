package com.example.daniel.bikerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;

import java.util.Hashtable;

public class LoginActivity extends AppCompatActivity {


    //Hashtable dataBase = new Hashtable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ClassShared.dataHash();

        Button acept = (Button) findViewById(R.id.aceptButton);

        acept.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Firebase fireBaseRefernce = new Firebase("https://bikeraplicationdb-882b6.firebaseio.com/");

                fireBaseRefernce.addAuthStateListener(new Firebase.AuthStateListener() {
                    @Override
                    public void onAuthStateChanged(AuthData authData) {

                    }
                });






                String user = ((EditText)findViewById(R.id.emailButton2)).getText().toString();
                String password = ((EditText)findViewById(R.id.passwordButton2)).getText().toString();

                //if (user.equals("admin@gmail") && password.equals("admin")) {

                //System.out.println("holaaa " +  dataBase.containsKey(user) + " " + user);
                if(ClassShared.dataBase.containsKey(user) && ClassShared.dataBase.containsValue(password)) {
                    Intent intent = new Intent(LoginActivity.this, TopicActivity.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(getApplicationContext(), "Correo o contrasena incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }


}
