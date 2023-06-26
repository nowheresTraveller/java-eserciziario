package org.example.mioeserciziario.roomandreservation;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private List<Reservation> reservationList;

    public Room() {
        this.reservationList = new ArrayList<>();
    }

    public Reservation reserve(String nomeUtente, int dataInizio, int dataFine) {
        if(dataInizio<0 || dataFine>365 || dataInizio>dataFine){
            System.out.println("Errore, date inserite non valide");
            return null;
        }

        if (!reservationList.isEmpty()) {
            int start,end;
            for (Reservation r : reservationList) {
                start=r.getDataInizio();
                end=r.getDataFine();
                if ((dataInizio >= start && dataInizio <= r.getDataFine()) ||
                        dataFine>=start && dataFine <= end) {
                    throw new RuntimeException("Errore, camera occupata!");
                }
            }
        }
        Reservation newReservation = new Reservation(nomeUtente, dataInizio, dataFine);
        reservationList.add(newReservation);
        return newReservation;
    }

    public List<Reservation> reservations() {
        if (!reservationList.isEmpty()) {
            List<Reservation> retReservationList = reservationList;
            Reservation pattern;
            Reservation secondPattern;
            int rListSize = retReservationList.size()-1;
            boolean bool = true;

            while (bool) {
                bool = false;

                for (int i = 0; i < rListSize; ++i) {
                    pattern=retReservationList.get(i);
                    secondPattern=retReservationList.get(i+1);
                    if(pattern.getDataInizio()>secondPattern.getDataInizio()){
                        retReservationList.set(i,secondPattern);
                        retReservationList.set(i+1,pattern);
                        bool=true;
                    }
                }
            }
            return retReservationList;
        }
        return null;
    }

}
