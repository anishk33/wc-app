package com.ajce2008.wc.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "FIXTURES")
public class Fixture {
    @Id
    private Integer fixtureId;
    private String venue;
    private String location;
    private Date matchStartTime;
    private Integer homeTeamId;
    private Integer awayTeamId;
    private String homeTeam;
    private String awayTeam;

    public Integer getFixtureId() {
        return fixtureId;
    }

    @Column(name = "FIXTURE_ID")
    public void setFixtureId(Integer fixtureId) {
        this.fixtureId = fixtureId;
    }

    public String getVenue() {
        return venue;
    }

    @Column(name = "VENUE")
    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getLocation() {
        return location;
    }

    @Column(name = "LOCATION")
    public void setLocation(String location) {
        this.location = location;
    }

    public Date getMatchStartTime() {
        return matchStartTime;
    }

    @Column(name = "MATCH_START_TIME")
    public void setMatchStartTime(Date matchStartTime) {
        this.matchStartTime = matchStartTime;
    }

    public Integer getHomeTeamId() {
        return homeTeamId;
    }

    @Column(name = "HOME_TEAM_ID")
    public void setHomeTeamId(Integer homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public Integer getAwayTeamId() {
        return awayTeamId;
    }

    @Column(name = "AWAY_TEAM_ID")
    public void setAwayTeamId(Integer awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    @Transient
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    @Transient
    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }
}
