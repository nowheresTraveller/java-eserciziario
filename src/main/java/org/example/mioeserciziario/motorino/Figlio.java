package org.example.mioeserciziario.motorino;

public class Figlio extends Padre{

    public Figlio(int primoAttr, int secondAttr) {
        //Todo vedere costruttore padre
        super(primoAttr, secondAttr);
    }

    public void mioMetodo(){
        System.out.println(getPrimoAttr());
    }

}
