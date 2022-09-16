package ru.qamilord.oopMusic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class Song implements ISong {

  private String songName;

  private Author author;

  @Override
  public void play() {
    System.out.println("Играет песня: " + songName + ", автор: " + author.getAuthorName());
  }
}
