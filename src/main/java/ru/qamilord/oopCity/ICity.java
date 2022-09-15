package ru.qamilord.oopCity;

import java.util.ArrayList;

public interface ICity {

  String getCityName();

  ArrayList<IHouse> getHouseList();

  void showSettledList();

  void addHouse(IHouse house);

}
