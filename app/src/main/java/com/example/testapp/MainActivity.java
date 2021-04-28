package com.example.testapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    public static SportAppDB sportAppDB; //orizw to antikeimeno sportAppDb gia th BD
    //Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Dhmiourgia BD na exei ypostasi sto disko me onoma SportsAppBD kai na diaxeirizetai me to antikeimeno sportAppDb
        sportAppDB = Room.databaseBuilder(getApplicationContext(), SportAppDB.class,"SportsAppBD").allowMainThreadQueries().build();
        //toolbar = findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLout);
        navigationView = findViewById(R.id.navigationView);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.show: {
                        menuItem.setChecked(true);
                        displayMessage("You oppened Show");
                        startActivity(new Intent(MainActivity.this, ShowQuerries.class));
                        drawerLayout.closeDrawers();
                        menuItem.setChecked(false);
                        break;
                    }
                    case R.id.Input: {
                        menuItem.setChecked(true);
                        startActivity(new Intent(MainActivity.this, InputOptionsActivity.class)); //otan patietai to input button gia insertion anoigei to activity InputOptionsActivity
                        displayMessage("You oppened Input");
                        drawerLayout.closeDrawers();
                        menuItem.setChecked(false);
                        break;
                    }
                    case R.id.delete: {
                        menuItem.setChecked(true);
                        startActivity(new Intent(MainActivity.this, DeleteOptions.class)); //otan patietai to input button gia insertion anoigei to activity InputOptionsActivity
                        displayMessage("You oppened Delete");
                        drawerLayout.closeDrawers();
                        menuItem.setChecked(false);
                        break;
                    }
                    case R.id.modify: {
                        menuItem.setChecked(true);
                        displayMessage("You oppened Modify");
                        drawerLayout.closeDrawers();
                        menuItem.setChecked(false);
                        return true;
                    }

                }
                return false;


            }
        });
    }

    void displayMessage(String message) { Toast.makeText( this, message, Toast.LENGTH_LONG).show(); }
}