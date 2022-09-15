package ru.qamilord.oopComputer;

public class Computer1 {

  private String name;

  public Computer1() {
  }

  public Computer1(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println(name + " on");
  }

  public void off() {
    System.out.println(name + " off");
  }
}
