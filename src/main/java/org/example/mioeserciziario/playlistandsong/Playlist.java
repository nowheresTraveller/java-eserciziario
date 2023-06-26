package org.example.mioeserciziario.playlistandsong;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    List<Song> songList;

    public Playlist() {
        songList = new ArrayList<Song>();
    }

    public void add(Song song) {
        songList.add(song);
    }

    public void remove(Song otherSong) {
        for (Song song : songList) {
            if (song.equals(otherSong)) {
                songList.remove(song);
            }
        }
    }

    public int compareTo(Playlist otherPlaylist) {
        List<Song> otherListSong=otherPlaylist.getSongList();
        boolean check;

        for (Song firstSong : songList){
            check=false;
            for (Song secondSong : otherListSong){
                if(firstSong.equals(secondSong)){
                    check=true;
                    break;
                }
            }

            if (check==false){
                return -1;
            }
        }


        for (Song firstSong : otherListSong){
            check=false;
            for (Song secondSong : songList){
                if(firstSong.equals(secondSong)){
                    check=true;
                    break;
                }
            }

            if (check==false){
                return -1;
            }
        }

        return 1;
    }

    public List<Song> getSongList() {
        return songList;
    }
}
