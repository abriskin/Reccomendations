package com.example.reccomendations;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;

public class loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
    }

    private Activity activity;
    private AlertDialog dialog;
    public loading(Activity myActivity){
        activity = myActivity;
    }

    public void startLoadingAnimation(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_dialouge, null));
        builder.setCancelable(false);

        dialog = builder.create();
        dialog.show();

    }
    public void dismissDialogue(){
        dialog.dismiss();
    }
}
