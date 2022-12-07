package ru.qamilord.oopCinema.interfaces;

import java.io.IOException;
import java.util.List;
import ru.qamilord.oopCinema.Client;

public interface ICinema {

  List<ISession> getSessions();
  int getCashBox();

  void sale(List<ISession> getSession, Client client) throws IOException;
}
