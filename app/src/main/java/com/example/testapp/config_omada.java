package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class config_omada extends AppCompatActivity {
    EditText conTeamId;
    EditText conTeamName;
    EditText conTeamStadium;
    EditText conTeamTown;
    EditText conTeamCountry;
    EditText conTeamSportsId;
    EditText conTeamEstablishm;
    Button conTeamButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config_omada);

        conTeamId=findViewById(R.id.configTeamID);
        conTeamName=findViewById(R.id.configTeamName);
        conTeamStadium=findViewById(R.id.configTeamStadium);
        conTeamTown=findViewById(R.id.configTeamTown);
        conTeamCountry=findViewById(R.id.configTeamCountry);
        conTeamSportsId=findViewById(R.id.configTeamSportID);
        conTeamEstablishm=findViewById(R.id.configTeamEstablishmentY);
        conTeamButton=findViewById(R.id.configTeamButton);

        conTeamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_teamId=0;
                try {
                    Var_teamId = Integer.parseInt(conTeamId.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                int Var_sportid=0;
                try {
                    Var_sportid = Integer.parseInt(conTeamSportsId.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                int Var_establishm=0;
                try {
                    Var_establishm = Integer.parseInt(conTeamEstablishm.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                String Var_teamName=conTeamName.getText().toString();
                String Var_stadiumname=conTeamStadium.getText().toString();
                String Var_teamTown=conTeamTown.getText().toString();
                String Var_teamCountry=conTeamCountry.getText().toString();

                Omada omada=new Omada();
                omada.setTeamID(Var_teamId);
                omada.setTeamName(Var_teamName);
                omada.setTeamCountry(Var_teamCountry);
                omada.setTeamTown(Var_teamTown);
                omada.setOnomaGipedou(Var_stadiumname);
                omada.setEtosIdrisis(Var_establishm);
                omada.setSportId(Var_sportid);

                MainActivity.theDatabase.theDaotemp().updateOmada(omada);
                conTeamId.setText("");
                conTeamName.setText("");
                conTeamEstablishm.setText("");
                conTeamCountry.setText("");
                conTeamTown.setText("");
                conTeamSportsId.setText("");
                conTeamStadium.setText("");
            }
        });
    }
}