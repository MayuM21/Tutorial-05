package com.example.sliit.firebasedb;

public class Student {

    String sID;
    String name;
    String course;

    public Student(){

    }

    public Student(String sID, String name, String course) {
        this.sID = sID;
        this.name = name;
        this.course = course;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
