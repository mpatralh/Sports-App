package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseinput extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chooseinput);


        button=(Button)findViewById(R.id.MatchId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseinput.this, input_match.class));
            }
        });



        button=(Button)findViewById(R.id.AthleteId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseinput.this, input_athlitis.class));
            }
        });

        button=(Button)findViewById(R.id.SportId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseinput.this, input_athlima.class));
            }
        });

        button=(Button)findViewById(R.id.TeamId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseinput.this, input_omada.class));
            }
        });

    }
}