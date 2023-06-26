package org.example.mioeserciziario.impianto;

public class Apparecchio {
    private int potenza;
    private boolean on;

    public Apparecchio(int potenza) {
        this.potenza = potenza;
        this.on=false;
    }

    public void off(){
        this.on=false;
    }

    public void on(){

    }

    public int getPotenza() {
        return potenza;
    }

    public boolean getOn() {
        return on;
    }
}
