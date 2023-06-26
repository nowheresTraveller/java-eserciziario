package org.example.mioeserciziario.automobile2;

public class Test {

    public static void main(String[] args) {
        Auto auto = new Auto(6.0);
        auto.faiRifornimento(30.0);
        System.out.println("- carburante attuale : "+auto.dammiCarburante());
        if(auto.drive(6)){
            System.out.println("distanza percorsa con successo!");
        }else{
            System.out.println("Impossibile effettuare questa distanza!");
        }
        if(auto.drive(4)){
            System.out.println("distanza percorsa con successo!");
        }else{
            System.out.println("Impossibile effettuare questa distanza!");
        }
        System.out.println("- carburante attuale : "+auto.dammiCarburante());
    }

}
