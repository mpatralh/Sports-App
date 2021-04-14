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
        setContentView(R.layout.chooseconfig);

        button=(Button)findViewById(R.id.MatchId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseconfig.this, config_agwnas.class));
            }
        });



        button=(Button)findViewById(R.id.AthleteId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseconfig.this, config_athilitis.class));
            }
        });

        button=(Button)findViewById(R.id.SportId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseconfig.this, config_athima.class));
            }
        });

        button=(Button)findViewById(R.id.TeamId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseconfig.this, config_omada.class));
            }
        });


    }
}