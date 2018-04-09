package com.xie.entity;

import java.util.Date;

public class ReplyEntity {
    private Long replyId;

    private String replyBody;

    private Long userId;

    private Long messageId;

    private String userName;

    private String replyName;

    private Date replyCtime;

    private Date replyMtime;

    private String replyStatus;

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public String getReplyBody() {
        return replyBody;
    }

    public void setReplyBody(String replyBody) {
        this.replyBody = replyBody == null ? null : replyBody.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName == null ? null : replyName.trim();
    }

    public Date getReplyCtime() {
        return replyCtime;
    }

    public void setReplyCtime(Date replyCtime) {
        this.replyCtime = replyCtime;
    }

    public Date getReplyMtime() {
        return replyMtime;
    }

    public void setReplyMtime(Date replyMtime) {
        this.replyMtime = replyMtime;
    }

    public String getReplyStatus() {
        return replyStatus;
    }

    public void setReplyStatus(String replyStatus) {
        this.replyStatus = replyStatus == null ? null : replyStatus.trim();
    }
}