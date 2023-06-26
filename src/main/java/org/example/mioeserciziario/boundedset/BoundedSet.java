package org.example.mioeserciziario.boundedset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BoundedSet <T> {
    private Set<T> mySet;
    private int maxCapacita;

    public BoundedSet(int maxCapacita) {
        mySet= new HashSet<>();
        this.maxCapacita = maxCapacita;
    }

    public void add(T obj){
        if(this.contains(obj)){
            return;
        }
        if(this.size()==maxCapacita){
            T[] arrObj= (T[])mySet.toArray();

            for (int i=0; i<maxCapacita-1; ++i){
                arrObj[i]=arrObj[i+1];
            }
            arrObj[maxCapacita-1]=obj;

            mySet= new HashSet<>(Arrays.asList(arrObj));

        }else{
            mySet.add(obj);
        }
    }

    public boolean contains(T obj){
        return mySet.contains(obj);
    }

    public int size(){
        return mySet.size();
    }


    public void stampa(){
        System.out.println(mySet);
    }

}
