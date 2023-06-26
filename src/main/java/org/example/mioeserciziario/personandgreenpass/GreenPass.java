package org.example.mioeserciziario.personandgreenpass;

import java.util.List;

public class GreenPass {

    private int data;
    private int chiamata;


    public GreenPass(int data, int chiamata) {
        this.data = data;
        this.chiamata=chiamata;
    }

    public boolean isValidOn(int data){
        if(chiamata==1){
            if(data<=180)
                return true;
        }else {
            if(data<=270)
                return true;
        }
        return false;
    }

    public boolean belongsTo(Person person){
        List<GreenPass> listPass = person.getPassList();

        for (GreenPass p : listPass){
            if (this.equals(p)){
                return true;
            }
        }
        return false;
    }
    
}
