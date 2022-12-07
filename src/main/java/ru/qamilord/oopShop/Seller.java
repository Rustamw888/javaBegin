package ru.qamilord.oopShop;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.qamilord.oopShop.interfaces.ISeller;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seller implements ISeller {

  private String name;

  // у покупателя добавляется товары
  // у магазина отменяется
  // нельзя купить товар, который закончился

  @Override
  public void sale(Shop shop, Product product, Customer customer, int index) {

    if (product.getName().isEmpty()) {
      System.out.println("Товар закончился");
      return;
    }
    int total = customer.getWallet() - product.getPrice();
    if (total < 0) {
      System.out.println("Не может купить");
      return;
    }
    customer.setWallet(total);
    System.out.println(customer.getWallet());

    customer.setCustomerProductList(List.of(product));
    shop.getProductList().remove(index);

    System.out.println("Это новый продуктовый список покупателя: " + customer.getCustomerProductList().size());
    System.out.println("Это новый продуктовый список в магазине: " + shop.getProductList().size());
  }

}
