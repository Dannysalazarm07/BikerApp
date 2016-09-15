package com.example.daniel.bikerapp;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;
import com.firebase.client.ValueEventListener;

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

        System.out.println("añadiendo usuario");
        userRefernce.push().setValue(user);
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
