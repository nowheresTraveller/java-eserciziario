package org.example.mioeserciziario.clinica;

public class Prenotazione {
    Clinica.Specialista sp;
    private String cliente;

    public Prenotazione(Clinica.Specialista sp, String cliente) {
        this.sp = sp;
        this.cliente = cliente;
    }

    public Clinica.Specialista getSp() {
        return sp;
    }

    public String getCliente() {
        return cliente;
    }
}
