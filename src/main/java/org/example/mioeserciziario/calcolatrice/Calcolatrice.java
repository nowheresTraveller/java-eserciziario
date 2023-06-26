package org.example.mioeserciziario.calcolatrice;

public class Calcolatrice {

    private int x;
    private int y;

    public Calcolatrice(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int somma(){
        return x+y;
    }


    public int sottrazione(){
        return x-y;
    }


    public double divisione(){
        return x/y;
    }


    public int moltiplicazione(){
        return x*y;
    }
}
