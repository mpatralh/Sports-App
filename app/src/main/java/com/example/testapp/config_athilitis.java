package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class config_athilitis extends AppCompatActivity {
    EditText conAthlitisId;
    EditText conAthlitisName;
    EditText conAthlitisSurname;
    EditText conAthlitisTown;
    EditText conAthlitisCountry;
    EditText conAthlitisSportsId;
    EditText conAthlitisYearOfBirth;
    Button conAthlitisButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config_athilitis);

        conAthlitisId=findViewById(R.id.configAthleteID);
        conAthlitisName=findViewById(R.id.configAthleteName);
        conAthlitisSurname=findViewById(R.id.configAthleteLastName);
        conAthlitisTown=findViewById(R.id.configAthleteTown);
        conAthlitisCountry=findViewById(R.id.configAthleteCountry);
        conAthlitisSportsId=findViewById(R.id.configAthleteSportID);
        conAthlitisYearOfBirth=findViewById(R.id.configAthleteYearOfB);
        conAthlitisButton=findViewById(R.id.configAthleteButton);

        conAthlitisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_athlitisId = 0;
                try {
                    Var_athlitisId = Integer.parseInt(conAthlitisId.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                int Var_SportsId = 0;
                try {
                    Var_SportsId = Integer.parseInt(conAthlitisSportsId.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                int Var_YearOfBirth=0;
                try {
                    Var_YearOfBirth = Integer.parseInt(conAthlitisYearOfBirth.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                String Var_name = conAthlitisName.getText().toString();
                String Var_surname = conAthlitisSurname.getText().toString();
                String Var_Town= conAthlitisTown.getText().toString();
                String Var_Country=conAthlitisCountry.getText().toString();


                Athlitis athlitis = new Athlitis();
                athlitis.setAthl_id(Var_athlitisId);
                athlitis.setName(Var_name);
                athlitis.setSurname(Var_surname);
                athlitis.setCity(Var_Town);
                athlitis.setCountry(Var_Country);
                athlitis.setSp_id(Var_SportsId);
                athlitis.setBirthYear(Var_YearOfBirth);

                MainActivity.theDatabase.theDaotemp().updateAthliti(athlitis);
                conAthlitisId.setText("");
                conAthlitisName.setText("");
                conAthlitisSurname.setText("");
                conAthlitisTown.setText("");
                conAthlitisCountry.setText("");
                conAthlitisSportsId.setText("");
                conAthlitisYearOfBirth.setText("");

            }

        });
    }
}