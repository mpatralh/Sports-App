package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


import java.util.List;

public class queries extends AppCompatActivity {
   // TextView textView;
    String result = "";
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    TextView querytextView, querytextresult;
    Button bnqueryrun;
    int test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.queries);

        //textView = findViewById(R.id.textView14);

        final String[] queryArray = getResources().getStringArray(R.array.queries_description_array);
        querytextView = findViewById(R.id.string_text);
        spinner = findViewById(R.id.querry_spinner);
        adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.queries_array, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                querytextView.setText(queryArray[position]);
                test = position+1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        querytextresult = findViewById(R.id.textOfResults);
        bnqueryrun = findViewById(R.id.run_button);
          querytextresult.setMovementMethod(new ScrollingMovementMethod()); //energopoihsh scroll leitourgias sto textview twn results
        bnqueryrun.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                querytextresult.setText("test" + test);
                String result = "";
                switch (test) {
                    case 1:
                        int c=0;
                        List<Athlima> athlimalista = MainActivity.theDatabase.theDaotemp().getAthlima();
                        for (Athlima i : athlimalista) {
                            int athlimaCode = i.getSportId();
                            String athlimaName = i.getSportName();
                            String sportKind = i.getSportKind();
                            String sportGender = i.getSportFilo();
                            c++;
                            result = result + "\n ΑΘΛΗΜΑ " + c + ": " + "\n SportID:" + athlimaCode + "\n SportName:" + athlimaName + "\n SportKind:" + sportKind + "\n SportGender:" + sportGender + "\n";
                        }
                        querytextresult.setText(result);
                        break;
                    case 2:
                        int h=0;
                        List<Athlitis> athlitislista = MainActivity.theDatabase.theDaotemp().getAthlites();
                        for (Athlitis i : athlitislista) {
                            int code = i.getAthl_id();
                            String name = i.getName();
                            String surname = i.getSurname();
                            String town = i.getCity();
                            String country = i.getCountry();
                            int sportid = i.getSp_id();
                            int yearofB = i.getBirthYear();
                            result = result + "\n ΑΘΛΗΤΗΣ " + h + ": " + "\n AthlitisID: " + code + "\n Name: " + name + "\n Surname: " + surname + "\n Town:" + town + "\n Country:" + country + "\n SportsID:" + sportid + "\n YearOfBirth:" + yearofB + "\n";
                        }
                            querytextresult.setText(result);
                            break;

                    case 3:
                        List<Omada> teamlista = MainActivity.theDatabase.theDaotemp().getOmada();
                        int g = 0;
                        for (Omada i : teamlista) {
                            int teamID = i.getTeamID();
                            String teamName = i.getTeamName();
                            String teamCountry = i.getTeamCountry();
                            String teamTown = i.getTeamTown();
                            int teamSportID = i.getSportId();
                            String teamStadium = i.getOnomaGipedou();
                            int teamEstablishm = i.getEtosIdrisis();
                            result = result + "\n ΟΜΑΔΑ " + g + ": " + "\n TeamID: " + teamID + "\n TeamName: " + teamName + "\n TeamCountry: " + teamCountry + "\n TeamTowm:" + teamTown + "\n TeamSportID:" + teamSportID + "\n TeamStadium:" + teamStadium + "\n TeamEstablishment:" + teamEstablishm + "\n";
                        }
                        querytextresult.setText(result);
                        break;
                    case 4:
                        List<Integer> athletelist = MainActivity.theDatabase.theDaotemp().getAthleteCount();

                        for (Integer i : athletelist) {
                      //   int count = i.getAthlC(); //apothikeysh sti metavliti count tou apotelesmatos pou epistrefetai apo tin count stin metavliti athlC
                         result = result  + "ΑΘΡΟΙΣΜΑ ΑΘΛΗΤΩΝ :" + i;
                        }
                        querytextresult.setText(result);
                        break;
                    case 5:
                        List<SportSelection> selectFemSp = MainActivity.theDatabase.theDaotemp().getFemaleSports();

                        for (SportSelection i : selectFemSp) {
                            String name = i.getName(); //apothikeysh sti metavliti count tou apotelesmatos pou epistrefetai apo tin count stin metavliti athlC
                            int id = i.getSid();
                            result = result  + "\n ΟΝΟΜΑ ΑΘΛΗΜΑΤΟΣ :" + name + "\n ΜΕ ID : " + id + "\n";
                        }
                        querytextresult.setText(result);
                        break;
                    case 6:
                        List<OmadaSelection> selectSpesOm = MainActivity.theDatabase.theDaotemp().getSpecificOmada();

                        for (OmadaSelection i : selectSpesOm) {
                           String sport = i.getSport();
                           String team = i.getTeam();
                           String athlete = i.getAthlete();
                            result = result  + "\n ΟΝΟΜΑ ΑΘΛΗΜΑΤΟΣ :" + sport + "\n ΟΝΟΜΑ ΟΜΑΔΑΣ : " + team + "\n ΟΝΟΜΑ ΑΘΛΗΤΗ :" + athlete + "\n";
                        }
                        querytextresult.setText(result);
                        break;
                }
            }
        });

    }
}









/*

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
    */

