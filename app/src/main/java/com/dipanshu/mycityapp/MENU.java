package com.dipanshu.mycityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.dipanshu.mycityapp.Weather_dir.MainActivity1;

public class MENU extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Button travelbtn=findViewById(R.id.travel);
        travelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),TRAVEL.class);
                startActivity(i);
            }
        });
        Button hotelbtn=findViewById(R.id.hotels);
        hotelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),hotels.class);
                startActivity(i);
            }
        });


//        Button chatbtn=findViewById(R.id.chat);
//        chatbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getBaseContext(),ScrollingActivity.class);
//                startActivity(i);
//            }
//        });

        Button newsbtn=findViewById(R.id.news);
        newsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),newsclass.class);
                startActivity(i);
            }
        });

        ImageButton loginbtn=findViewById(R.id.login);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),login.class);
                startActivity(i);
            }
        });

    }
}
