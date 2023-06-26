package org.example.mioeserciziario.abbigliamento;



public class Negozio {
    public static void main(String[] args) {
        TipoCapoAbbigliamento tCapoAbb= new TipoCapoAbbigliamento("colmar","giacca E45",350.5);
        tCapoAbb.getCosto();
        System.out.println("- costo scontato : "+tCapoAbb.applicaSconto(30));

        CapoAbbigliamento capoAbbigliamento = new CapoAbbigliamento("Levis","jeans 502", 79.8,
                                                                        40,30,30);

        capoAbbigliamento.venduto(2);
        capoAbbigliamento.getDettagli();

    }
}
