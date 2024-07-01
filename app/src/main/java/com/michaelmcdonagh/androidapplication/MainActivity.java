package com.michaelmcdonagh.androidapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.michaelmcdonagh.androidapplication.pages.authentication.LoginPage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(MainActivity.this, LoginPage.class);
        startActivity(intent);
        finish();
    }


}