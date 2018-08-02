package com.dimoll;

import java.util.Arrays;

public class Main {

    public static void main(String []args) {
        Group firstGroup = new Group();
        try {
            firstGroup.addStudent(new Student("ADima0", "QBondarchuk", 60, 16,1564, (float) 5.0));
            firstGroup.addStudent(new Student("EDima1", "XBondarchuk", 61,17, 1564, (float) 4.0));
            firstGroup.addStudent(new Student("BDima2", "ZBondarchuk", 62, 18,1564, (float) 5.0));
            firstGroup.addStudent(new Student("Dima3", "WBondarchuk", 63, 22,1564, (float) 1.0));
            firstGroup.addStudent(new Student("NDima4", "VBondarchuk", 23,64, 1564, (float) 4.8));
            firstGroup.addStudent(new Student("Dima5", "ABondarchuk", 16,65, 1564, (float) 5.0));
            firstGroup.addStudent(new Student("MDima6", "KBondarchuk", 66,16, 1564, (float) 3.6));
            //firstGroup.addStudent(new Student("YDima7", "GBondarchuk", 67, 1564, (float) 5.0));
            firstGroup.addStudent(new Student("LDima8", "UBondarchuk", 68,20, 1564, (float) 5.0));
            firstGroup.addStudent(new Student("PDima9", "PBondarchuk", 69,19, 1564, (float) 2.8));
            firstGroup.addStudent(new Student("ODima10", "OBondarchuk", 70,21, 1564, (float) 2.0));
            firstGroup.sortArray();
            System.out.print(firstGroup.toString());
            Student[] armyMan = firstGroup.trueForArmy(firstGroup);
            System.out.println("\n===================================\n");
            for(Student army: armyMan) {
                System.out.println(army.toString());
            }
            System.out.println("\n===================================\n");
            Arrays.sort(firstGroup.getGroup(), (a,b)-> ( a.getAge() - b.getAge()) );
            for(Student army: firstGroup.getGroup()) {
                System.out.println(army.toString());
            }
            System.out.println("\n===================================\n");

            Arrays.sort(firstGroup.getGroup(),(a,b)->{
                if(a.getMark()>b.getMark()){
                    return -1;
                }
                if(b.getMark()>a.getMark()){
                    return 1;
                }
                return 0;
            });

            for(Student army: firstGroup.getGroup()) {
                System.out.println(army.toString());
            }
        } catch (FullGroupExeption /*| NullPointerException*/ e){
            e.getMessage();
        }
        //firstGroup.toString();
    }
}
