package ru.qamilord.oop.motorbike;

public class Ural extends Motorbike{

  private boolean firstAidKit;

  public Ural() {
  }

  public Ural(String name, String model, String color, Double volume, boolean firstAidKit) {
    super(name, model, color, volume);
    this.firstAidKit = firstAidKit;
  }


  public boolean isFirstAidKit() {
    return firstAidKit;
  }

  public void setFirstAidKit(boolean firstAidKit) {
    this.firstAidKit = firstAidKit;
  }

  public void showInfo() {
    System.out.println(getName());
    System.out.println(getVolume());
    System.out.println(firstAidKit);
  }

}
