package org.example.mioeserciziario.safe;

public class Test {

    public static void main(String[] args) {
        try {
            Safe safe = new Safe(1234, "ciao bello");
            System.out.println(safe.open(1234));
            System.out.println(safe.open(12345));
            System.out.println(safe.open(12345));
            System.out.println(safe.open(12345));
            System.out.println(safe.open(12345));
        }catch(Exception e){
            System.out.println("sono nella catch");
        }

    }
}
