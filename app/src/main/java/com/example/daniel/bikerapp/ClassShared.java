package com.example.daniel.bikerapp;

import java.util.Hashtable;

/**
 * Created by Daniel on 04/08/2016.
 */


public class ClassShared {
    static Hashtable dataBase = new Hashtable();

    static void dataHash() {
        dataBase.put("jod@gmail.com", "1234");
        dataBase.put("mia@gmail.com", "4321");
        dataBase.put("sac@gmail.com", "0123");
        dataBase.put("luf@gmail.com", "3210");
    }


}
