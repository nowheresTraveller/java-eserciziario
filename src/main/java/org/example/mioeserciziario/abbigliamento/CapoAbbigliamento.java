package org.example.mioeserciziario.abbigliamento;

public class CapoAbbigliamento extends TipoCapoAbbigliamento{
    private int taglia;
    private int quantitaAcquistata;
    private int quantitaDisponibile;

    public CapoAbbigliamento(String marca, String modello, double costo, int taglia, int quantitaAcquistata, int quantitaDisponibile) {
        super(marca, modello, costo);
        this.taglia = taglia;
        this.quantitaAcquistata = quantitaAcquistata;
        this.quantitaDisponibile = quantitaDisponibile;
    }

    public void venduto(int capiVenduti){
        int x= quantitaDisponibile-capiVenduti;
        if (quantitaDisponibile>x){
            quantitaDisponibile=x;
        }
    }

    public void getDettagli(){
        System.out.println ("Dati del capo d'abbigliamento:\n-marca : "+marca+"\n-modello : "+modello+"\n-costo:"+costo+
                "\n-taglia : "+taglia+"\n-quantità acquistata : "+quantitaAcquistata+
                "\n-quantità disponibile : "+quantitaDisponibile);
    }


}

