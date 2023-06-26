package org.example.mioeserciziario.book;

public class Chapter {
    private String titolo;
    private String contenuto;

    private int numero;

    public Chapter(String titolo, String contenuto, int numero) {
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.numero = numero;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getContenuto() {
        return contenuto;
    }
}
