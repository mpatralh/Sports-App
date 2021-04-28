package com.example.testapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Athlima.class, Athlitis.class, Omada.class}, version = 1)
public abstract class SportAppDB extends RoomDatabase {
    public abstract sportdao sportdaotemp(); //prosthiki dao pou xrisimopoiw
}
