package org.example.mioeserciziario.eserciziomerge;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tool {

    public static LinkedList<Integer> merge (List<Integer> a, List<Integer> b){
        if (a.getClass().toString().equals(b.getClass().toString()) && a.size()==b.size()){
            LinkedList<Integer> returnList= new LinkedList<>();
            for (int i=0; i<a.size();++i){
                returnList.add(a.get(i));
                returnList.add(b.get(i));
            }
            return returnList;
        }

        return null;
    }

    public static boolean isSetSmaller (Set<Integer> a, Set<Integer> b, ComparatorImplement comparatorImplement){
        if(comparatorImplement.compare(a,b)==1){
            return false;
        }
        return true;
    }
}
