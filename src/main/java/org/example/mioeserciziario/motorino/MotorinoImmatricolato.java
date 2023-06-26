package org.example.mioeserciziario.motorino;

public class MotorinoImmatricolato extends Motorino{
    private double maxVelocita;
    private String targa;


    public MotorinoImmatricolato(String colore, double velocita, String tipo, double maxVelocita, String targa) {
        super(colore, velocita, tipo);
        this.maxVelocita = maxVelocita;
        this.targa = targa;
    }

    public void getMax(){
        System.out.println(maxVelocita);
    }

    @Override
    public void accelera(double newVelocita){
        double s=super.velocita+newVelocita;
        if(s<maxVelocita){
            super.velocita=s;
            return;
        }
        maxVelocita=s;
    }
}
