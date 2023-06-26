package org.example.mioeserciziario.pilaecoda;

public class Pila {
    private Integer [] valoriPila;

    public Pila() {
        this.valoriPila= new Integer [5];
    }

    public void put(Integer v){
        for (int x=0; x<valoriPila.length;++x){
            if(valoriPila[x]==null){
                valoriPila[x]=v;
                System.out.println("valore inserito con successo");
                return;
            }
        }

        System.out.println("Impossibile inserire il valore, pila piena!");
    }

    public Integer get(){
        for (int x=5; x>0;--x){
            if(valoriPila[x]!=null){
                int getValore= valoriPila[x];
                valoriPila[x]=null;
                return getValore;
            }
        }
        System.out.println("Errore, pila vuota!");
        return null;
    }

}
