package com.dimoll;

import java.io.Serializable;

public class People implements Serializable {

    private String fistName;
    private String lastName;
    private int age;
    private int weight;

    public People(String fistName, String lastName, int weight, int age) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.weight = weight;
        this.age=age;
    }

    public People() {
    }

    @Override
    public String toString(){
        return "First Name: " + fistName + " Last Name: " + lastName + " Weight: " + weight + " " + " Age: " + age;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
