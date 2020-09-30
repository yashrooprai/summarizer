package com.example.textsumrz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
    }
    public void upload (View view){
        Intent intent = new Intent(this, thirdpage.class);
        startActivity(intent);
    }
}