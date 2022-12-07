package ru.qamilord.oopShop;

import java.util.List;
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
  private List<Product> customerProductList;

}
