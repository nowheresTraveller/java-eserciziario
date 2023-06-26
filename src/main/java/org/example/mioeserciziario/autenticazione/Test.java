package org.example.mioeserciziario.autenticazione;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Autenticatore autenticatore= new Autenticatore();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Benvenuto nel sistema! inserire user e password");
        if(autenticatore.login(scanner.next(), scanner.next()))
            System.out.println("Login effettuato con successo!");
        else{
            System.out.println("Errore, user e password non validi!");
        }
    }
}
