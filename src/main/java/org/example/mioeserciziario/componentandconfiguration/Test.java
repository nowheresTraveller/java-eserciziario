package org.example.mioeserciziario.componentandconfiguration;

public class Test {
    public static void main(String[] args) {
        Component firstCpu= new Component(Component.Type.CPU,"Intel_I7");
        Component secondCpu= new Component(Component.Type.CPU,"AMD_Ryzen");
        Component firstRam = new Component(Component.Type.RAM,"Corsair 8gb");
        Component secondRam = new Component(Component.Type.RAM,"Samsung 8gb");
        Component board = new Component(Component.Type.BOARD,"Asus Rog board");
        secondCpu.setIncompatible(board);
        Configuration myConfiguration = new Configuration();
        System.out.println(myConfiguration.add(board));
        System.out.println(myConfiguration.add(firstRam));
        System.out.println(myConfiguration.add(secondCpu));
        System.out.println(myConfiguration.add(firstCpu));
        System.out.println(myConfiguration.add(secondRam));


    }
}
