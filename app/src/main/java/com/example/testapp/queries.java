package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.List;

public class queries extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.queries);

        textView=findViewById(R.id.textView14);
        List<Athlitis> athlitis = MainActivity.theDatabase.theDaotemp().getUsers();
        String result ="";
        for (Athlitis i: athlitis) {
            int code = i.getAthl_id();
            String name = i.getName();
            String surname = i.getSurname();
            String town=i.getCity();
            String country=i.getCountry();
            int sportid=i.getSp_id();
            int yearofB=i.getBirthYear();
            result = result + "\n AthlitisID: " + code + "\n Name: " + name + "\n Surname: " + surname + "\n Town:"+town+"\n Country:"+country+"\n SportsID:"+sportid+"\n YearOfBirth:"+yearofB+"\n";

        }
        List<Athlima>athlima=MainActivity.theDatabase.theDaotemp().getAthlima();
        for(Athlima i:athlima){
            int athlimaCode=i.getSportId();
            String athlimaName=i.getSportName();
            String sportKind=i.getSportKind();
            String sportGender=i.getSportFilo();
            result=result+"\n SportID:"+athlimaCode+"\n SportName:"+athlimaName+"\n SportKind:"+sportKind+"\n SportGender:"+sportGender+"\n";
        }
        textView.setText(result);

    }
}