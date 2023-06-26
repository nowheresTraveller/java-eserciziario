package org.example.mioeserciziario.abbigliamento;

public class TipoCapoAbbigliamento {

    protected String marca;
    protected String modello;
    protected double costo;

    public TipoCapoAbbigliamento(String marca, String modello, double costo) {
        this.marca = marca;
        this.modello = modello;
        this.costo = costo;
    }

    public void getCosto(){
        System.out.println("-costo : "+costo);
    }

    public double applicaSconto(double valSconto){
        return costo-((costo*valSconto)/100);
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


}
