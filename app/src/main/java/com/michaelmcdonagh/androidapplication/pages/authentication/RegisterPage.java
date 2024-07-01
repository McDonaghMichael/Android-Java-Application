package com.michaelmcdonagh.androidapplication.pages.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.michaelmcdonagh.androidapplication.MainActivity;
import com.michaelmcdonagh.androidapplication.R;
import com.michaelmcdonagh.androidapplication.pages.home.Homepage;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.registerpage);

        TextView textView = findViewById(R.id.login_link);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterPage.this, LoginPage.class);
                startActivity(intent);
                finish();
            }
        });


    }
}