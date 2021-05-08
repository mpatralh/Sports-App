package com.example.testapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    public static TheDatabase theDatabase;
    public static FragmentManager fragmentManager;
    public static FirebaseFirestore db;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = FirebaseFirestore.getInstance();

        fragmentManager = getSupportFragmentManager();
        if(findViewById(R.id.fragment_container)!=null){
            if(savedInstanceState!=null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container, new InsertFragment()).commit();
        }


        theDatabase= Room.databaseBuilder(getApplicationContext(),TheDatabase.class,"theDB").allowMainThreadQueries().build();


        drawerLayout = findViewById(R.id.drawerLout); //gia menu
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.show: {
                        displayMessage("You opened queries activity");
                        startActivity(new Intent(MainActivity.this, queries.class));
                        drawerLayout.closeDrawers();
                        break;
                    }
                    case R.id.Input: {
                        displayMessage("You have to input the values");
                        startActivity(new Intent(MainActivity.this, chooseinput.class));
                        drawerLayout.closeDrawers();
                        break;
                    }
                    case R.id.delete: {
                        drawerLayout.closeDrawers();
                        break;
                    }
                    case R.id.modify: {
                        displayMessage("You have to choose what to config");
                        startActivity(new Intent(MainActivity.this,chooseconfig.class));
                        drawerLayout.closeDrawers();
                        return true;

                    }


                }
                return false;


            }
        });
    }

    void displayMessage(String message) { Toast.makeText( this, message, Toast.LENGTH_LONG).show(); }




}