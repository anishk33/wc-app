package com.ajce2008.wc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    private Integer userId;
    private String userName;
    private String userBranch;

    public Integer getUserId() {
        return userId;
    }

    @Column(name = "USER_ID")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    @Column(name = "USER_NAME")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBranch() {
        return userBranch;
    }

    @Column(name = "USER_BRANCH")
    public void setUserBranch(String userBranch) {
        this.userBranch = userBranch;
    }
}
