package ru.qamilord.oopShop.interfaces;

import ru.qamilord.oopShop.Customer;

public interface ISeller {

  String getName();

  void salesProcessing(IShop shop, int preferredQuantity, Customer customer);
}
