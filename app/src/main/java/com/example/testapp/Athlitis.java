package com.example.testapp;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
@Entity(foreignKeys = @ForeignKey(entity = Athlima.class,
        parentColumns = "SportId",
        childColumns = "athlSp_id",
        onDelete = ForeignKey.CASCADE,
        onUpdate = ForeignKey.CASCADE))
public class Athlitis {

    @PrimaryKey
    private int Athl_id; @NonNull
    @ColumnInfo(name="athlName")
    private String name;
    @ColumnInfo(name="athlSurname")
    private String surname;
    @ColumnInfo(name="athlCity")
    private String city;
    @ColumnInfo(name="athlCountry")
    private String country;


    @ColumnInfo(name="athlSp_id")
    private int Sp_id; @NonNull
    @ColumnInfo(name="athlBirthYear")
    private int birthYear;
    // @ColumnInfo(Athl_id="athlId");

    public int getAthl_id() {
        return Athl_id;
    }

    public void setAthl_id(int athl_id) {
        Athl_id = athl_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSp_id() {
        return Sp_id;
    }

    public void setSp_id(int sp_id) {
        Sp_id = sp_id;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
