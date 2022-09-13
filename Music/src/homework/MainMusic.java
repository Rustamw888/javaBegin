package homework;

public class MainMusic {

  public static void main(String[] args) {

    PlayList playList = new PlayList();

    Song song1 = new Song("Щелкунчик", new Author("Чайковский"));
    Song song2 = new Song("Лебединое озеро", new Author("Чайковский"));
    Song song3 = new Song("Времена года", new Author("Вивальди"));
    Song song4 = new Song("Цвет настроения синий", new Author("Киркоров"));
    Song song5 = new Song("Shape of My Heart", new Author("Sting"));
    Song song6 = new Song("Show must go on", new Author("Queen"));
    Song song7 = new Song("We will rock you", new Author("Queen"));

    playList.addSong(song1);
    playList.addSong(song2);
    playList.addSong(song3);
    playList.addSong(song4);
    playList.addSong(song5);
    playList.addSong(song6);
    playList.addSong(song7);

    playList.playAllSongs();

  }
}