package org.example.mioeserciziario.contest;

import java.util.HashMap;
import java.util.Map;

public class Contest<T> {
    Map<T, Integer> objectMap;

    public Contest() {
        objectMap = new HashMap<>();
    }

    public void add(T obj) {
        if (objectMap.containsKey(obj)) {
            System.out.println("Oggetto già partecipante nel contest!");
            return;
        }

        objectMap.put(obj, 0);
    }

    public void vote(T obj) {
        try {
            if (!objectMap.containsKey(obj))
                throw new ContestException();

            objectMap.put(obj, objectMap.get(obj) + 1);

        } catch (ContestException ex) {
            ex.printStackTrace();
        }
    }

    public T winner() {
        if(objectMap.isEmpty()){
            return null;
        }

        T[] keys = (T[]) objectMap.keySet().toArray();
        T objRet=null;
        int maxVote = 0,  aVote;

        for (T key : keys) {
            aVote=objectMap.get(key);
            if (aVote>maxVote){
                maxVote=aVote;
                objRet=key;
            }
        }

        if(maxVote==0){
            return null;
        }

        return objRet;
    }

    public Map<T, Integer> getObjectMap() {
        return objectMap;
    }

    public void setObjectMap(Map<T, Integer> objectMap) {
        this.objectMap = objectMap;
    }
}
