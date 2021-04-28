package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SportDeleteActiv extends AppCompatActivity {
Button sportdeletebutton; // orizw ena antikeimeno ths taksis koubi
EditText sportdeleditText;
public SportDeleteActiv() {

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_delete);


        sportdeleditText = findViewById(R.id.sport_text_id_delete);
        sportdeletebutton = findViewById(R.id.delete_sp_button);
        sportdeletebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_sportid = 0;
                try {
                    Var_sportid = Integer.parseInt(sportdeleditText.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                Athlima sport = new Athlima();
                sport.setSportId(Var_sportid);
                MainActivity.theDatabase.theDaotemp().deleteSport(sport);
                sportdeleditText.setText("");
            }
        });
    }
}