package ru.qamilord;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class Car implements ICar {

  private String name;

  public Car() {
  }


  public Car(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  public void setName(String name) {
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
