package com.xie.entity;

import java.util.Date;

public class ClassEntity {
    private Integer classificationId;

    private String classificationName;

    private Date classificationCtime;

    private Date classificationMtime;

    public Integer getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(Integer classificationId) {
        this.classificationId = classificationId;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName == null ? null : classificationName.trim();
    }

    public Date getClassificationCtime() {
        return classificationCtime;
    }

    public void setClassificationCtime(Date classificationCtime) {
        this.classificationCtime = classificationCtime;
    }

    public Date getClassificationMtime() {
        return classificationMtime;
    }

    public void setClassificationMtime(Date classificationMtime) {
        this.classificationMtime = classificationMtime;
    }
}