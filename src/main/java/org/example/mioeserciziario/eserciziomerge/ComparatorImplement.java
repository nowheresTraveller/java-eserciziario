package org.example.mioeserciziario.eserciziomerge;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

public class ComparatorImplement implements Comparator<Set<Integer>> {


    @Override
    public int compare(Set<Integer> set1, Set<Integer> set2) {

        Object [] arr1 =  set1.toArray();
        Object [] arr2 =  set2.toArray();


        for (Object elem1 : arr1){
            for(Object elem2 : arr2){
                if (((Integer)elem1)>=((Integer)elem2)){
                    return 1;
                }
            }
        }
        return -1;
    }
}
