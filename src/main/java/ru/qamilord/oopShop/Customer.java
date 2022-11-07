package ru.qamilord.oopShop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

  private String name;
  private int wallet;

  public Customer(String name) {
    this.name = name;
  }
}
