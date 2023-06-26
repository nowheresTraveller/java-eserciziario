package org.example.mioeserciziario.box;

public class Box {
    private int altezza,larghezza,profondita;

    public Box(int altezza, int larghezza, int profondita) {
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
    }

    @Override
    public boolean equals(Object object){
        Box newBox=((Box)object);
        if (this.altezza==newBox.getAltezza() &&
            this.larghezza==newBox.getLarghezza() &&
            this.profondita== newBox.getProfondita()){
            return true;
        }
        return false;
    }

    public boolean fitsIn(Box newBox){

        if (this.altezza<newBox.getAltezza() &&
                this.larghezza<newBox.getLarghezza() &&
                this.profondita<newBox.getProfondita()){
            return true;
        }
        return false;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getProfondita() {
        return profondita;
    }
}
