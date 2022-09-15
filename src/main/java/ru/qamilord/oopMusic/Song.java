package ru.qamilord.oopMusic;

public class Song implements ISong {

  private String songName;

  private Author author;

  public Song() {
  }

  public Song(String songName, Author author) {
    this.songName = songName;
    this.author = author;
  }

  @Override
  public String getSongName() {
    return songName;
  }

  public void setSongName(String songName) {
    this.songName = songName;
  }

  @Override
  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  @Override
  public void play() {
    System.out.println("Играет песня: " + songName + ", автор: " + author.getAuthorName());
  }
}
