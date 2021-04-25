package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class config_athima extends AppCompatActivity {
    EditText configAthlimaId;
    EditText configAthlimaName;
    EditText configAthlimaKind;
    EditText configAthlimaFylo;
    Button configButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config_athima);

        configAthlimaId=findViewById(R.id.configSportID);
        configAthlimaName=findViewById(R.id.configSportName);
        configAthlimaKind=findViewById(R.id.configSPortKind);
        configAthlimaFylo=findViewById(R.id.configSportGender);
        configButton=findViewById(R.id.configSportButton);

        configButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_athlimaId = 0;
                try {
                    Var_athlimaId = Integer.parseInt(configAthlimaId.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                String Var_SpName=configAthlimaName.getText().toString();
                String Var_Kind=configAthlimaKind.getText().toString();
                String Var_AthlimaFylo=configAthlimaFylo.getText().toString();

                Athlima athlima=new Athlima();
                athlima.setSportId(Var_athlimaId);
                athlima.setSportName(Var_SpName);
                athlima.setSportKind(Var_Kind);
                athlima.setSportFilo(Var_AthlimaFylo);

                MainActivity.theDatabase.theDaotemp().updateAthlima(athlima);
                configAthlimaId.setText("");
                configAthlimaName.setText("");
                configAthlimaKind.setText("");
                configAthlimaFylo.setText("");


            }
        });
    }
}