package ru.qamilord.oopCity;

public class MainCity {

  public static void main(String[] args) {

    Settler settler1 = new Settler("settler1");
    Settler settler2 = new Settler("settler2");
    Settler settler3 = new Settler("settler3");
    Settler settler4 = new Settler("settler4");
    Settler settler5 = new Settler("settler5");
    Settler settler6 = new Settler("settler6");
    Settler settler7 = new Settler("settler7");
    Settler settler8 = new Settler("settler8");
    Settler settler9 = new Settler("settler9");
    Settler settler10 = new Settler("settler10");
    Settler settler11 = new Settler("settler11");
    Settler settler12 = new Settler("settler12");
    Settler settler13 = new Settler("settler13");
    Settler settler14 = new Settler("settler14");
    Settler settler15 = new Settler("settler15");

    IFlat flat1 = new Flat(1);
    flat1.addSettler(settler1);
    flat1.addSettler(settler2);
    Flat flat2 = new Flat(2);
    flat2.addSettler(settler3);
    flat2.addSettler(settler4);
    Flat flat3 = new Flat(3);
    flat3.addSettler(settler5);
    Flat flat4 = new Flat(4);
    flat4.addSettler(settler6);
    flat4.addSettler(settler7);
    Flat flat5 = new Flat(5);
    flat5.addSettler(settler8);
    flat5.addSettler(settler9);
    Flat flat6 = new Flat(6);
    flat6.addSettler(settler10);
    Flat flat7 = new Flat(7);
    flat7.addSettler(settler11);
    flat7.addSettler(settler12);
    Flat flat8 = new Flat(8);
    flat8.addSettler(settler13);
    flat8.addSettler(settler14);
    flat8.addSettler(settler15);
    Flat flat9 = new Flat(9);
//    flat9.addSettler(settler15);
    Flat flat10 = new Flat(10);

    House house1 = new House("ул. Иванова, д.5");
    house1.addFlat(flat1);
    house1.addFlat(flat2);
    House house2 = new House("ул. Петрова, д.28");
    house2.addFlat(flat3);
    house2.addFlat(flat4);
    House house3 = new House("ул. Павлова, д.17");
    house3.addFlat(flat5);
    house3.addFlat(flat6);
    House house4 = new House("ул. Лапочкина, д.2");
    house4.addFlat(flat7);
    house4.addFlat(flat8);
    House house5 = new House("ул. Королева, д.153");
    house5.addFlat(flat9);
    house5.addFlat(flat10);

    City city = new City();
    city.setCityName("Казань");
    city.addHouse(house1);
    city.addHouse(house2);
    city.addHouse(house3);
    city.addHouse(house4);
    city.addHouse(house5);

    city.showSettledList();

  }
}
