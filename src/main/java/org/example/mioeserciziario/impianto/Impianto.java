package org.example.mioeserciziario.impianto;

import java.util.ArrayList;
import java.util.List;

public class Impianto {

    private int potenzaMax;
    private List<Apparecchio> apparList;

    public Impianto(int potenzaMax) {
        this.potenzaMax = potenzaMax;
        apparList = new ArrayList<Apparecchio>();
    }

    public void collega(Apparecchio a) {
        int newPot = a.getPotenza();
        if (newPot > potenzaMax) {
            System.out.println("Errore, impossibile collegare questo apparecchio!");
            return;
        }

        if (apparList.size() != 0) {
            for (Apparecchio app : apparList) {
                if (app.getOn()) {
                    newPot += app.getPotenza();
                }
            }
            if (newPot > potenzaMax) {
                System.out.println("Errore, impossibile collegare questo apparecchio!");
                return;
            }
        }

        apparList.add(a);
    }


    public int potenza() {
        int ret = 0;
        if (!(apparList.size() == 0)) {
            for (Apparecchio a : apparList) {
                if (a.getOn()) {
                    ret += a.getPotenza();
                }
            }
        }
        return ret;
    }

}
