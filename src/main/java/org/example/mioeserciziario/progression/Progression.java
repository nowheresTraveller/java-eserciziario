package org.example.mioeserciziario.progression;

import java.util.ArrayList;
import java.util.List;

public class Progression {
    private int salario;
    private int incrementoSalario;
    private List<Employe> employeList;

    public Progression(int salario, int incrementoSalario) {
        this.salario = salario;
        this.incrementoSalario = incrementoSalario;
        this.employeList = new ArrayList<>();
    }

    public void addEmploye(String nome, int data) {

        for (Employe employe : employeList) {
            if (employe.getNome().equals(nome)) {
                System.out.println("Errore, impiegato già inserito!");
                return;
            }
        }
        employeList.add(new Employe(nome, data));
    }

    public void addBonus(String nome, int data, int cifra) {
        if (employeList.isEmpty()) {
            System.out.println("Errore, Lista impiegati vuota!");
            return;
        }

        for (Employe employe : employeList) {
            if (employe.getNome().equals(nome)) {
                employe.addBonus(new Bonus(data, cifra));
                return;
            }
        }

        System.out.println("Errore, impiegato non presente nella lista-impiegati!)");
    }

    public Integer getSalary(String nome, int anno) {
        if (employeList.isEmpty()) {
            System.out.println("Errore, Lista impiegati vuota!");
            return null;
        }


        for (Employe employe : employeList) {
            if (employe.getNome().equals(nome)) {
                int annoInizioImpiegato = employe.getDataInizio();
                if (annoInizioImpiegato <= anno) {

                    int bonus = 0;
                    List<Bonus> bonusList = employe.getBonusList();
                    if (!bonusList.isEmpty()) {
                        for (Bonus b : bonusList) {
                            if (b.getData() == anno) {
                                bonus = b.getCifra();
                                break;
                            }
                        }
                    }
                    return salario + (incrementoSalario * ((anno - annoInizioImpiegato) + 1)) + bonus;
                }
                System.out.println("Errore, impossibile calcolare salario, anno d'assunzione dell'impiegato > dell'anno di calcolo!");
                break;
            } else {
                System.out.println("Errore, impossibile calcolare salario, impiegato non presente nella lista!");
                break;
            }
        }

        return null;

    }

}
