package org.example.mioeserciziario.moneta;

public class Test {
    public static void main(String[] args) {
        Moneta m1= new Moneta(1);
        Moneta m2= new Moneta (0.20);
        Moneta m3= new Moneta (2);
        PortaMonete portaMonete= new PortaMonete();

        portaMonete.aggiungi(m1);
        portaMonete.aggiungi(m2);

        portaMonete.stato();


        System.out.println (m1);


        Moneta newMoneta = portaMonete.preleva(m1);
        if (newMoneta!=null){
            System.out.println(newMoneta.toString());
        }

        newMoneta = portaMonete.preleva(m3);
        if (newMoneta!=null){
            System.out.println(newMoneta.toString());
        }

        portaMonete.stato();

    }
}
