package org.example.mioeserciziario.bug;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Bug bug1= new Bug("segmentation fault!");
        Bug bug2= new Bug("out of index!");
        Bug bug3= new Bug("null pointer!");
        List<Bug> unassignedList = Bug.getUnassigned();
        System.out.println(unassignedList.size());
        System.out.println("Unassigned Bugs : ");
        for (Bug b: unassignedList){
            System.out.println(b.getDescrizione());
        }
        bug1.assignTo("Marco");
        bug2.assignTo("Mario");
        bug3.assignTo("Giovanni");
        System.out.println("------------------");
        System.out.println("Unassigned Bugs : "+unassignedList.size());

        List<Bug> assignedList = Bug.getAssignedTo();
        System.out.println("assigned Bugs : "+assignedList.size());
        System.out.println("assigned Bugs : ");
        for (Bug b: assignedList){
            System.out.println(b.getDescrizione());
        }


//        List<Bug> assignerList = Bug.getAssignedTo();
    }
}
