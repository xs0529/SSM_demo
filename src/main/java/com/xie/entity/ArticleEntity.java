package com.xie.entity;

import java.util.Date;

public class ArticleEntity {
    private Long articleId;

    private String articleTitle;

    private String articleState;

    private Date articleCtime;

    private Date articleMtime;

    private Long articleReading;

    private String articleImage;

    private String articleTag;

    private Integer classificationId;

    private String articleBody;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleState() {
        return articleState;
    }

    public void setArticleState(String articleState) {
        this.articleState = articleState == null ? null : articleState.trim();
    }

    public Date getArticleCtime() {
        return articleCtime;
    }

    public void setArticleCtime(Date articleCtime) {
        this.articleCtime = articleCtime;
    }

    public Date getArticleMtime() {
        return articleMtime;
    }

    public void setArticleMtime(Date articleMtime) {
        this.articleMtime = articleMtime;
    }

    public Long getArticleReading() {
        return articleReading;
    }

    public void setArticleReading(Long articleReading) {
        this.articleReading = articleReading;
    }

    public String getArticleImage() {
        return articleImage;
    }

    public void setArticleImage(String articleImage) {
        this.articleImage = articleImage == null ? null : articleImage.trim();
    }

    public String getArticleTag() {
        return articleTag;
    }

    public void setArticleTag(String articleTag) {
        this.articleTag = articleTag == null ? null : articleTag.trim();
    }

    public Integer getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(Integer classificationId) {
        this.classificationId = classificationId;
    }

    public String getArticleBody() {
        return articleBody;
    }

    public void setArticleBody(String articleBody) {
        this.articleBody = articleBody == null ? null : articleBody.trim();
    }
}