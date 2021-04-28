package com.example.testapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Athlima {

    @PrimaryKey
    private int SportId;
    @ColumnInfo(name = "spName")
    private String SportName;
    @ColumnInfo(name = "spKind")
    private String SportKind;
    @ColumnInfo(name = "spFilo")
    private  String SportFilo;

    public int getSportId() {
        return SportId;
    }

    public void setSportId(int sportId) {
        SportId = sportId;
    }

    public String getSportName() {
        return SportName;
    }

    public void setSportName(String sportName) {
        SportName = sportName;
    }

    public String getSportKind() {
        return SportKind;
    }

    public void setSportKind(String sportKind) {
        SportKind = sportKind;
    }

    public String getSportFilo() {
        return SportFilo;
    }

    public void setSportFilo(String sportFilo) {
        SportFilo = sportFilo;
    }
}
