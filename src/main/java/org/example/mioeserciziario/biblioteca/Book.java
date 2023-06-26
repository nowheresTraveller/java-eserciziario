package org.example.mioeserciziario.biblioteca;

import java.time.LocalDateTime;

public class Book {
    private String titolo;
    private boolean isLent;
    private LocalDateTime dataPrestito;

    public Book(String titolo) {
        this.titolo = titolo;
        this.isLent=false;
    }

    public String getTitolo() {
        return titolo;
    }

    public boolean isLent() {
        return isLent;
    }

    public LocalDateTime getDataPrestito() {
        return dataPrestito;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setLent(boolean lent) {
        isLent = lent;
    }

    public void setDataPrestito(LocalDateTime dataPrestito) {
        this.dataPrestito = dataPrestito;
    }
}
