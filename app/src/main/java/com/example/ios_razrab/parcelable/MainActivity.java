package com.example.ios_razrab.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PodParcelable podParcelable = new PodParcelable(25,"John");

        Intent intent = new Intent(this, SecondActivity .class);
        intent .putExtra("parcName", podParcelable);
        startActivity(intent);


    }
}
