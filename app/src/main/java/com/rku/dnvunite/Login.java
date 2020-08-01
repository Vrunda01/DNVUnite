package com.rku.dnvunite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button btnContact;
    Button btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnContact = (Button)findViewById(R.id.btn_contact);
        btnAbout = (Button)findViewById(R.id.btn_about);

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutActivity();
            }
        });
    }

    public void openNewActivity() {
        Intent intent = new Intent(this,  Contact.class);
        startActivity(intent);
    }

    public void openAboutActivity() {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }
}
