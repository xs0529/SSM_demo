package com.xie.entity;

import java.util.Date;

public class UserEntity {
    private Long userId;

    private String userName;

    private String userEmail;

    private String userIp;

    private String userAddress;

    private Date userCtime;

    private Date userMtime;

    private String userStatus;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Date getUserCtime() {
        return userCtime;
    }

    public void setUserCtime(Date userCtime) {
        this.userCtime = userCtime;
    }

    public Date getUserMtime() {
        return userMtime;
    }

    public void setUserMtime(Date userMtime) {
        this.userMtime = userMtime;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }
}