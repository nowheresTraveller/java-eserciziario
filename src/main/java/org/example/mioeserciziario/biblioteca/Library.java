package org.example.mioeserciziario.biblioteca;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library() {
        this.bookList=new ArrayList<Book>();
    }

    public boolean addBook(Book newBook){
        for (Book b : bookList){
            if (b.getTitolo().equals(newBook.getTitolo()))
                return false;
        }

        bookList.add(newBook);
        return true;
    }

    public boolean loanBook(String libroRichiesto){
        for (Book lBook : bookList){
            if(lBook.getTitolo().equals(libroRichiesto) && lBook.isLent()==false){
                lBook.setLent(true);
                //TODO bloccare un secondo il programma
                lBook.setDataPrestito(LocalDateTime.now());
                return true;
            }else if(lBook.getTitolo().equals(libroRichiesto) && lBook.isLent()==true){
                return false;
            }
        }
        throw new RuntimeException("Libro non presente nella biblioteca!");
    }

    public void returnBook (String nuovoLibro){
        for (Book lBook : bookList){
            if (lBook.getTitolo().equals(nuovoLibro) && lBook.isLent()==true){
                lBook.setLent(false);
                System.out.println ("libro restituito con successo!");
                return;
            }
        }

        throw new RuntimeException("Libro non in stato 'prestato' o non presente nella biblioteca!");
    }

    public void printLoans(){
        List <Book> loanBooks = new ArrayList<>();
        for (Book b : bookList){
            if(b.isLent()){
                loanBooks.add(b);
            }
        }

        if(loanBooks.isEmpty()){
            System.out.println("La biblioteca non ha dato in prestito nessun libro!");
            return;
        }

        //ordinamento loanBooks
        boolean isSwapping=true;
        int lBookSize=loanBooks.size()-1;
        Book fBook;
        Book sBook;

        while(isSwapping){
            isSwapping=false;

            for(int i=0;i<lBookSize;++i){
                fBook=loanBooks.get(i);
                sBook=loanBooks.get(i+1);
                if(fBook.getDataPrestito().isAfter(sBook.getDataPrestito())){
                    isSwapping=true;
                    loanBooks.set(i+1,fBook);
                    loanBooks.set(i,sBook);
                }
            }
        }

        System.out.println("- Libri in prestito : ");
        for (Book b : loanBooks){
            System.out.println("      - titolo : "+b.getTitolo()+", data prestito : "+b.getDataPrestito());
        }
    }
}
