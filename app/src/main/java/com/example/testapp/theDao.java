package com.example.testapp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface theDao {
    @Insert
    public void addAthlete(Athlitis athlitis);

    @Query("select * from athlitis")
    public List<Athlitis> getUsers();

    @Insert
    public void addAthlima(Athlima athlima);

    @Query("select * from athlima")
    public List<Athlima> getAthlima();

    @Insert void addOmada(Omada omada);

    @Query("select * from omada")
    public  List<Omada> getOmada();
}
