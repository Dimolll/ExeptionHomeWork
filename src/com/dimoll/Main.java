package com.dimoll;

public class Main {

    public static void main(String []args) {
        Group firstGroup = new Group();
        try {
            firstGroup.addStudent(new Student("ADima0", "QBondarchuk", 60, 1564, (float) 5.0));
            firstGroup.addStudent(new Student("EDima1", "XBondarchuk", 61, 1564, (float) 5.0));
            firstGroup.addStudent(new Student("BDima2", "ZBondarchuk", 62, 1564, (float) 5.0));
            firstGroup.addStudent(new Student("Dima3", "WBondarchuk", 63, 1564, (float) 5.0));
            firstGroup.addStudent(new Student("NDima4", "VBondarchuk", 64, 1564, (float) 5.0));
            firstGroup.addStudent(new Student("Dima5", "ABondarchuk", 65, 1564, (float) 5.0));
            firstGroup.addStudent(new Student("MDima6", "KBondarchuk", 66, 1564, (float) 5.0));
            //firstGroup.addStudent(new Student("YDima7", "GBondarchuk", 67, 1564, (float) 5.0));
            firstGroup.addStudent(new Student("LDima8", "UBondarchuk", 68, 1564, (float) 5.0));
            firstGroup.addStudent(new Student("PDima9", "PBondarchuk", 69, 1564, (float) 5.0));
            firstGroup.addStudent(new Student("ODima10", "OBondarchuk", 70, 1564, (float) 5.0));
            firstGroup.sortArray();
            System.out.print(firstGroup.toString());
        } catch (FullGroupExeption /*| NullPointerException*/ e){
            e.getMessage();
        }
        //firstGroup.toString();
    }
}
