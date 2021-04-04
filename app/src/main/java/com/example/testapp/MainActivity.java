package com.example.testapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
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
                        displayMessage("You oppened queries activity");
                        startActivity(new Intent(MainActivity.this,activity_queries.class));
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
                    case R.id.match: {
                        displayMessage("You oppened config match activity");
                        startActivity(new Intent(MainActivity.this,activity_config_agwnas.class));
                        drawerLayout.closeDrawers();
                        return true;

                    }
                    case R.id.athlete: {
                        displayMessage("You oppened config athlete activity");
                        startActivity(new Intent(MainActivity.this,activity_config_athilitis.class));
                        drawerLayout.closeDrawers();
                        return true;

                    }
                    case R.id.sport: {
                        displayMessage("You oppened config sport activity");
                        startActivity(new Intent(MainActivity.this,activity_config_athima.class));
                        drawerLayout.closeDrawers();
                        return true;

                    }
                    case R.id.team: {
                        displayMessage("You oppened config team activity");
                        startActivity(new Intent(MainActivity.this,activity_config_omada.class));
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