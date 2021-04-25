package com.example.testapp;

import androidx.room.Database;
        import androidx.room.RoomDatabase;

@Database(entities = {Athlitis.class,Athlima.class,Omada.class},version = 1)
public abstract class TheDatabase extends RoomDatabase {
    public abstract theDao theDaotemp();
}