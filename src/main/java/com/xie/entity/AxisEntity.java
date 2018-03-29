package com.xie.entity;

import java.util.Date;

public class AxisEntity {
    private Integer timeAxisId;

    private String timeAxisTitle;

    private String timeAxisBody;

    private Date timeAxisCtime;

    private Date timeAxisMtime;

    public Integer getTimeAxisId() {
        return timeAxisId;
    }

    public void setTimeAxisId(Integer timeAxisId) {
        this.timeAxisId = timeAxisId;
    }

    public String getTimeAxisTitle() {
        return timeAxisTitle;
    }

    public void setTimeAxisTitle(String timeAxisTitle) {
        this.timeAxisTitle = timeAxisTitle == null ? null : timeAxisTitle.trim();
    }

    public String getTimeAxisBody() {
        return timeAxisBody;
    }

    public void setTimeAxisBody(String timeAxisBody) {
        this.timeAxisBody = timeAxisBody == null ? null : timeAxisBody.trim();
    }

    public Date getTimeAxisCtime() {
        return timeAxisCtime;
    }

    public void setTimeAxisCtime(Date timeAxisCtime) {
        this.timeAxisCtime = timeAxisCtime;
    }

    public Date getTimeAxisMtime() {
        return timeAxisMtime;
    }

    public void setTimeAxisMtime(Date timeAxisMtime) {
        this.timeAxisMtime = timeAxisMtime;
    }
}