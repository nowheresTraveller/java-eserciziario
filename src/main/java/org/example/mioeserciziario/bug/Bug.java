package org.example.mioeserciziario.bug;

import java.util.List;
import java.util.ArrayList;

public class Bug {
    private String descrizione;
    private static List <Bug> unassignedBugs=new ArrayList<>();;
    private static List <Bug> assignedBugs=new ArrayList<>();;
    private String toAProgrammer;

    public Bug(String descrizione) {
        this.descrizione = descrizione;
        addToUnassignedBugs();
    }

    public void addToUnassignedBugs(){
        unassignedBugs.add(this);
    }

    public void assignTo(String programmer){
       unassignedBugs.remove (this);
       toAProgrammer=programmer;
       assignedBugs.add(this);
    }

    public static List<Bug> getUnassigned(){
        return unassignedBugs;
    }

    public static List<Bug> getAssignedTo() {
        return assignedBugs;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getToAProgrammer() {
        return toAProgrammer;
    }
}
