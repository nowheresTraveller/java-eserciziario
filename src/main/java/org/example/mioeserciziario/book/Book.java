package org.example.mioeserciziario.book;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private List<Chapter> chapterList;

    public Book() {
        chapterList=new ArrayList<Chapter>();
    }

    public void addChapter(String titolo, String contenuto){
        try {
            chapterList.add(new Chapter(titolo, contenuto, chapterList.size() + 1));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public String getChapterName(int i){
        if (i<chapterList.size()){
            return chapterList.get(i).getTitolo();
        }

        return null;
    }

    public String getChapterContent(int i){
        if (i<chapterList.size()){
            return chapterList.get(i).getContenuto();
        }

        return null;
    }


    @Override
    public Book clone(){
        return this;
    }


}


