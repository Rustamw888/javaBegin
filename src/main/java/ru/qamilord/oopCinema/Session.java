package ru.qamilord.oopCinema;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.qamilord.oopCinema.interfaces.ISession;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Session implements ISession {

  private Movie movie;
  private int time;

}
