package ru.qamilord;

public interface IComputer {

  IMonitor getMonitor();

  IMouse getMouse();

  String getComputerName();

  void on();

  void off();

}
