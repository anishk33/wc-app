package com.ajce2008.wc.models;

import javax.persistence.*;

@Entity
@Table(name = "SCORES")
public class Score {
    @Id
    private Integer scoreId;
    private Integer predictionId;
    private Integer score;

    public Integer getScoreId() {
        return scoreId;
    }

    @Column(name = "SCORE_ID")
    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public Integer getPredictionId() {
        return predictionId;
    }

    @Column(name = "PREDICTION_ID")
    public void setPredictionId(Integer predictionId) {
        this.predictionId = predictionId;
    }

    public Integer getScore() {
        return score;
    }

    @Column(name = "SCORE")
    public void setScore(Integer score) {
        this.score = score;
    }
}
