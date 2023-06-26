package org.example.mioeserciziario.bookandlibrary;

import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Library firstLibrary= new Library();
        Library secondLibrary= new Library();
        Library.Book book1= firstLibrary.addBook("Il cavaliere inesistente","Italo Calvino");
        Library.Book book2= firstLibrary.addBook("Harry Potter","Rowling");
        Library.Book book3= firstLibrary.addBook("Il codice Da Vinci","Brown");
        Library.Book book4= firstLibrary.addBook("Maschera","Pirandello");
        book1.addTag("Avventura");
        book1.addTag("Narrativa");
        book2.addTag("Avventura");
        book2.addTag("Ragazzi");
        book3.addTag("Thriller");
        Set<Library.Book> mySet= firstLibrary.getBooksByTag("Avventura");
        System.out.println (mySet);

    }
}
