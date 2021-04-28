package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OmadaDeleteActiv extends AppCompatActivity {
    Button teamdeletebutton; // orizw ena antikeimeno ths taksis koubi
    EditText teamdeleditText;
    public OmadaDeleteActiv() {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omada_delete);

        teamdeleditText = findViewById(R.id.team_text_id_delete);
        teamdeletebutton = findViewById(R.id.delete_tm_button);
        teamdeletebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_teamid = 0;
                try {
                    Var_teamid = Integer.parseInt(teamdeleditText.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                Athlima sport = new Athlima();
                sport.setSport_code(Var_teamid);
                MainActivity.sportAppDB.sportdaotemp().deleteSport(sport);
                teamdeleditText.setText("");
            }
        });



    }
}