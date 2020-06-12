package com.example.reccomendations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

//user picks recommendation type
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        Intent intent = new Intent(MainActivity.this, EnterInfo.class);
        intent.putExtra("mediaButtonPressed", view.getId());
        startActivity(intent);
        finish();
    }
}
