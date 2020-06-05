package com.example.reccomendations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class EnterInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_info2);
        System.out.println("entered enter info");
        setTextViewAndButtonText(getIntent().getIntExtra("mediaButtonPressed", 0));
    }

    public void setTextViewAndButtonText(Integer button) {
        TextView enterV = (TextView)findViewById(R.id.enter);
        Button nextV = (Button)findViewById(R.id.next);
        switch (button) {
            case R.id.movie_button:
                System.out.println("movie button");
                enterV.setText("Enter A Movie You Enjoyed");
                nextV.setText("Enter Another Movie");
                break;
            case R.id.music_button:
                System.out.println("music button");
                enterV.setText("Enter An Album You Enjoyed");
                nextV.setText("Enter Another Album");
                break;
        }
    }
}
