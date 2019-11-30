package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView simplebook = (ImageView) findViewById(R.id.simplebook);
        ImageView simplecircular = (ImageView) findViewById(R.id.simplecicular);
        simplebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "book", Toast.LENGTH_LONG).show();
            }
        });
        simplecircular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "circular", Toast.LENGTH_LONG).show();
            }
        });
    }


}