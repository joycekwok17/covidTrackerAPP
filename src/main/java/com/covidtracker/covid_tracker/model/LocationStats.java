package com.covidtracker.covid_tracker.model;

/**
 * @author Xuanchi Guo
 */

public class LocationStats {
    private String state;
    private String country;
    private int currentTotalCases;
    private int diffFromLastDay;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCurrentTotalCases() {
        return currentTotalCases;
    }

    public void setCurrentTotalCases(int currentTotalCases) {
        this.currentTotalCases = currentTotalCases;
    }

    public int getDiffFromLastDay() {
        return diffFromLastDay;
    }

    public void setDiffFromLastDay(int diffFromLastDay) {
        this.diffFromLastDay = diffFromLastDay;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", currentTotalCases=" + currentTotalCases +
                ", diffFromLastDay=" + diffFromLastDay +
                '}';
    }
}
