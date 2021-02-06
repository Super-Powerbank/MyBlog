package com.tulun.pojo;

public class Student23 {
    private Integer SID;
    private String Sname;
    private String Ssex;
    private String Sage;

    public Integer getSID() {
        return SID;
    }

    public void setSID(Integer SID) {
        this.SID = SID;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }

    public String getSage() {
        return Sage;
    }

    public void setSage(String sage) {
        Sage = sage;
    }

    @Override
    public String toString() {
        return "Student23{" +
                "SID=" + SID +
                ", Sname='" + Sname + '\'' +
                ", Ssex='" + Ssex + '\'' +
                ", Sage='" + Sage + '\'' +
                '}';
    }
}