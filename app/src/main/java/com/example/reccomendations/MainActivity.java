package com.example.reccomendations;

import androidx.appcompat.app.AppCompatActivity;

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
        switch(view.getId()){
            case R.id.movie_button:
                break;
            case R.id.music_button:
                break;
        }

    }
}
