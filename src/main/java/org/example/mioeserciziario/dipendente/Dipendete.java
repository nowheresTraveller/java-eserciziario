package org.example.mioeserciziario.dipendente;

public class Dipendete {
    private String matricola;
    private double stipendio;
    private double straordinario;

    public Dipendete(String matricola, double stipendio, double straordinario) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double paga (int ore){
        stipendio+=(straordinario*ore);
        return stipendio;
    }

    public void stampa(){
        System.out.println("Dati dipendente:\n-matricola : "+matricola+"\n-stipendio: "+stipendio+"\n-straordinario : "+straordinario);
    }

}
