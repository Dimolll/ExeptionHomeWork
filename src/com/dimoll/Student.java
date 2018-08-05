package com.dimoll;

import java.io.Serializable;

public class Student extends People implements Serializable {

    private int studentId;
    private float mark;

    public Student(String fistName, String lastName, int weight, int age, int studentId, float mark) {
        super(fistName, lastName, weight, age);
        this.studentId = studentId;
        this.mark = mark;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return  super.toString() + " Student ID: " + studentId + ", mark=" + mark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}
