package ru.qamilord.oopShop.interfaces;

import ru.qamilord.oopShop.Customer;
import ru.qamilord.oopShop.Product;
import ru.qamilord.oopShop.Shop;

public interface ISeller {

  String getName();

  void sale(Shop shop, Product product, Customer customer, int index);
}
