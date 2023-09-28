package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBoardSecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board_second);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, OnBoardThree.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slidein, R.anim.slideout);
    }
}