package ru.qamilord.oopMusic;

import java.util.ArrayList;

public interface IPlaylist {

  ArrayList<ISong> getSongList();

  void addSong(ISong song);

  void playAllSongs();

}
