package org.example.mioeserciziario.biblioteca;

import java.time.LocalDateTime;

public class Test {

    public static void main(String[] args) {
        LocalDateTime l1 = LocalDateTime.now();
        LocalDateTime l2 = LocalDateTime.now();
        l1.isBefore(l2);

        Library library = new Library();
        System.out.println("----addBooks-------");
        System.out.println(library.addBook(new Book("Il barone rampante")));
        System.out.println(library.addBook(new Book("Il visconte dimezzato")));
        System.out.println(library.addBook(new Book("Il cavaliere inesistente")));
        System.out.println(library.addBook(new Book("Il barone rampante")));

        System.out.println("----loanBooks-------");
        System.out.println(library.loanBook("Il cavaliere inesistente"));
        System.out.println(library.loanBook("Il barone rampante"));
        System.out.println(library.loanBook("Il visconte dimezzato"));
        System.out.println(library.loanBook("Il barone rampante"));
        //System.out.println(library.loanBook("Nightflyers"));

        System.out.println("----returnBooks-----");
        library.returnBook("Il barone rampante");
        //library.returnBook("il barone rampante");

        System.out.println("----printLoansBooks-------");
        library.printLoans();

    }
}
