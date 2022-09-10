package ru.qamilord.oop;

import java.util.Objects;

public class Car {

  private String name;

  public Car() {
  }

  public Car(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return name.equals(car.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
