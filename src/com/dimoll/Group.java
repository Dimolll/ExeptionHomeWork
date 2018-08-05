package com.dimoll;

import java.io.Serializable;

public class Group implements Comparable,IMilitaryCommissar, Serializable {

    private Student[] group;
    private int top;

    public Group(){
        group = new Student[10];
        top=0;
    }

    public boolean addStudent(Student student) throws FullGroupExeption {
        if(top<10){
            group[top++]=student;
            return true;
        }else{
            throw new FullGroupExeption();
        }
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
            for (int i = 0; i < (top - 1); i++)
                if (group[i] != null && group[i + 1] != null) {
                    if (0>= (group[i + 1].getLastName().compareTo(group[i].getLastName()))) {
                        isSorted = false;
                        Student temp;
                        temp = group[i];
                        group[i] = group[i + 1];
                        group[i + 1] = temp;
                    }
                }
        }
        return group;
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


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
