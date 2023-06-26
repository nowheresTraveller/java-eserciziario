package org.example.mioeserciziario.boundedset;

public class Test {
    public static void main(String[] args) {
        BoundedSet<Integer> boundedSet= new BoundedSet<>(3);
        boundedSet.add(1);
        boundedSet.add(2);
        boundedSet.add(3);
        boundedSet.add(3);
        boundedSet.stampa();
        System.out.println(boundedSet.size());
        System.out.println(boundedSet.contains(2));
        boundedSet.add(4);
        boundedSet.stampa();
    }
}
