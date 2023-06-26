package org.example.mioeserciziario.clinica;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

    //TODO vedere meglio come creare enum 'particolari'
    private List<Prenotazione> prenotazioniList;

    public enum Specialista {PEDIATRIA, OCULISTA}

    public Clinica() {
        this.prenotazioniList = new ArrayList<>();
    }


    public void prenota(Specialista sp, String cliente) {
        for (Prenotazione p : prenotazioniList) {
            if (p.getCliente().equals(cliente)) {
                System.out.println("Impossibile prenotare, cliente ha già una prenotazione!");
                return;
            }
        }
        prenotazioniList.add(new Prenotazione(sp, cliente));
    }

    public void cancellaPrenotazione(Specialista sp, String cliente) {
        int sizeList = prenotazioniList.size();
        if (sizeList > 0) {
            Prenotazione prenotazione;
            for (int i = 0; i < sizeList; ++i) {
                prenotazione = prenotazioniList.get(i);
                if (cliente.equals(prenotazione.getCliente()) && sp == prenotazioniList.get(i).getSp()) {
                    prenotazioniList.remove(prenotazione);
                    System.out.println("Prenotazione eliminata con successo!");
                    return;
                }
            }
            System.out.println("Impossibile prenotare, prenotazione non presente!");
            return;
        }
        System.out.println("Impossibile cancellare prenotazione, lista prenotazione vuota!");
    }

    public List<String> getPrenotati(Specialista sp) {
        if (!prenotazioniList.isEmpty()) {
            List<String> newList = new ArrayList<>();
            for (Prenotazione p : prenotazioniList){
                if(p.getSp()==sp){
                    newList.add(p.getCliente());
                }
            }
            if(!newList.isEmpty())
                return newList;
        }

        return null;
    }

}
