package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DeleteOptions extends AppCompatActivity {
    Button switchToSecondActivity; //dimiourgia antikeimenou ths klasis Button


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_options);

        switchToSecondActivity = findViewById(R.id.sport_delete_btn); //apothikeysi tou delete button sto switchToSecondActivity
        switchToSecondActivity.setOnClickListener(new View.OnClickListener() {  //orizoume Listener me to OnClick
            @Override
            public void onClick(View view) {
                switchActivities1(); //kaloume ti methodo switchActivities
            }
        });

        Button gotoAthleteAct = (Button)findViewById(R.id.athlete_delete_btn);
        gotoAthleteAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchActivities2();
            }
        });
        Button gotoTeamAct = (Button)findViewById(R.id.team_delete_btn);
        gotoTeamAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchActivities3();
            }

        });
    }

    private void switchActivities1() {
        Intent switchActivityIntent = new Intent(this, SportDeleteActiv.class); //pername sti metavliti switchActivityIntent to SportDeleteActiv pou einai to Activity gia ti diagrafi athlimatos
        startActivity(switchActivityIntent);  // kanoume start to Activity gia th diagrafi pou perasame prohgoumenos se ayti ti metavliti
    }
    private void switchActivities2() {
        Intent switchActivityIntent2 = new Intent(this, AthleteDeleteActiv.class); //pername sti metavliti switchActivityIntent to AthleteDeleteActiv pou einai to Activity gia ti diagrafi athlimatos
        startActivity(switchActivityIntent2);  // kanoume start to Activity gia th diagrafi pou perasame prohgoumenos se ayti ti metavliti
    }
    private void switchActivities3() {
        Intent switchActivityIntent3 = new Intent(this,OmadaDeleteActiv.class); //pername sti metavliti switchActivityIntent to OmadaDeleteActiv pou einai to Activity gia ti diagrafi athlimatos
        startActivity(switchActivityIntent3);  // kanoume start to Activity gia th diagrafi pou perasame prohgoumenos se ayti ti metavliti
    }
}