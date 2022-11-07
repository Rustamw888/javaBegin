package ru.qamilord.oopShop.interfaces;

import java.util.List;
import ru.qamilord.oopShop.Product;

public interface IShop {

  ISeller getSeller();
  List<Product> getProduct();
  int getCashBox();
}
