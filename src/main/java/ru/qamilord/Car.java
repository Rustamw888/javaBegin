package ru.qamilord;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car implements ICar {

  private String name;

  public Car() {
  }

  public Car(String name) {
    this.name = name;
  }


  @Override
  public void drive() {
    System.out.println(name + " drive");
  }

  @Override
  public void stop() {
    System.out.println(name + " stop");
  }
}
