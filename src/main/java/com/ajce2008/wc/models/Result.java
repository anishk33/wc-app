package com.ajce2008.wc.models;

import javax.persistence.*;

@Entity
@Table(name = "RESULTS")
public class Result {

    @Id
    private Integer resultId;
    private Integer fixtureId;
    private String winner;

    public Integer getResultId() {
        return resultId;
    }

    @Column(name = "RESULT_ID")
    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public Integer getFixtureId() {
        return fixtureId;
    }

    @Column(name = "FIXTURE_ID")
    public void setFixtureId(Integer fixtureId) {
        this.fixtureId = fixtureId;
    }

    public String getWinner() {
        return winner;
    }

    @Column(name = "WINNER")
    public void setWinner(String winner) {
        this.winner = winner;
    }
}
