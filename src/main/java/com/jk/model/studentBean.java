package com.jk.model;

import java.io.Serializable;

public class studentBean implements Serializable {
    private Integer studentid;

    private String studentname;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    @Override
    public String toString() {
        return "studentBean{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                '}';
    }
}
