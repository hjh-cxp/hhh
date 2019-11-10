package com.jk.model;

import java.io.Serializable;

public class teacherBean implements Serializable {

    private Integer teacherno;

    private String teachername;

    private String subjectid;

    private String teachersynopsis;

    public Integer getTeacherno() {
        return teacherno;
    }

    public void setTeacherno(Integer teacherno) {
        this.teacherno = teacherno;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }

    public String getTeachersynopsis() {
        return teachersynopsis;
    }

    public void setTeachersynopsis(String teachersynopsis) {
        this.teachersynopsis = teachersynopsis;
    }

    @Override
    public String toString() {
        return "teacherBean{" +
                "teacherno=" + teacherno +
                ", teachername='" + teachername + '\'' +
                ", subjectid='" + subjectid + '\'' +
                ", teachersynopsis='" + teachersynopsis + '\'' +
                '}';
    }
}
