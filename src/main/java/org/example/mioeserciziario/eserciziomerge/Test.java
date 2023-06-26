package org.example.mioeserciziario.eserciziomerge;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
//        LinkedList<Integer> a= new LinkedList<>();
//        LinkedList<Integer> b= new LinkedList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        b.add(5);
//        b.add(6);
//        b.add(7);
//        b.add(8);
//
//        LinkedList<Integer> c=Tool.merge(a,b);
//        if(c!=null) {
//            for (Integer x : c) {
//                System.out.print(x + ", ");
//            }
//        }
//        b.add(9);
//        c=Tool.merge(a,b);
//        if(c==null){
//            System.out.println ("\nErrore!");
//        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        ComparatorImplement comparator = new ComparatorImplement();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(8);

        set2.add(4);
        set2.add(5);
        set2.add(6);



        if(Tool.isSetSmaller(set1,set2,comparator)){
            System.out.println("set1 < set2");
        }else{
            System.out.println("set1 >= set2");
        }

    }

}
