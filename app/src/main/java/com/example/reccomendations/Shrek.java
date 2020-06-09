package com.example.reccomendations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Shrek extends AppCompatActivity {
    private static int recType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrek);

        TextView enterV = (TextView)findViewById(R.id.enter);

        switch (recType) {
            case 1:
                enterV.setText("You would Enjoy the Shrek Movies! \nShrek\nShrek II");
                break;
            case 2:
                enterV.setText("You would Enjoy These Songs! \nAll Star by Smash Mouth");
                break;
        }

    }




}
