package org.example.mioeserciziario.binrel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BinRel <T>{
    private Map <T,T> myMap;

    public BinRel() {
        this.myMap=new HashMap<>();
    }

    public void addPair(T key, T value){
        myMap.put(key,value);
    }

    public boolean areRelated(T key, T value){
        if(myMap.containsKey(key))
            if(myMap.get(key).equals(value))
                return true;

        return false;
    }

    public boolean isSimmetric (){
        Set<T> keys= myMap.keySet();
        Collection <T> values = myMap.values();

        for(T value : values){
            if(!(keys.contains(value))){
                return false;
            }
        }

        for(T key : keys){
            if(!(values.contains(key))){
                return false;
            }
        }

        return true;
    }

}
