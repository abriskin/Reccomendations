package com.example.reccomendations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Shrek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrek);
        setText();
        setImage();
    }

    public void setText() {
        TextView enterV = (TextView) findViewById(R.id.reccText);
        int recType = EnterInfo.getRecType();
        switch (recType) {
            case 1:
                enterV.setText("You would enjoy the Shrek movies!");
                break;
            case 2:
                enterV.setText("You would enjoy the Shrek soundtrack!");
                break;
        }
    }

    public void setImage(){
        ImageView iv = (ImageView)findViewById(R.id.imageView3);
        int recType = EnterInfo.getRecType();
        switch (recType) {
            case 1:
                iv.setImageResource(R.drawable.shrek_the_guy);
                break;
            case 2:
                iv.setImageResource(R.drawable.shrek_the_musical);
                break;
        }
    }

    public void mainClick(View view) {
        System.out.println("entered mainclick");
        Intent i = new Intent(Shrek.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
