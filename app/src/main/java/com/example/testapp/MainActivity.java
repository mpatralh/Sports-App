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





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout = findViewById(R.id.drawerLout);
        navigationView = findViewById(R.id.navigationView);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.show: {
                        displayMessage("You opened queries activity");
                        startActivity(new Intent(MainActivity.this,activity_queries.class));
                        drawerLayout.closeDrawers();
                        break;
                    }
                    case R.id.Input: {
                        displayMessage("You have to input the values");
                        startActivity(new Intent(MainActivity.this,activity_chooseinput.class));
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