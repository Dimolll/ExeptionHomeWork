package com.dimoll;

import java.util.ArrayList;

public interface IMilitaryCommissar {

    default Student[] trueForArmy(Group someGroup){
        ArrayList<Student> students = new ArrayList<>();
        for(Student student: someGroup.getGroup()){
            if(student.getAge()>=18){
                students.add(student);
            }
        }
        return students.size()>0?students.toArray(new Student[students.size()]):null;
    }
}
