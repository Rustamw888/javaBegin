package ru.qamilord.oopTransport.motorbike;

import ru.qamilord.oopTransport.Transport;

public class Motorbike extends Transport {

  private Double volume;

  public Motorbike() {
  }

  public Motorbike(String name, String model, String color, Double volume) {
    super(name, model, color);
    this.volume = volume;
  }

  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }
}
