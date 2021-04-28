package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class input_athlitis extends AppCompatActivity {
    EditText inputAthlitisId;
    EditText inputAthlitisName;
    EditText inputAthlitisSurname;
    EditText inputAthlitisTown;
    EditText inputAthlitisCountry;
    EditText inputAthlitisSportsId;
    EditText inputAthlitisYearOfBirth;
    Button inputAthlitisButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_athlitis);

        Context context = getApplicationContext();
        CharSequence text = "Success input!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);

        inputAthlitisId=findViewById(R.id.inputAthlitisId);
        inputAthlitisName=findViewById(R.id.inputAthlitisName);
        inputAthlitisSurname=findViewById(R.id.inputAthlitisSurname);
        inputAthlitisTown=findViewById(R.id.inputAthlitisTown);
        inputAthlitisCountry=findViewById(R.id.inputAthlitisCountry);
        inputAthlitisSportsId=findViewById(R.id.inputAthlitisSportsCode);
        inputAthlitisYearOfBirth=findViewById(R.id.inputAthlitisYearOfBirth);
        inputAthlitisButton=findViewById(R.id.inputAthlitisButton);

        inputAthlitisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_athlitisId = 0;
                try {
                    Var_athlitisId = Integer.parseInt(inputAthlitisId.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                int Var_SportsId = 0;
                try {
                    Var_SportsId = Integer.parseInt(inputAthlitisSportsId.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                int Var_YearOfBirth=0;
                try {
                    Var_YearOfBirth = Integer.parseInt(inputAthlitisYearOfBirth.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                String Var_name = inputAthlitisName.getText().toString();
                String Var_surname = inputAthlitisSurname.getText().toString();
                String Var_Town= inputAthlitisTown.getText().toString();
                String Var_Country=inputAthlitisCountry.getText().toString();


                Athlitis athlitis = new Athlitis();
                athlitis.setAthl_id(Var_athlitisId);
                athlitis.setName(Var_name);
                athlitis.setSurname(Var_surname);
                athlitis.setCity(Var_Town);
                athlitis.setCountry(Var_Country);
                athlitis.setSp_id(Var_SportsId);
                athlitis.setBirthYear(Var_YearOfBirth);

                MainActivity.theDatabase.theDaotemp().addAthlete(athlitis);
                toast.show();
                inputAthlitisId.setText("");
                inputAthlitisName.setText("");
                inputAthlitisSurname.setText("");
                inputAthlitisTown.setText("");
                inputAthlitisCountry.setText("");
                inputAthlitisSportsId.setText("");
                inputAthlitisYearOfBirth.setText("");

            }

        });


    }
}