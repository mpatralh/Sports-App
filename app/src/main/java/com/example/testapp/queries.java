package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

public class queries extends AppCompatActivity {
    TextView textView;
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.queries);
        textView = findViewById(R.id.textView14);


        List<Athlitis> athlitis = MainActivity.theDatabase.theDaotemp().getUsers();
        for (Athlitis i : athlitis) {
            int code = i.getAthl_id();
            String name = i.getName();
            String surname = i.getSurname();
            String town = i.getCity();
            String country = i.getCountry();
            int sportid = i.getSp_id();
            int yearofB = i.getBirthYear();
            result = result + "\n AthlitisID: " + code + "\n Name: " + name + "\n Surname: " + surname + "\n Town:" + town + "\n Country:" + country + "\n SportsID:" + sportid + "\n YearOfBirth:" + yearofB + "\n";

        }


        List<Athlima> athlima = MainActivity.theDatabase.theDaotemp().getAthlima();
        for (Athlima i : athlima) {
            int athlimaCode = i.getSportId();
            String athlimaName = i.getSportName();
            String sportKind = i.getSportKind();
            String sportGender = i.getSportFilo();
            result = result + "\n SportID:" + athlimaCode + "\n SportName:" + athlimaName + "\n SportKind:" + sportKind + "\n SportGender:" + sportGender + "\n";
        }
        List<Omada> omada = MainActivity.theDatabase.theDaotemp().getOmada();
        for (Omada i : omada) {
            int teamID = i.getTeamID();
            String teamName = i.getTeamName();
            String teamCountry = i.getTeamCountry();
            String teamTown = i.getTeamTown();
            int teamSportID = i.getSportId();
            String teamStadium = i.getOnomaGipedou();
            int teamEstablishm = i.getEtosIdrisis();
            result = result + "\n TeamID: " + teamID + "\n TeamName: " + teamName + "\n TeamCountry: " + teamCountry + "\n TeamTowm:" + teamTown + "\n TeamSportID:" + teamSportID + "\n TeamStadium:" + teamStadium + "\n TeamEstablishment:" + teamEstablishm + "\n";
        }

        textView.setText(result);



    }
}