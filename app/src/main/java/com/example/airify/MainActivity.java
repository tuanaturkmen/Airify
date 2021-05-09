package com.example.airify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickObserve(View view) {
       Intent dataActivity = new Intent(this, DataActivity.class);
        startActivity(dataActivity);
    }

    public void onClickInfo(View view) {
        Intent infoActivity = new Intent(this, InfoActivity.class);
        startActivity(infoActivity);
    }
}