package org.example.mioeserciziario.roomandreservation;

public class Reservation {
    private String nomeUtente;
    private int dataInizio;
    private int dataFine;

    public Reservation(String nomeUtente, int dataInizio, int dataFine) {
        this.nomeUtente = nomeUtente;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public int getDataInizio() {
        return dataInizio;
    }

    public int getDataFine() {
        return dataFine;
    }
}
