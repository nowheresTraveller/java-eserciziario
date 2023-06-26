package org.example.mioeserciziario.cellphone;

public class Test {

    public static void main(String[] args) {
        Cellphone cellphone1 = new Cellphone("Tim","3343098765");
        Cellphone cellphone2 = new Cellphone("Vodafone","3341234432");
        Cellphone cellphone3 = new Cellphone("Wind","3343098765");

        Cellphone.setCost("Tim","Vodafone",0.10);
        Cellphone.setCost("Tim","Wind",0.20);
        Cellphone.setCost("Vodafone","Wind",0.5);

        System.out.println(cellphone1.getCost(cellphone2,3));
        System.out.println(cellphone1.getCost(cellphone3,6));
        System.out.println(cellphone3.getCost(cellphone1,5));
    }
}
