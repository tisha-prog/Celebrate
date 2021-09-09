package com.workshop.celebrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText input;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.textv);
        input=findViewById(R.id.input2);
        button=findViewById(R.id.button2);

    }

    public void clicked(View view) {//code for functionality of the button

        String s = input.getText().toString();

        //code for toast
        Toast.makeText(this,"Button is clicked",Toast.LENGTH_SHORT).show();

        //code for screen change
        Intent i = new Intent(this,Second.class);

        //send input to second activity
        i.putExtra("friend",s);
        startActivity(i);



    }
}