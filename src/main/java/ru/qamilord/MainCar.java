package ru.qamilord;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class MainCar {

  public static void main(String[] args) {

    Weld weld = new Weld();
    WeldContainer container = weld.initialize();

    Car car = container.select(Car.class).get(); // чтобы получить конкретный объект - явно указываем его тип
    car.setName("Tesla");

    car.drive();
    car.stop();

    container.shutdown(); // завершаем контейнер

  }
}