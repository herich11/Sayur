package com.sayur;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView detailText = findViewById(R.id.detailText);
        String item = getIntent().getStringExtra("item");
        detailText.setText(item);
    }
}
