package org.example.mioeserciziario.dipendente;

public class CalcolaStipendio {
    public static void main(String[] args) {
        Dipendete d1 = new Dipendete("00309",1000.0,7.50);
        System.out.println(d1.paga(10));

        DipendenteA dA = new DipendenteA("00201",1500.0,8.50);
        dA.prendiMalattia(5);
        dA.paga(3);
        dA.stampaMalattia();

    }
}
