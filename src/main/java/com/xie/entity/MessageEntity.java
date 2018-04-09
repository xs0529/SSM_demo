package com.xie.entity;

import java.util.Date;
import java.util.List;

public class MessageEntity {
    private Long messageId;

    private String messageBody;

    private Long userId;

    private Long articleId;

    private String userName;

    private Date messageCtime;

    private Date messageMtime;

    private String messageStatus;

    private List<ReplyEntity>replyEntityList;

    public List<ReplyEntity> getReplyEntityList() {
        return replyEntityList;
    }

    public void setReplyEntityList(List<ReplyEntity> replyEntityList) {
        this.replyEntityList = replyEntityList;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody == null ? null : messageBody.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getMessageCtime() {
        return messageCtime;
    }

    public void setMessageCtime(Date messageCtime) {
        this.messageCtime = messageCtime;
    }

    public Date getMessageMtime() {
        return messageMtime;
    }

    public void setMessageMtime(Date messageMtime) {
        this.messageMtime = messageMtime;
    }

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus == null ? null : messageStatus.trim();
    }
}