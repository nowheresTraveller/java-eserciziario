package org.example.mioeserciziario.wifiandnetwork;

public class Test {
    public static void main(String[] args) {
        Wifi manager = new Wifi();
        Wifi.Network n= manager.addNetwork("casa Rossi",-20);
        Wifi.Network n2= manager.addNetwork("casa Esposito",20);

        Wifi.Network n3= manager.addNetwork("casa Bianchi",10);
        System.out.println(manager.strongest().toString());

    }
}
