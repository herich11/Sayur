package com.sayur;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView imageView = findViewById(R.id.imageView);
        TextView nameText = findViewById(R.id.nameText);
        TextView emailText = findViewById(R.id.emailText);

        // Set foto, nama, dan email
        imageView.setImageResource(R.drawable.your_photo);
        nameText.setText("Heri Cahyono");
        emailText.setText("hericahyononew@gmail.com");
    }
}
