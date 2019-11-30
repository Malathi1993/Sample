package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Layout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class CustomRadioButtonActivity extends AppCompatActivity {
    RadioGroup rg;
    ConstraintLayout rl;
    RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_radio_button);
        rg = new RadioGroup(this);
        rl = (ConstraintLayout) findViewById(R.id.ConstraintLayout);
        rb1 = new RadioButton(this);
        rb2 = new RadioButton(this);

        rb1.setText("Male");
        rb2.setText("Female");
        rg.addView(rb1);
        rg.addView(rb2);
        rg.setOrientation(RadioGroup.HORIZONTAL);

        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams((int) ConstraintLayout.LayoutParams.WRAP_CONTENT,(int) ConstraintLayout.LayoutParams.WRAP_CONTENT);
        params.leftMargin =150;
        params.topMargin = 100;

        rg.setLayoutParams(params);
        rl.addView(rg);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) findViewById(checkedId);
                Toast.makeText(getApplicationContext(),radioButton.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
