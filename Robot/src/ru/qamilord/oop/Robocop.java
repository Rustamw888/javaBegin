package ru.qamilord.oop;

public class Robocop implements IRobot{

  @Override
  public void move() {
    System.out.println("Robocop move");
  }

  @Override
  public void stop() {
    System.out.println("Robocop stop");
  }

  @Override
  public void fight() {
    System.out.println("Robocop fight");
  }
}
