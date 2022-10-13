package ru.qamilord.oopCity;

import java.util.ArrayList;

/*

Задача Магазин

1) очертить функционал
  - пришел клиент и купил товар
  - товар хранится в отделе
  - товар имеет свойства
  - в магазине есть продавец
  - кассир - принимает деньги
2) нет UI - только вывод в консоль
3) разделить на сущности - логические
 - магазин (включает продавца, кассира, товар имеет рабочие часы)
 - продавец (выполняет функцию продажи, уменьшает количество товаров, либо увеличивает при возврате)
 - кассир (выполняет функцию учета денежных средств, действие влияет на убыль, прибыль и связано с
 методом продавца по учету количества товаров, выдает чек клиенту)
 - товар (имеет количество, цену, гарантийный срок, все связано с методами кассиров и продавцов)
 - клиент (может выбрать товар и купить, а может вернуть товар, если гарантийный срок не вышел с
 момента покупки и если часы рабочие, имеет количество денег в кошельке)
4) создавать абстр (должны видеть весь функционал из п 1) и реал
 - магазин (has продавец, has кассир, has товар) интерфейс имеющий геттеры интерфейса продавца,
 кассира, товара, имеет рабочие часы (если рабочие часы вне рамок, то метод продавца не рабочий,
 продавец не доступен)
 - продавец (композит магазина) интерфейс с методом проверяющего гарантию, чек, наличие товара и
 если все хорошо, то отправляет к кассиру (доступен только если магазин открыт)
 - кассир (композит магазина) интерфейс минусует/прибавляет количество денег у магазина,
 минусует/прибавляет количество денег у клиента (доступен только после метода продавца)
 - товар (композит магазина) класс без интерфейса, потому что только свойства без методов
 / количество, цена, гарантийный срок
 - клиент (ассоциация магазина) класс без интерфейса, потому что только свойства без методов
 / поле общее количество денег, поле количество имеющегося товара



абстаркция реал
полим
инкапс

неизбыточность кода


 **/

public class City implements ICity {

  private String cityName;

  private ArrayList<IHouse> houseList = new ArrayList<>();

  public City() {
  }

  public City(String cityName, ArrayList<IHouse> houseList) {
    this.cityName = cityName;
    this.houseList = houseList;
  }

  @Override
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  @Override
  public ArrayList<IHouse> getHouseList() {
    return houseList;
  }

  public void setHouseList(ArrayList<IHouse> houseList) {
    this.houseList = houseList;
  }

  @Override
  public void showSettledList() {

    System.out.println("Город: " + cityName);

    for (IHouse house : houseList) {
      System.out.println("Дом: " + house.getAddress());
      for (IFlat flat : house.getFlatList()) {
        System.out.println("- Квартира: " + flat.getNumber());
        if (!flat.getSettlerList().isEmpty()) {
          if (flat.getSettlerList().size() >= 3) {
            System.out.println("--В одну квартиру можно заселить не более 2-х человек");
          } else {
            for (Settler settler : flat.getSettlerList()) {
              System.out.println("-- Житель: " + settler.getName());
            }
          }
        } else {
          System.out.println("--Никто не живет");
        }
      }
    }
  }

  @Override
  public void addHouse(IHouse house) {
    houseList.add(house);
  }
}
