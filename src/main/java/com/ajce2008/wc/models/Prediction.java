package com.ajce2008.wc.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PREDICTIONS")
public class Prediction {
    @Id
    private Integer predictionId;
    private Integer fixtureId;
    private Integer userId;
    private Integer winner;
    private Date updatedAt;

    public Integer getPredictionId() {
        return predictionId;
    }

    @Column(name = "PREDICTION_ID")
    public void setPredictionId(Integer predictionId) {
        this.predictionId = predictionId;
    }

    public Integer getFixtureId() {
        return fixtureId;
    }

    @Column(name = "FIXTURE_ID")
    public void setFixtureId(Integer fixtureId) {
        this.fixtureId = fixtureId;
    }

    public Integer getUserId() {
        return userId;
    }

    @Column(name = "USER_ID")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWinner() {
        return winner;
    }

    @Column(name = "WINNER")
    public void setWinner(Integer winner) {
        this.winner = winner;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Column(name = "UPDATED_AT")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
