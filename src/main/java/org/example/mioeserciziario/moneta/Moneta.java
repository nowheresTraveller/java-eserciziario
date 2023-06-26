package org.example.mioeserciziario.moneta;

public class Moneta {

    private double valore;
    private String valuta;

    public Moneta(double valore) {
        this.valore = valore;
        this.valuta="EURO";
    }

    public double getValore() {
        return valore;
    }

    public String getValuta() {
        return valuta;
    }

    public String toString(){
        return "valore : "+valore+" valuta : "+valuta+"!";
    }

    public String getDescrizione(){
        return "La valuta della moneta è "+valuta+" e il suo valore è "+valore+" "+valuta+"!";
    }


    @Override
    public boolean equals(Object obj){
        Moneta m = (Moneta) obj;
        if (this.valore == m.getValore() && this.valuta == m.getValuta()){
            return true;
        }

        return false;
    }
}
