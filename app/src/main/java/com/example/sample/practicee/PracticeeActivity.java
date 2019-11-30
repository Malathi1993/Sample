package com.example.sample.practicee;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sample.R;


    public class PracticeeActivity extends AppCompatActivity implements View.OnClickListener {
        LinearLayout containerLayout;
        LinearLayout containerLayout1;
        private boolean toggled=false;
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_practicee);
            containerLayout = findViewById(R.id.colored_container);
            containerLayout1 = findViewById(R.id.colored_container1);
            containerLayout.setOnClickListener(this);
            containerLayout1.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            toggled=!toggled;
            if (toggled){

                containerLayout.setBackgroundColor(Color.BLACK);
                containerLayout1.setBackgroundColor(Color.YELLOW);

            }
            else {
                containerLayout.setBackgroundColor(Color.YELLOW);
                containerLayout1.setBackgroundColor(Color.BLACK);
            }
        }
    }
