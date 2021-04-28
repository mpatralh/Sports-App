package com.example.testapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface theDao {
    @Insert
    public void addAthlete(Athlitis athlitis);

    @Query("select * from athlitis")
    public List<Athlitis> getUsers();

    @Update
    public void updateAthliti(Athlitis athlitis);

    @Delete
    public void deleteSport(Athlima athlima); //orismos methodou gia delete athliti

    @Delete
    public void deleteAthlete(Athlitis athlete);

    @Delete
    public void deleteTeam(Omada team); //orismos methodou gia delete omadas

    @Insert
    public void addAthlima(Athlima athlima);

    @Query("select * from athlima")
    public List<Athlima> getAthlima();

    @Update
    public void updateAthlima(Athlima athlima);

    @Insert void addOmada(Omada omada);

    @Query("select * from omada")
    public  List<Omada> getOmada();

    @Update
    public  void updateOmada(Omada omada);


}
