package ru.qamilord.oopMusic;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayList implements IPlaylist {

  @NonNull
  private ArrayList<ISong> songList = new ArrayList<>();

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
