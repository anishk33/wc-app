package com.ajce2008.wc.models;

public class FixtureData {

    private String venue;
    private String location;
    private String matchStartTime;
    private String homeTeam;
    private String awayTeam;

    public FixtureData() {
    }

    public FixtureData(String venue, String location, String matchStartTime, String homeTeam, String awayTeam) {
        this.venue = venue;
        this.location = location;
        this.matchStartTime = matchStartTime;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMatchStartTime() {
        return matchStartTime;
    }

    public void setMatchStartTime(String matchStartTime) {
        this.matchStartTime = matchStartTime;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }
}
