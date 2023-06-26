package org.example.mioeserciziario.dipendente;

public class DipendenteA extends Dipendete{

    private int malattia;

    public DipendenteA(String matricola, double stipendio, double straordinario) {
        super(matricola, stipendio, straordinario);
        this.malattia=0;
    }

    public void prendiMalattia(int g){
        malattia+=g;
    }

    @Override
    public double paga (int ore){
        double p=super.paga(ore);
        if(malattia==0){
            return p;
        }
        return p-(malattia-15.0);
    }

    public void stampaMalattia(){
        System.out.println("-malattia : "+malattia);
    }
}
