package homework;

import java.util.ArrayList;

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
          if (flat.getSettlerList().size() > 3) {
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
