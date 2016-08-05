package com.example.daniel.bikerapp;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Hashtable;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ClassShared.dataHash();

        final Button acept = (Button) findViewById(R.id.aceptButton2);

        acept.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String user = ((EditText)findViewById(R.id.emailButton2)).getText().toString();
                String password = ((EditText)findViewById(R.id.passwordButton2)).getText().toString();

                //if (user.equals("admin@gmail") && password.equals("admin")) {

                //System.out.println("holaaa " +  dataBase.containsKey(user) + " " + user);

                ClassShared.dataBase.put(user, password);
                Intent intent = new Intent(RegisterActivity.this, TopicActivity.class);
                startActivity(intent);

            }
        });

    }


}
