package com.bob.thorneye.androidtestfirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    private static final String FIREBASE_URL = "https://bobstestproject1.firebaseio.com/";

    private Firebase mFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_main);

        setUpFirebase();
    }

    private void setUpFirebase() {
        mFirebase = new Firebase(FIREBASE_URL);

        mFirebase.child("users").setValue(123);

        System.out.println("FIREBASE SETUP IS FINISHED");
    }
}
