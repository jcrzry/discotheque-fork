package edu.jocruzcsumb.discotheque;

import java.util.ArrayList;

/**
 * Created by Tommy on 3/23/2017.
 */

public class SongList {

    private ArrayList<Song> arrayList;

    public SongList(){

        arrayList = new ArrayList<Song>();

    }

    public void addSong(Song song){
        arrayList.add(song);
    }

    public boolean deleteSong(Song song){
        if(arrayList.contains(song)){
            arrayList.remove(song);
            return true;
        }
        return false;
    }

    public ArrayList<Song> allSongs(){
        return arrayList;
    }


}
