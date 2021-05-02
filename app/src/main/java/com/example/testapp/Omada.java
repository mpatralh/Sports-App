package com.example.testapp;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
//orismos ksenou kleidiou id tou sport apo ton pinaka sport
@Entity(foreignKeys = @ForeignKey(entity = Athlima.class,
        parentColumns = "SportId",
        childColumns = "sportId",
        onDelete = ForeignKey.CASCADE,
        onUpdate = ForeignKey.CASCADE))
public class Omada {

    @PrimaryKey
    private int teamID; @NonNull
    private String teamName;
    private String onomaGipedou;
    private String teamCountry;
    private String teamTown;
    private int etosIdrisis;
    private int sportId; @NonNull


    public int getSportId() {
        return sportId;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getOnomaGipedou() {
        return onomaGipedou;
    }

    public void setOnomaGipedou(String onomaGipedou) {
        this.onomaGipedou = onomaGipedou;
    }

    public String getTeamCountry() {
        return teamCountry;
    }

    public void setTeamCountry(String teamCountry) {
        this.teamCountry = teamCountry;
    }

    public int getEtosIdrisis() {
        return etosIdrisis;
    }

    public void setEtosIdrisis(int etosIdrisis) {
        this.etosIdrisis = etosIdrisis;
    }

    public String getTeamTown() {
        return teamTown;
    }

    public void setTeamTown(String teamTown) {
        this.teamTown = teamTown;
    }




}
