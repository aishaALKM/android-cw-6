package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Movie s =new Movie("Matilda","Mara Wilsoon",10,10,"comedy/drama");

        Movie g =new Movie("The greatest showman","Hug Jackman",10,7,"Musical");






    }
}