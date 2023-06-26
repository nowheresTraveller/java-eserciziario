package org.example.mioeserciziario.pilaecoda;

public class Coda {
    private Integer [] valoriPila;

    public Coda() {
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
        if(valoriPila[0]!=null){
            Integer getValore=valoriPila[0];
            for (int x=1;x<valoriPila.length;++x){
                if(valoriPila[x+1]==null){
                    return getValore;
                }else{
                    valoriPila[x]=valoriPila[x+1];
                    valoriPila[x+1]=null;
                }
            }
        }
            System.out.println("Errore,coda vuota!");
            return null;

    }
}
