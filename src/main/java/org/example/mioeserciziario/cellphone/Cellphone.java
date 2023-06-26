package org.example.mioeserciziario.cellphone;

import java.util.ArrayList;
import java.util.List;

public class Cellphone {
    private String gestore;
    private String numTelefono;
    private static List<Tariffa> tariffaList;

    public Cellphone(String gestore, String numTelefono) {
        this.gestore = gestore;
        this.numTelefono = numTelefono;
        this.tariffaList= new ArrayList<>();
    }

    public static void setCost (String gestPart, String gestDest, double costo){
        if(!tariffaList.isEmpty()){
            for(Tariffa t : tariffaList){
                if(t.getGestorePartenza().equals(gestPart) && t.getGestoreDestinazione().equals(gestDest)){
                    t.setCosto(costo);
                    System.out.println("Tariffa aggiornata!");
                    return;
                }
            }
        }

        tariffaList.add(new Tariffa(gestPart,gestDest,costo));
    }


    public double getCost(Cellphone b, int minuti){
        String gestDest= b.getGestore();
        for (Tariffa tariffa : tariffaList){
            if(tariffa.getGestorePartenza().equals(this.gestore) && tariffa.getGestoreDestinazione().equals(gestDest)){
                return minuti*tariffa.getCosto();
            }
        }

        throw new RuntimeException("Errore!");
    }


    public String getGestore() {
        return gestore;
    }
}
