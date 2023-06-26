package org.example.mioeserciziario.sim2;

public class Test {
    public static void main(String[] args) {
        Sim sim = new Sim("3381234213",123.3);
        sim.doChiamata("Paolo","3312123456");
        sim.doChiamata("Luca","3313256432");
        sim.doChiamata("Mario","3340932345");

        System.out.println("Il numero di chiamate è : "+sim.countChiamataByNumero("2231234321"));
        System.out.println("Il numero di chiamate è : "+sim.countChiamataByNumero("3313256432"));

        sim.stampaCampi();
    }
}
