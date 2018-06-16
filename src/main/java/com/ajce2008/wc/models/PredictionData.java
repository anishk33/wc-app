package com.ajce2008.wc.models;

public class PredictionData {

    private String userName;
    private String userBranch;
    private String match;
    private String predictedResult;
    private String predictedAt;

    public PredictionData() {
    }

    public PredictionData(String userName, String userBranch, String match, String predictedResult, String predictedAt) {
        this.userName = userName;
        this.userBranch = userBranch;
        this.match = match;
        this.predictedResult = predictedResult;
        this.predictedAt = predictedAt;
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

    public String getPredictedAt() {
        return predictedAt;
    }

    public void setPredictedAt(String predictedAt) {
        this.predictedAt = predictedAt;
    }
}
