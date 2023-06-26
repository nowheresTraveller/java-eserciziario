package org.example.mioeserciziario.sim;

public class Test {

    public static void main(String[] args) {
        Sim sim = new Sim ("3341212345",120.2);
        System.out.println(sim.toString());
        sim.stampaChiamataList();
        sim.faiChiamata("3325645678",20);
        sim.faiChiamata("3382134221",50);
        sim.faiChiamata("3356712321",123);
        sim.stampaChiamataList();
    }
}
