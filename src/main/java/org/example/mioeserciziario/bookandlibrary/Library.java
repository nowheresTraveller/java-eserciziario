package org.example.mioeserciziario.bookandlibrary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library {

    private List <Book> bookList;

    public Library(){
        this.bookList = new ArrayList<>();
    }

    public Book addBook(String titolo, String autore){
        Book newBook= new Book(titolo,autore);
        bookList.add(newBook);
        return newBook;
    }

    public Set<Library.Book> getBooksByTag(String tag){
        Set <Library.Book> retBookSet = new HashSet<>();

        for (Library.Book book : bookList){
            List<String> listTag = book.getTagList();

            if(!listTag.isEmpty()){
                for(String t: listTag){
                    if(t.equals(tag)){
                        retBookSet.add(book);
                        break;
                    }
                }
            }
        }

        if(retBookSet.isEmpty()){
            return null;
        }
        return retBookSet;
    }

    public class Book {
        private String titolo;
        private String autore;
        private List<String> tagList;


        public Book(String titolo, String autore) {
            this.titolo = titolo;
            this.autore = autore;
            this.tagList = new ArrayList<String>();
        }

        public void addTag(String tag){
            tagList.add(tag);
        }

        public List<String> getTagList() {
            return tagList;
        }

        @Override
        public String toString(){
            return titolo+", "+autore+",";
        }
    }
}
