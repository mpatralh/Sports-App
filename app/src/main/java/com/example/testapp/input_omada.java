package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class input_omada extends AppCompatActivity {
    EditText inputTeamId;
    EditText inputTeamName;
    EditText inputTeamStadium;
    EditText inputTeamTown;
    EditText inputTeamCountry;
    EditText inputTeamSportsId;
    EditText inputTeamEstablishm;
    Button inputTeamButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_omada);

        Context context = getApplicationContext();
        CharSequence text = "Success input!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);

        inputTeamId=findViewById(R.id.inputTeamId);
        inputTeamName=findViewById(R.id.inputTeamName);
        inputTeamStadium=findViewById(R.id.inputTeamStadium);
        inputTeamTown=findViewById(R.id.inputTeamTown);
        inputTeamCountry=findViewById(R.id.inputTeamCountry);
        inputTeamSportsId=findViewById(R.id.inputTeamSportID);
        inputTeamEstablishm=findViewById(R.id.inputTeamEstablishment);
        inputTeamButton=findViewById(R.id.inputTeamButton);

        inputTeamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_teamId=0;
                try {
                    Var_teamId = Integer.parseInt(inputTeamId.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                int Var_sportid=0;
                try {
                    Var_sportid = Integer.parseInt(inputTeamSportsId.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                int Var_establishm=0;
                try {
                    Var_establishm = Integer.parseInt(inputTeamEstablishm.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                String Var_teamName=inputTeamName.getText().toString();
                String Var_stadiumname=inputTeamStadium.getText().toString();
                String Var_teamTown=inputTeamTown.getText().toString();
                String Var_teamCountry=inputTeamCountry.getText().toString();

                Omada omada=new Omada();
                omada.setTeamID(Var_teamId);
                omada.setTeamName(Var_teamName);
                omada.setTeamCountry(Var_teamCountry);
                omada.setTeamTown(Var_teamTown);
                omada.setOnomaGipedou(Var_stadiumname);
                omada.setEtosIdrisis(Var_establishm);
                omada.setSportId(Var_sportid);

                MainActivity.theDatabase.theDaotemp().addOmada(omada);
                toast.show();
                inputTeamId.setText("");
                inputTeamName.setText("");
                inputTeamEstablishm.setText("");
                inputTeamCountry.setText("");
                inputTeamTown.setText("");
                inputTeamSportsId.setText("");
                inputTeamStadium.setText("");


            }
        });
    }
}