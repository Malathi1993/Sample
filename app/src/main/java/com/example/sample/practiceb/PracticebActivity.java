package com.example.sample.practiceb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.sample.R;

public class PracticebActivity extends AppCompatActivity implements View.OnClickListener {

    String [] fruitsList={
"Apple",
"Watermelon",
"Orange",
"Pear",
"Cherry",
"Strawberry",
"Nectarine",
"Grape",
"Mango",
"Blueberry",
"Pomegranate",
"Carambola(U.K)",
"Plum",
"Banana",
"Raspberry",
"Mandarin",
"Jackfruit",
"Papaya",
"Kiwi",
"Pineapple",
"Lime",
"Lemon",

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practiceb);

        LinearLayout linearLayout= findViewById(R.id.container_layout);
        for (int i = 0; i < fruitsList.length; i++) {
            Button button=new Button(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(0,5,0,10);

            button.setLayoutParams(params);
            button.setText(fruitsList[i]);
            linearLayout.addView(button);
            button.setOnClickListener(this);

        }

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, ((Button)v).getText(), Toast.LENGTH_SHORT).show();
    }
}
