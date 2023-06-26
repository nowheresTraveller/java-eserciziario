package org.example.mioeserciziario.automobile;

public class Auto {

    private double consumo;
    private double quantitàCarburante;

    public Auto(double consumo) {
        this.consumo = consumo;
        this.quantitàCarburante=0;
    }

    public void drive(double distanzaPerc){
        double kmPerc= consumo*quantitàCarburante;
        if(kmPerc>=distanzaPerc){
            quantitàCarburante-=(distanzaPerc/18);
            System.out.println("Percorso raggiunto!");
            return;
        }
        System.out.println("Carburante non sufficiente per percorrere la distanza!");
    }

    public void faiRifornimento(double rif){
        quantitàCarburante+=rif;
    }

    public double dammiCarburante() {
        return quantitàCarburante;
    }
}
