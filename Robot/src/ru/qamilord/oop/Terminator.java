package ru.qamilord.oop;

public class Terminator implements IRobot{

  @Override
  public void move() {
    System.out.println("Terminator move");
  }

  @Override
  public void stop() {
    System.out.println("Terminator stop");
  }

  @Override
  public void fight() {
    System.out.println("Terminator fight");
  }
}
