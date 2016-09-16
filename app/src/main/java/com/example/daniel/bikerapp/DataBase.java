package com.example.daniel.bikerapp;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;
import com.firebase.client.ValueEventListener;

import java.util.Map;

/**
 * Created by MiguelPC on 15/09/2016.
 */
public class DataBase {

    private Firebase fireBaseRefernce;
    private Firebase userRefernce;

    public DataBase(){
        fireBaseRefernce = new Firebase("https://bikeraplicationdb-882b6.firebaseio.com/");
        userRefernce = fireBaseRefernce.child("users");
    }

    public void createUser(User user){
        System.out.println("Creando un Usuario ...");

        Firebase ref = fireBaseRefernce;
        ref.createUser("bobtony@firebase.com", "correcthorsebatterystaple", new Firebase.ValueResultHandler<Map<String, Object>>() {
            @Override
            public void onSuccess(Map<String, Object> result) {
                System.out.println("Successfully created user account with uid: " + result.get("uid"));
            }
            @Override
            public void onError(FirebaseError firebaseError) {
                // there was an error
            }
        });

        /*

        System.out.println("añadiendo usuario");
        userRefernce.push().setValue(user);
        */
    }

    public User readUser(String email){
        Query queryRef = userRefernce.orderByChild("email").equalTo(email);

        queryRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                System.out.println(dataSnapshot.getKey());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        return null;
    }
}
