package com.example.exercisegoals.model;

import io.realm.RealmObject;

public class Day extends RealmObject {


    private boolean breakfast = false;
    private boolean lunch     = false;
    private boolean dinner    = false;
    private boolean yoga      = false;
    private boolean sweets    = false;
    //oz for water, minutes for sleep.
    private int     water     = 0;
    private int     sleep     = 0;

    public Day () {
    }

    public boolean isBreakfast () {
        return breakfast;
    }

    public void setBreakfast (boolean breakfast) {
        this.breakfast = breakfast;
    }

    public boolean isLunch () {
        return lunch;
    }

    public void setLunch (boolean lunch) {
        this.lunch = lunch;
    }

    public boolean isDinner () {
        return dinner;
    }

    public void setDinner (boolean dinner) {
        this.dinner = dinner;
    }

    public boolean isYoga () {
        return yoga;
    }

    public void setYoga (boolean yoga) {
        this.yoga = yoga;
    }

    public boolean isSweets () {
        return sweets;
    }

    public void setSweets (boolean sweets) {
        this.sweets = sweets;
    }

    public int getWater () {
        return water;
    }

    public void setWater (int water) {
        this.water = water;
    }

    public int getSleep () {
        return sleep;
    }

    public void setSleep (int sleep) {
        this.sleep = sleep;
    }
}
