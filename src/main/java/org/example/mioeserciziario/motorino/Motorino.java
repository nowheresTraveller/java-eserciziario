package org.example.mioeserciziario.motorino;

public class Motorino {
    protected String colore;
    protected double velocita;
    protected String tipo;
    protected boolean antifurto;

        public Motorino(String colore, double velocita, String tipo) {
        this.colore = colore;
        this.velocita = velocita;
        this.tipo = tipo;
        this.antifurto=false;
    }

    public void accelera(double newVelocita){
        if (antifurto==false)
            velocita+=newVelocita;
    }


    public void inserisciAntifurto(){
        antifurto=true;
    }
    public double getVelocita() {
        return velocita;
    }
}
