package com.xie.entity;

import java.util.Date;

public class TagEntity {
    private Integer tagId;

    private String tagName;

    private Date tagCtime;

    private Date tagMtime;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public Date getTagCtime() {
        return tagCtime;
    }

    public void setTagCtime(Date tagCtime) {
        this.tagCtime = tagCtime;
    }

    public Date getTagMtime() {
        return tagMtime;
    }

    public void setTagMtime(Date tagMtime) {
        this.tagMtime = tagMtime;
    }
}