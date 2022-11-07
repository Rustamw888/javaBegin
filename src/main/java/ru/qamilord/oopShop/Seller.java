package ru.qamilord.oopShop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.qamilord.oopShop.interfaces.ISeller;
import ru.qamilord.oopShop.interfaces.IShop;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seller implements ISeller {

  private String name;

  @Override
  public void salesProcessing(IShop shop, int preferredQuantity, Customer customer) {
    int productCount = shop.getProduct().size();
    int remainingProduct = productCount - preferredQuantity;
    int customersMoney = customer.getWallet();
    int shopMoney = shop.getCashBox();
    if (productCount == 0) {
      System.out.println("Товара нет в наличии!");
    } else if (productCount >= 0) {
      for (Product product : shop.getProduct()) {
        customersMoney = customersMoney - product.getPrice();
        shopMoney = shopMoney + product.getPrice();
        System.out.println(String.format("Товар продан в количестве %d штук", preferredQuantity));
        System.out.println(String.format("Осталось товара: %d", -remainingProduct));
      }
    } else {
      for (Product product : shop.getProduct()) {
        System.out.println(
            String.format("Количества товара [%s] не достаточно, для покупки в полном объёме "
                + "необходимо оформить заявку со склада ещё на [%d] штук!", product, -productCount));
      }
    }
  }

}
