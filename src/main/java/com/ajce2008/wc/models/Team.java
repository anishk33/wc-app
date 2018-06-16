package com.ajce2008.wc.models;

import javax.persistence.*;

@Entity
@Table(name = "TEAMS")
public class Team {
    @Id
    private Integer teamId;
    private String teamName;

    public Integer getTeamId() {
        return teamId;
    }

    @Column(name = "TEAM_ID")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    @Column(name = "TEAM_NAME")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
