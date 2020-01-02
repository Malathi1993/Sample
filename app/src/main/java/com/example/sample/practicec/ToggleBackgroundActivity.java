package com.example.sample.practicec;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sample.R;

public class ToggleBackgroundActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout containerLayout;
    Button tvLabelView;
    private boolean toggled=false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_constrain);

        containerLayout = findViewById(R.id.content_layout1);
        containerLayout.setOnClickListener(this);
        containerLayout.setSelected(true);
        tvLabelView = findViewById(R.id.tvLabel);
        tvLabelView.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        toggled=!toggled;
//        containerLayout.setSelected(toggled);
        if (toggled){

            containerLayout.setBackgroundColor(Color.BLACK);
            ((TextView)tvLabelView).setTextColor(Color.WHITE);
            ((TextView)tvLabelView).setTextSize(18);

        }else {
            containerLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            ((TextView)tvLabelView).setTextColor(Color.BLACK);

            ((TextView)tvLabelView).setTextSize(45);


        }
        ((TextView)tvLabelView).setText("selected : "+toggled);

    }
}
