package org.example.mioeserciziario.relazionebinaria;

import java.util.*;

public class Relation<S, T> {
    private Map<S, List<T>> coppieMap;

    public Relation() {
        coppieMap = new HashMap<>();
    }

    public void put(S key, T value) {
        if (coppieMap.containsKey(key)) {
            coppieMap.get(key).add(value);
        } else {
            List<T> aList = new ArrayList<>();
            aList.add(value);
            coppieMap.put(key, aList);
        }
    }

    public void remove(S key, T value) {
        if (coppieMap.containsKey(key)) {
            List<T> aList = coppieMap.get(key);
            if (aList.size() > 1) {
                for (T v : aList) {
                    if (value.equals(v)) {
                        aList.remove(value);
                        return;
                    }
                }
            } else {
                if (aList.contains(value)) {
                    coppieMap.remove(key, aList);
                    return;
                }
            }
        }
        System.out.println("Errore,coppia non esistente!");
    }

    public Set<T> image(S key){
        if(coppieMap.containsKey(key)){
            List<T> valueList= coppieMap.get(key);
            Set<T> retSet = new HashSet<>();
            for (T v:valueList){
                retSet.add(v);
            }
            return retSet;
        }
        System.out.println ("Errore,chiave non esistente!");
        return null;
    }

    public Set<S> preImage(T value){
        Set<S> retKeySet= new HashSet<>();
        List <List<T>> bigList= new ArrayList<>();
        Collection<List<T>> valueListsCoppieMap = coppieMap.values();
        Object [] keyArray = coppieMap.keySet().toArray();

        for(List<T> aList : valueListsCoppieMap){
            if(aList.contains(value)){
                bigList.add(aList);
            }
        }

        if(!bigList.isEmpty()){
            for(Object key : keyArray){
                for(List <T> vList : bigList){
                    if(coppieMap.get(key).equals(vList)){
                        retKeySet.add((S)key);
                    }
                }
            }
        }


        if(retKeySet.isEmpty()){
            System.out.println("non esiste alcuna chiave che abbia come valore '"+value+"'!");
            return null;
        }
        return retKeySet;
    }

}
