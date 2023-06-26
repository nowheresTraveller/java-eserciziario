package org.example.mioeserciziario.progression;

import java.util.ArrayList;
import java.util.List;

public class Employe {

    private String nome;
    private int dataInizio;

    private List<Bonus> bonusList;

    public Employe(String nome, int dataInizio) {
        this.nome = nome;
        this.dataInizio = dataInizio;
        this.bonusList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getDataInizio() {
        return dataInizio;
    }

    public List<Bonus> getBonusList() {
        return bonusList;
    }

    public void addBonus(Bonus bonus){
        bonusList.add(bonus);
    }
}
