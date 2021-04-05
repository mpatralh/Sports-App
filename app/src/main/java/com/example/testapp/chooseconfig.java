package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseconfig extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseconfig);

        button=(Button)findViewById(R.id.chooseMatchCon);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseconfig.this,activity_config_omada.class));
            }
        });



        button=(Button)findViewById(R.id.chooseAthleteCon);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseconfig.this,activity_config_athilitis.class));
            }
        });

        button=(Button)findViewById(R.id.chooseSportCon);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseconfig.this,activity_config_athima.class));
            }
        });

        button=(Button)findViewById(R.id.chooseTeamcon);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseconfig.this,activity_config_omada.class));
            }
        });


    }
}