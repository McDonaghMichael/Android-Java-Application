package com.michaelmcdonagh.androidapplication.pages.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.michaelmcdonagh.androidapplication.R;
import com.michaelmcdonagh.androidapplication.pages.home.Homepage;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.loginpage);

        Button loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginPage.this, Homepage.class);
                startActivity(intent);
                finish();
            }
        });

    }
}