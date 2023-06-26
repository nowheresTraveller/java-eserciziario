package org.example.mioeserciziario.potenza;

public class Potenza {

    private int base;

    public Potenza(int base) {
        this.base = base;
    }

    public int powOfTwo(){
        return base*base;
    }

    public void cambioBase(int newBase){
        base=newBase;
    }
}
