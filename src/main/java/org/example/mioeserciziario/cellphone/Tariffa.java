package org.example.mioeserciziario.cellphone;

public class Tariffa {
    private String gestorePartenza;
    private String gestoreDestinazione;
    private double costo;

    public Tariffa(String gestorePartenza, String gestoreDestinazione, double costo) {
        this.gestorePartenza = gestorePartenza;
        this.gestoreDestinazione = gestoreDestinazione;
        this.costo = costo;
    }

    public String getGestorePartenza() {
        return gestorePartenza;
    }

    public String getGestoreDestinazione() {
        return gestoreDestinazione;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
