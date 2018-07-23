package com.dimoll;

public class People {

    private String fistName;
    private String lastName;
    private int weight;

    public People(String fistName, String lastName, int weight) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.weight = weight;
    }

    public People() {
    }

    @Override
    public String toString(){
        return "First Name: " + fistName + " Last Name: " + lastName + " Weight: " + weight + " ";
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

}
