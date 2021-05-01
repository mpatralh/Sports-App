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
    public List<Athlitis> getAthlites();

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

    @Query("select count(Athl_id) as AthlC"+
            " from athlitis" +
            " where athlBirthYear>1980")
    public  List<Integer> getAthleteCount();

    @Query("select DISTINCT SportId as sid, spName as name "+
            " from Athlima "+
            " where spFilo IS NOT 'male' AND spName LIKE 'T%'" +
            " GROUP BY sid") //ta athlimata sta opoia den simmetexoun andres kai arxizoun apo T
    public List<SportSelection> getFemaleSports();

    //onoma omadas , onoma athliti kai sport name i opoia exei edra ti thessaloniki kai stin opoia paizei athlitis o opoios einai apo tin Elvetia kai simmetexei se omadiko athlima
    @Query("select DISTINCT teamName as team, spName as sport, athlName as athlete " +
            "from Athlima a inner join Athlitis on(a.SportId = athlSp_id) " +
             " inner join Omada o on(athlSp_id = o.sportId) " +
              "where athlCountry='Elvetia' AND teamTown='Thessaloniki' AND spKind='omadiko' ")
    public List<OmadaSelection> getSpecificOmada();

}
