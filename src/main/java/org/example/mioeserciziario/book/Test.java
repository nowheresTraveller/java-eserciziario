package org.example.mioeserciziario.book;

public class Test {

    public static void main(String[] args) {
        Book firstBook=new Book();
        Book secondBook= firstBook.clone();
        System.out.println(firstBook.equals(secondBook));
    }
}
