package homework;

import java.util.ArrayList;

public class Flat implements IFlat{

  private int number;

  private ArrayList<Settler> settlerList = new ArrayList<>();

  public Flat() {
  }

  public Flat(int number) {
    this.number = number;
  }

  public Flat(int number, ArrayList<Settler> settlerList) {
    this.number = number;
    this.settlerList = settlerList;
  }

  @Override
  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Override
  public ArrayList<Settler> getSettlerList() {
    return settlerList;
  }

  public void setSettlerList(ArrayList<Settler> settlerList) {
    this.settlerList = settlerList;
  }

  @Override
  public void addSettler(Settler settler) {
    settlerList.add(settler);
  }
}
