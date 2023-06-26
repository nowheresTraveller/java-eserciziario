package org.example.mioeserciziario.sim2;

public class Chiamata {
    private String utente;
    private String numero;
    private int minuti;

    public Chiamata(String utente, String numero, int minuti) {
        this.utente = utente;
        this.numero = numero;
        this.minuti = minuti;
    }

    public Chiamata(String utente, String numero) {
        this.utente = utente;
        this.numero = numero;
    }

    public String getUtente() {
        return utente;
    }

    public String getNumero() {
        return numero;
    }

    public int getMinuti() {
        return minuti;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public void setUtente(String utente) {
        this.utente = utente;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
