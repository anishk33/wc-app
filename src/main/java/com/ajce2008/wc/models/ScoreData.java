package com.ajce2008.wc.models;

public class ScoreData {

    private String userName;
    private String userBranch;
    private String match;
    private String predictedResult;
    private Integer score;

    public ScoreData() {
    }

    public ScoreData(String userName, String userBranch, String match, String predictedResult, Integer score) {
        this.userName = userName;
        this.userBranch = userBranch;
        this.match = match;
        this.predictedResult = predictedResult;
        this.score = score;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBranch() {
        return userBranch;
    }

    public void setUserBranch(String userBranch) {
        this.userBranch = userBranch;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getPredictedResult() {
        return predictedResult;
    }

    public void setPredictedResult(String predictedResult) {
        this.predictedResult = predictedResult;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
