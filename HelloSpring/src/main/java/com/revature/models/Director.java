package com.revature.models;

public class Director {

    private int directorId;
    private String directorName;

    //boilerplate code-------------------------------

    public Director() {
    }

    public Director(int directorId, String directorName) {
        this.directorId = directorId;
        this.directorName = directorName;
    }

    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    @Override
    public String toString() {
        return "Director{" +
                "directorId=" + directorId +
                ", directorName='" + directorName + '\'' +
                '}';
    }
}
