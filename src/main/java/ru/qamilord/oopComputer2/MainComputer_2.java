package ru.qamilord.oopComputer2;

public class MainComputer_2 {

  public static void main(String[] args) {

    Monitor monitor = new Monitor("Samsung");
    Computer computer = new Computer("MacBook", monitor);

    computer.on();
    computer.off();
  }
}