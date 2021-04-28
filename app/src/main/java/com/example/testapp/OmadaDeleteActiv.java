package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OmadaDeleteActiv extends AppCompatActivity {
    Button teamdeletebutton; // orizw ena antikeimeno ths taksis koubi
    EditText teamdeleditText;
    public OmadaDeleteActiv() {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omada_delete);
        Context context = getApplicationContext();
        CharSequence text = "Deleted successfully!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);

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
                Omada team = new Omada();
                team.setTeamID(Var_teamid);
                MainActivity.theDatabase.theDaotemp().deleteTeam(team);
                toast.show();
                teamdeleditText.setText("");
            }
        });



    }
}