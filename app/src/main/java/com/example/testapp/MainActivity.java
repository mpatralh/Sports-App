package com.example.testapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    //Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                        drawerLayout.closeDrawers();
                        break;
                    }
                    case R.id.Input: {
                        menuItem.setChecked(true);

                        drawerLayout.closeDrawers();
                        break;
                    }
                    case R.id.delete: {
                        menuItem.setChecked(true);

                        drawerLayout.closeDrawers();
                        break;
                    }
                    case R.id.modify: {
                        menuItem.setChecked(true);

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