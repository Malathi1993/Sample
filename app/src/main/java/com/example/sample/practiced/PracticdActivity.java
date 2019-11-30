package com.example.sample.practiced;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sample.R;

public class PracticdActivity extends AppCompatActivity implements View.OnClickListener {

    View view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practiced);
        view=findViewById(R.id.colored_container);
        Button redButton=findViewById(R.id.btnRed);
        Button blueButton=findViewById(R.id.btnBlue);
        Button greenButton=findViewById(R.id.btnGreen);
        redButton.setOnClickListener(this);
        blueButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnRed:
                view.setBackgroundColor(Color.RED);
                break;
            case R.id.btnBlue:
                view.setBackgroundColor(Color.BLUE);
                break;
            case R.id.btnGreen:
                view.setBackgroundColor(Color.GREEN);
                break;

        }

    }

}


