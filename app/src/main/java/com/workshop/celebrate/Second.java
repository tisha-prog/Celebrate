package com.workshop.celebrate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Second extends AppCompatActivity {
   ImageView img;
   TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        img=findViewById(R.id.wishimage);
        txt=findViewById(R.id.wishtext);

        String display= getIntent().getStringExtra("friend");
        txt.setText("Happy Birthday To My dear Friend "+display+ " !!!!!! ");
    }
}