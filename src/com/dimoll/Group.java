package com.dimoll;

import java.util.Arrays;

public class Group {

    private Student[] group;
    private int top;

    public Group(){
        group = new Student[10];
        top=0;
    }

    public boolean addStudent(Student student) throws FullGroupExeption {
        boolean result =false;

        if(top<10){
            group[top++]=student;
            result= true;
        }else{
            throw new FullGroupExeption();
        }
        return result;
    }

    public Student delStudent(){
        if(top>0){
            return group[--top];
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public String toString() {
        //Arrays.sort(group);
        //sortArray();
        String output="";
        for(Student student:group){
            output+=student.toString() +"\n";
        }
        return output;
    }

    public Student[] sortArray(){
        boolean isSorted=false;
        while(!isSorted) {
            isSorted=true;
            for (int i = 0; i < (top - 1); i++) {
                if (group[i] != null && group[i + 1] != null) {
                    if (getBiggerSurname(group[i+1].getLastName(), group[i].getLastName())) {
                        isSorted=false;
                        Student temp;
                        temp = group[i];
                        group[i] = group[i + 1];
                        group[i + 1] = temp;
                    }
                }
            }
        }
        return group;
    }

    private boolean getBiggerSurname(String firstSurname, String secondSurname) {
        char[] firstArray = firstSurname.toCharArray();
        char[] secondArray = secondSurname.toCharArray();
        int bound;
        if (firstArray.length < secondArray.length)
            bound = firstArray.length;
        else
            bound = secondArray.length;
        for (int i = 0; i < bound; i++) {
            if (firstArray[i] > secondArray[i])
                return false;
            else if (firstArray[i] >= secondArray[i])
                return true;
        }
        return false;
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
