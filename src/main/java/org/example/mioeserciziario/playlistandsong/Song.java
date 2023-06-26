package org.example.mioeserciziario.playlistandsong;

public class Song {
    private String nome;
    private int durata;

    public Song(String nome, int durata) {
        this.nome = nome;
        this.durata = durata;
    }

    @Override
    public boolean equals(Object object){
        Song otherSong = ((Song)object);
        if (this.nome.equals(otherSong.getNome()) && this.durata==otherSong.getDurata()){
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public int getDurata() {
        return durata;
    }
}
