package org.example.mioeserciziario.playlistandsong;

public class Test {

    public static void main(String[] args) {
        Song firstSong= new Song("Sono io",2);
//        Song secondSong= firstSong;
//        Song thirdSong=  new Song("Sono io",2);
//        System.out.println(firstSong.equals(secondSong));
//        System.out.println(firstSong.equals(thirdSong));

        Song secondSong= new Song("ciao bello",120);
        Song thirdSong= new Song("il cuore",100);
        Song fourthSong= new Song("l'amore",50);
        Playlist firstPlaylist= new Playlist();
        Playlist secondPlaylist= new Playlist();

        firstPlaylist.add(firstSong);
        firstPlaylist.add(secondSong);
        firstPlaylist.add(thirdSong);

        secondPlaylist.add(firstSong);
        secondPlaylist.add(secondSong);
        secondPlaylist.add(thirdSong);
        secondPlaylist.add(thirdSong);

        System.out.println(firstPlaylist.compareTo(secondPlaylist));


        secondPlaylist.add(fourthSong);
        System.out.println(firstPlaylist.compareTo(secondPlaylist));
    }
}
