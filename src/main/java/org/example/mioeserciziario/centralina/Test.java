package org.example.mioeserciziario.centralina;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Controller c= new Controller();
        Controller.Function ariaCondiz= c.addFunction("Aria_condizionata");
        Controller.Function sensParch = c.addFunction("sensore_parcheggio");
        Controller.Function vetroElettr=c.addFunction("vetro_elettrico");
        ariaCondiz.turnOn();
        sensParch.turnOn();
        vetroElettr.turnOff();
        c.printOn();
    }
}

