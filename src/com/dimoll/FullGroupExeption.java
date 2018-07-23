package com.dimoll;

public class FullGroupExeption extends Exception {

    @Override
    public String getMessage() {
        return "Error. Group is full";
    }
}
