package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, OnBoardSecond.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slidein, R.anim.slideout);
    }
}