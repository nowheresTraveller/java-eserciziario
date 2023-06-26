package org.example.mioeserciziario.relazionebinaria;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Relation<String,Integer> myRelation = new Relation<>();
        myRelation.put("a",2);
        myRelation.put("a",4);
        myRelation.put("b",4);
        myRelation.put("c",10);



//        Set<Integer> valueSet=myRelation.image("a");
//        Set<String> keySet = myRelation.preImage(4);
//        Object [] firstArray= valueSet.toArray();
//        Object [] secondArray = keySet.toArray();
//
//        System.out.println("firstArray value : ");
//        for (Object v : firstArray){
//            System.out.println(v);
//        }
//
//        System.out.println("secondArray value : ");
//        for (Object v : secondArray){
//            System.out.println(v);
//        }
//
//        System.out.println(valueSet);
//        System.out.println(keySet);
//
//        myRelation.remove("a",2);
//        Set<Integer> valueSet=myRelation.image("a");
//        System.out.println(valueSet);
//        Set<String> keySet = myRelation.preImage(4);
//        System.out.println(keySet);

    }
}
