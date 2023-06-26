package org.example.mioeserciziario.sim;

public class Chiamata {
    private String numero;
    private int durata;

    public Chiamata(String numero, int durata) {
        this.numero = numero;
        this.durata = durata;
    }

    public String getNumero() {
        return numero;
    }

    public int getDurata() {
        return durata;
    }
}
