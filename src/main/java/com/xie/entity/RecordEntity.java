package com.xie.entity;

import java.util.Date;

public class RecordEntity {
    private Long recordId;

    private String recordType;

    private String recordBody;

    private Long articleId;

    private Long userId;

    private String userIp;

    private Date recordCtime;

    private Date recordMtime;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    public String getRecordBody() {
        return recordBody;
    }

    public void setRecordBody(String recordBody) {
        this.recordBody = recordBody == null ? null : recordBody.trim();
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public Date getRecordCtime() {
        return recordCtime;
    }

    public void setRecordCtime(Date recordCtime) {
        this.recordCtime = recordCtime;
    }

    public Date getRecordMtime() {
        return recordMtime;
    }

    public void setRecordMtime(Date recordMtime) {
        this.recordMtime = recordMtime;
    }
}