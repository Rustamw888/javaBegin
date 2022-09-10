package ru.qamilord.oop;

// Класс обязан реализовать все методы интерфейса, иначе компилятор будет ругаться.
public class Robocop extends ARobot {

  // класс не обязаны уже реализовывать метод getName, т.к. он уже реализован в абстрактном родит. классе


  public Robocop() {
  }

  public Robocop(String name, IWing wing) {
    super(name, wing);
  }

  @Override // указание компилятору, что мы хотим реализовать метод интерфейса
  public void move() {
    System.out.println("Robocop move");
  }

  @Override
  public void stop() {
    System.out.println("Robocopstop");

  }

  @Override
  public void flight() {
    System.out.println("Robocop flight with wing size = " + getWing().getSize());
  }


  @Override
  public void talk() {
    System.out.println("robo talk");
  }
}
