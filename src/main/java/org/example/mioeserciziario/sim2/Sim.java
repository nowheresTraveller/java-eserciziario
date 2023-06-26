package org.example.mioeserciziario.sim2;

import org.example.mioeserciziario.sim2.Chiamata;

import java.util.ArrayList;
import java.util.List;

public class Sim {
    private String numero_tel;
    private double credito;
    private List<Chiamata> chiamataList;

    public Sim(String numero_tel, double credito) {
        this.numero_tel = numero_tel;
        this.credito = credito;
        this.chiamataList = new ArrayList<Chiamata>();
    }

    public void doChiamata(String nome, String numero){
        int minuti=calcolaMinuti();
        this.chiamataList.add(new Chiamata(nome,numero,minuti));
    }

    public int calcolaMinuti(){
        return (int)(Math.random()*100)+1;
    }

    public int countChiamataByNumero(String newNumero){
        int count =0;
        for(Chiamata chiamata : chiamataList ){
            if(chiamata.getNumero().equals(newNumero)){
                ++count;
            }
        }
        return count;
    }

    public void stampaCampi(){
        System.out.println("\n\n\n-------Dati Sim----------:\n- numero : "+this.numero_tel+"\n- credito : "+this.credito);
        this.stampaChiamataList();
    }

    public void stampaChiamataList(){
        System.out.println("- Lista chiamate : ");
        for(Chiamata chiamata : chiamataList ){
           System.out.println("      - nome : "+chiamata.getUtente()+", numero : "+chiamata.getNumero()+", minuti : "+chiamata.getMinuti());
        }
    }

    public String getNumero_tel() {
        return numero_tel;
    }

    public double getCredito() {
        return credito;
    }

    public List<Chiamata> getChiamataList() {
        return chiamataList;
    }

    public void setNumero_tel(String numero_tel) {
        this.numero_tel = numero_tel;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void setChiamataList(List<Chiamata> chiamataList) {
        this.chiamataList = chiamataList;
    }
}
