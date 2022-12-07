package ru.qamilord.oopMusic;

import java.util.ArrayList;

public class PlayList implements IPlaylist {

  private ArrayList<ISong> songList = new ArrayList<>();

  public PlayList() {
  }

  public PlayList(ArrayList<ISong> songList) {
    this.songList = songList;
  }

  @Override
  public ArrayList<ISong> getSongList() {
    return songList;
  }

  public void setSongList(ArrayList<ISong> songList) {
    this.songList = songList;
  }

  @Override
  public void addSong(ISong song) {
    songList.add(song);
  }

  @Override
  public void playAllSongs() {
    for (ISong song : songList) {
      song.play();
    }
  }
}
