package com.xie.entity;

public class AdminEntity {
    private Integer id;

    private String adminUsername;

    private String adminPassword;

    private String adminName;

    private String adminBody;

    private String adminImg;

    private String adminText;

    private Integer adminNews;

    private Integer adminNotice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername == null ? null : adminUsername.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminBody() {
        return adminBody;
    }

    public void setAdminBody(String adminBody) {
        this.adminBody = adminBody == null ? null : adminBody.trim();
    }

    public String getAdminImg() {
        return adminImg;
    }

    public void setAdminImg(String adminImg) {
        this.adminImg = adminImg == null ? null : adminImg.trim();
    }

    public String getAdminText() {
        return adminText;
    }

    public void setAdminText(String adminText) {
        this.adminText = adminText == null ? null : adminText.trim();
    }

    public Integer getAdminNews() {
        return adminNews;
    }

    public void setAdminNews(Integer adminNews) {
        this.adminNews = adminNews;
    }

    public Integer getAdminNotice() {
        return adminNotice;
    }

    public void setAdminNotice(Integer adminNotice) {
        this.adminNotice = adminNotice;
    }
}