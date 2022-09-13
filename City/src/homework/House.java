package homework;

import java.util.ArrayList;

public class House implements IHouse{

  private String address;

  private ArrayList<IFlat> flatList = new ArrayList<>();

  public House() {
  }

  public House(String address) {
    this.address = address;
  }

  public House(String address, ArrayList<IFlat> flatList) {
    this.address = address;
    this.flatList = flatList;
  }

  @Override
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public ArrayList<IFlat> getFlatList() {
    return flatList;
  }

  public void setFlatList(ArrayList<IFlat> flatList) {
    this.flatList = flatList;
  }

  @Override
  public void addFlat(IFlat flat) {
    flatList.add(flat);
  }
}
