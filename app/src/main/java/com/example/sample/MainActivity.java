package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView viewById = (TextView) findViewById(R.id.tvParagraph);
        viewById.setOnClickListener(new MainActivityListener());

        TextView tvHeading = (TextView) findViewById(R.id.tvHeading);
        tvHeading.setOnClickListener(new MainActivityListener());


    }


  /*  @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvParagraph:
                Toast.makeText(this, "toast from paragraph", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvHeading:
                Toast.makeText(this, "toast from heading", Toast.LENGTH_SHORT).show();
                break;


        }
    }*/

    private class MainActivityListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tvParagraph:
                    Toast.makeText(MainActivity.this, "toast from paragraph", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.tvHeading:
                    Toast.makeText(MainActivity.this, "toast from heading", Toast.LENGTH_SHORT).show();
                    break;


            }
        }

    }
}
