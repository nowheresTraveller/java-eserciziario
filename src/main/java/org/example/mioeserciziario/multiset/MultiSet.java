package org.example.mioeserciziario.multiset;

import java.util.ArrayList;

public class MultiSet<T> {

    private ArrayList<T> sequence;

    public MultiSet(ArrayList<T> sequence) {
        this.sequence = sequence;
    }

    public ArrayList<T> getSequence() {
        return sequence;
    }

    public void setSequence(ArrayList<T> sequence) {
        this.sequence = sequence;
    }

    public void add(T valore) {
        try {
            sequence.add(valore);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void remove (T valore){
        try{
            if(sequence.remove(valore)){
                System.out.println ("Elemento rimosso!");
            }else{
                System.out.println("Elemento non presente nel multiset");
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    //TODO risolvere metodo
    @Override
    public boolean equals (Object obj){
        try{
            int dim = sequence.size();
            ArrayList <T> param = (ArrayList<T>) obj;
            if (dim!=param.size()){
                return false;
            }


        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return false;
    }

}