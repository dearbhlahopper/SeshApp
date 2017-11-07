package com.example.hopper.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    private Button Login;
    private Button SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Login = (Button)findViewById(R.id.btnLogin);
        SignUp = (Button)findViewById(R.id.btnSignUp);

        final Intent intent = new Intent(Main3Activity.this,MainActivity.class);
        Login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(intent);
            }
        });
        SignUp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(Main3Activity.this,Main2Activity.class));
            }
        });
    }

    /*public void onClick(View view){
        if(view.getId() == R.id.btnLogin){
            startActivity(new Intent(Main3Activity.this,MainActivity.class));
        }
        else{
            startActivity(new Intent(Main3Activity.this,Main2Activity.class));
        }
    }*/
}