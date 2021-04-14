package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_chooseinput extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseinput);


        button=(Button)findViewById(R.id.MatchId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_chooseinput.this,activity_show_agwnas.class));
            }
        });



        button=(Button)findViewById(R.id.AthleteId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_chooseinput.this,activity_show_athlitis.class));
            }
        });

        button=(Button)findViewById(R.id.SportId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_chooseinput.this,activity_show_athlima.class));
            }
        });

        button=(Button)findViewById(R.id.TeamId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_chooseinput.this,activity_show_omada.class));
            }
        });

    }
}