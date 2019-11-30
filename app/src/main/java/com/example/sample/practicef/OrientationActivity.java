package com.example.sample.practicef;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.sample.R;

import org.w3c.dom.Text;

public class OrientationActivity extends AppCompatActivity {
EditText userName,password;
Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);
         userName =(EditText) findViewById(R.id.et_user);
         password = (EditText) findViewById(R.id.et_password);
         login=findViewById(R.id.login);
         login.setOnClickListener(new View.OnClickListener(){
        @Override
    public void onClick(View view) {
             String name=userName.getText().toString();
            String passwordText = password.getText().toString();
            showToastMsg(name,passwordText);
         }

        });
    }
    private void showToastMsg(String username,String password){

                    Toast.makeText(this,"Username :"+username+ '\n' +"password :"+password, Toast.LENGTH_LONG).show();
                }

}