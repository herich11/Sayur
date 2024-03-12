package com.sayur;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] items = {
            "Bayam", "Wortel", "Brokoli", "Terong", "Sawi", "Seledri",
            "Tomat", "Selada", "Labu Siam", "Buncis", "Jagung", "Kangkung"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("item", items[position]);
            startActivity(intent);
        });

        Button aboutButton = findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}
