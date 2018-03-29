package com.xie.entity;

import java.util.Date;

public class NewsEntity {
    private Integer newsId;

    private String newsBody;

    private String newsType;

    private Date newsCtime;

    private Date newsMtime;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsBody() {
        return newsBody;
    }

    public void setNewsBody(String newsBody) {
        this.newsBody = newsBody == null ? null : newsBody.trim();
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType == null ? null : newsType.trim();
    }

    public Date getNewsCtime() {
        return newsCtime;
    }

    public void setNewsCtime(Date newsCtime) {
        this.newsCtime = newsCtime;
    }

    public Date getNewsMtime() {
        return newsMtime;
    }

    public void setNewsMtime(Date newsMtime) {
        this.newsMtime = newsMtime;
    }
}