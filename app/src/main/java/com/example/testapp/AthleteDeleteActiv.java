package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AthleteDeleteActiv extends AppCompatActivity {
    Button athletedeletebutton; // orizw ena antikeimeno ths taksis koubi
    EditText athletedeleditText;
    public AthleteDeleteActiv() {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_athlete_delete);

        athletedeleditText = findViewById(R.id.athlete_text_id_delete);
        athletedeletebutton= findViewById(R.id.delete_athl_button);
        athletedeletebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_athletetid = 0;
                try {
                    Var_athletetid = Integer.parseInt(athletedeleditText.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                Athlitis athlete = new Athlitis();
                athlete.setAthleteCode(Var_athletetid);
                MainActivity.sportAppDB.sportdaotemp().deleteAthlete(athlete);
                athletedeleditText.setText("");
            }
        });


    }
}