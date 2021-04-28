package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ShowQuerries extends AppCompatActivity {
TextView  textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_querries);

        textView=findViewById(R.id.textView14);
        List<Athlima> athlima=MainActivity.sportAppDB.sportdaotemp().getAthlima();
        String result ="";
        for(Athlima i:athlima){
            int athlimaCode=i.getSport_code();
            String athlimaName=i.getSportName();
            String sportKind=i.getSport_type();
            String sportGender=i.getSport_gender();
            result = result+"\n SportID:"+athlimaCode+"\n SportName:"+athlimaName+"\n SportKind:"+sportKind+"\n SportGender:"+sportGender+"\n";
        }
        textView.setText(result);
    }
}