package com.example.testapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface sportdao {
    @Insert //energopoiisi leitourgias insert
    public void addSport(Athlima athlima); //orismos methodou gia insert

    @Delete
    public void deleteSport(Athlima athlima); //orismos methodou gia delete athliti

    @Delete
    public void deleteAthlete(Athlitis athlete);

    @Delete
    public void deleteTeam(Omada team); //orismos methodou gia delete omadas

    @Query("select * from athlima")
    public List<Athlima> getAthlima();

    @Update
    public void updateSport(Athlima athlima); //orismos methodou gia update

    /*@Query("select * from athlima")
    public List<Athlima> getAthlima(); */
}
