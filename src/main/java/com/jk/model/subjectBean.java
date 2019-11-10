package com.jk.model;

import java.io.Serializable;

public class subjectBean implements Serializable {
    private Integer subjectid;

    private String subjectname;

    private String subjectstage;


    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getSubjectstage() {
        return subjectstage;
    }

    public void setSubjectstage(String subjectstage) {
        this.subjectstage = subjectstage;
    }

    @Override
    public String toString() {
        return "subjectBean{" +
                "subjectid=" + subjectid +
                ", subjectname='" + subjectname + '\'' +
                ", subjectstage='" + subjectstage + '\'' +
                '}';
    }
}
