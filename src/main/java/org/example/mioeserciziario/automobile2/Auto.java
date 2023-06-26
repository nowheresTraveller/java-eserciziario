package org.example.mioeserciziario.automobile2;

public class Auto {
    private double consumo;
    private double carburanteDisponibile;

    public Auto(double consumo) {
        this.consumo = consumo;
        this.carburanteDisponibile=0;
    }

    public double dammiCarburante(){
        return carburanteDisponibile;
    }

    public void faiRifornimento (double c){
        carburanteDisponibile+=c;
    }

    public boolean drive (double distanzaPercorso){
        if( (carburanteDisponibile/consumo) >distanzaPercorso){
            carburanteDisponibile-=(consumo*distanzaPercorso);
            return true;
        }

        return false;
    }
}
