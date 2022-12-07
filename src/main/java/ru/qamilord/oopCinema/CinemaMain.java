package ru.qamilord.oopCinema;

/*

Scanner

Кинотеатр
Список фильмов в нем
Сеансы (фильм + цена + время) - чем позднее, тем дороже
В сеансы нельзя добавлять фильмы, которых нет в кинотеатре (проверка доп)
----
Посетитель (выбирает фильм и покупает, у него отнимается сумма в кошельке)
В консоли - выберите сеанс из списка - от 1 до 5 - нажимает - происходит покупка и человек его посмотрел
не может купить, Если не хватает денег

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import ru.qamilord.oopCinema.interfaces.ISession;

public class CinemaMain {

  public static void main(String[] args) throws IOException {

    Cinema cinema = new Cinema();

    List<Movie> movieList = List.of(
        new Movie("Терминатор 2", 100),
        new Movie("Матрица", 120),
        new Movie("Сказ о розовом зайце", 150),
        new Movie("Рекетир", 180),
        new Movie("Звонок", 200)
    );

    List<ISession> sessionsList = List.of(
        new Session(movieList.get(0), 12),
        new Session(movieList.get(1), 15),
        new Session(movieList.get(2), 18),
        new Session(movieList.get(3), 20),
        new Session(movieList.get(4), 22)
    );

    cinema.setSessions(sessionsList);

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Client client = new Client("Рустам", 1000, reader.readLine());

    cinema.sale(cinema.getSessions(), client);
  }

}
