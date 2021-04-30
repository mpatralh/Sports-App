package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class input_athlima extends AppCompatActivity {
    EditText inputAthlimaId;
    EditText inputAthlimaName;
    EditText inputAthlimaKind;
    EditText inputAthlimaFylo;
    Button inputButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_athlima);

        inputAthlimaId=findViewById(R.id.inputAthlimaID);
        inputAthlimaName=findViewById(R.id.inputAthlimaName);
        inputAthlimaKind=findViewById(R.id.inputAthlimaKind);
        inputAthlimaFylo=findViewById(R.id.inputAthlimaFilo);
        inputButton=findViewById(R.id.inputAthlimaButton);

        inputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_athlimaId = 0;
                try {
                    Var_athlimaId = Integer.parseInt(inputAthlimaId.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                String Var_SpName=inputAthlimaName.getText().toString();
                String Var_Kind=inputAthlimaKind.getText().toString();
                String Var_AthlimaFylo=inputAthlimaFylo.getText().toString();
                try {


                Athlima athlima=new Athlima();
                athlima.setSportId(Var_athlimaId);
                athlima.setSportName(Var_SpName);
                athlima.setSportKind(Var_Kind);
                athlima.setSportFilo(Var_AthlimaFylo);

                MainActivity.theDatabase.theDaotemp().addAthlima(athlima); }
                catch(Exception e){
                    String message = e.getMessage();
                    Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
                }
                inputAthlimaId.setText("");
                inputAthlimaName.setText("");
                inputAthlimaKind.setText("");
                inputAthlimaFylo.setText("");


            }
        });
    }
}
