package org.example.mioeserciziario.contocorrente;

import java.util.ArrayList;
import java.util.List;

public class ContoCorrente {
    private String intestario;
    private String numContoCorrente;
    private double saldo;

    private List<String> listaMovimenti;

    public ContoCorrente(String intestario, String numContoCorrente, double saldo) {
        this.intestario = intestario;
        this.numContoCorrente = numContoCorrente;
        this.saldo = saldo;
        this.listaMovimenti = new ArrayList<String>();
    }

    public void prelievo(double v) {
        if (v > saldo) {
            System.out.println("Errore, saldo inferiore alla cifra richiesta!");
        } else {
            listaMovimenti.add("- saldo iniziale : "+saldo+"! prelievo di "+v+" euro!");
            saldo -= v;
            System.out.println("Prelievo effettuato con successo!");
        }
    }

    public void versamento(double v) {
        listaMovimenti.add("-saldo inziale : "+saldo+"! versamento di "+v+" euro!");
        saldo += v;
    }

    public void stampaSaldo() {
        System.out.println("-saldo : " + saldo);
    }

    public void stampaListaMovimenti() {
        int size = listaMovimenti.size();
        if (size == 0)
            System.out.println("Impossibile stampare la lista dei movimenti. " +
                    "           Non è stato effettuato ancora nessun movimento!");
        else {
            if (size < 5) {
                --size;
                System.out.println ("- Lista movimenti : ");
                for (int x = size; x>=0; x--) {
                    System.out.println(listaMovimenti.get(x));
                }
            } else {
                --size;
                System.out.println ("- Lista ultimi 5 movimenti : ");
                int firstIndex = size - 5;
                for (int x = size; x > firstIndex; --x) {
                    System.out.println(listaMovimenti.get(x));
                }
            }
        }
    }

}
