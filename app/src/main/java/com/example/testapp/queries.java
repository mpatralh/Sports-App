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
            result = result + "\n Id: " + code + "\n Name: " + name + "\n Surname: " + surname + "\n Town:"+town+"\n Country:"+country+"\n SportsID"+sportid+"\n YearOfBirth"+yearofB+"\n";

        }
        textView.setText(result);

    }
}