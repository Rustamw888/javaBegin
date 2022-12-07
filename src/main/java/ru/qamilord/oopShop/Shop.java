package ru.qamilord.oopShop;

import java.util.List;
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
public class Shop implements IShop {

  private ISeller seller;
  private List<Product> productList;
  private int cashBox;
}
