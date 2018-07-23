package com.dimoll;

public class Student extends People {

    private int studentId;
    private float mark;

    public Student(String fistName, String lastName, int weight, int studentId, float mark) {
        super(fistName, lastName, weight);
        this.studentId = studentId;
        this.mark = mark;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return  super.toString() + "Student ID: " + studentId + ", mark=" + mark;
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
