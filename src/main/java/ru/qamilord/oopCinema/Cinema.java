package ru.qamilord.oopCinema;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.qamilord.oopCinema.interfaces.ICinema;
import ru.qamilord.oopCinema.interfaces.ISession;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cinema implements ICinema {

  List<ISession> sessions;
  int cashBox;

  @Override
  public void sale(List<ISession> sessions, Client client) {
    Optional<ISession> result = sessions.stream()
        .filter(session -> session.getMovie().getName().contains(client.getWantsMovie())).findFirst();
    if (result.isEmpty()) {
      System.out.println("Такого фильма нет в прокате");
      return;
    } else {
      int money = client.getWallet() - result.get().getMovie().getPrice();
      if (money < 0) {
        System.out.println("Не хватает средств");
        return;
      }
      if (Objects.equals(client.getWantsMovie(), result.get().getMovie().getName())) {
        client.setWallet(money);
        System.out.println("Спасибо за покупку, проходите на сеанс в зал №1");
        System.out.println("Денег осталось: " + client.getWallet());
        return;
      }
    }
  }

  //TODO на рассмотрение
//  @Override
//  public void sale(List<ISession> sessions, Client client) {
//
//    for (ISession session : sessions) {
//
//      if (client.getWantsMovie().equals(session.getMovie().getName())) {
//        int money = client.getWallet() - session.getMovie().getPrice();
//        if (money < 0) {
//          System.out.println("Не хватает средств");
//          return;
//        }
//        if (Objects.equals(client.getWantsMovie(), session.getMovie().getName())) {
//          client.setWallet(money);
//          System.out.println("Спасибо за покупку, проходите на сеанс в зал №1");
//          System.out.println("Денег осталось: " + client.getWallet());
//        }
//      }
//      if() {
//        System.out.println("Такого фильма нет в прокате");
//        return;
//      }
//    }
//  }
}
