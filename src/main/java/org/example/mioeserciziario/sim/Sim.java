package org.example.mioeserciziario.sim;

import java.util.ArrayList;
import java.util.List;

public class Sim {
    private String numero;
    private double credito;
    List<Chiamata> chiamataList;

    public Sim(String numero, double credito) {
        this.numero = numero;
        this.credito = credito;
        this.chiamataList=new ArrayList<Chiamata>();
    }

    public void faiChiamata(String num, int durata){
        chiamataList.add(new Chiamata(num,durata));
    }

    public void cercaNumeroInChiamataList(String num){
        int cont=0;
        if(chiamataList.size()!=0){
            for (Chiamata chiamata : chiamataList){
                if(chiamata.getNumero().equals(num)){
                    cont++;
                }
            }
        }

        System.out.println("Chiamate effuettuate verso "+num+":\n-num : "+cont);
    }

    @Override
    public String toString(){
        return "Dati sim:\n-numero : "+numero+"\n-credito : "+credito+"\nnumero chiamate : "+chiamataList.size();
    }

    public void stampaChiamataList(){
        if(chiamataList.size()==0){
            System.out.println("Impossibile stampare lista, non sono state effettuate chiamate!");
            return;
        }

        System.out.println("Lista chiamate effettuate: ");
        for (Chiamata chiamata : chiamataList){
            System.out.println("- numero : "+chiamata.getNumero()+", durata : "+chiamata.getDurata());
        }
    }

    public String getNumero() {
        return numero;
    }

    public double getCredito() {
        return credito;
    }

    public List<Chiamata> getChiamataList() {
        return chiamataList;
    }
}
