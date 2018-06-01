package com.example.ios_razrab.parcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        PodParcelable podParcelable = getIntent() .getParcelableExtra("parcName");

        Log .i("Имя из Parcelable", podParcelable .name);
        Log .i("Возраст из Parcelable", String .valueOf(podParcelable .age));


    }
}
