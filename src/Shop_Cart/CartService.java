package Shop_Cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CartService {

static List<Entry> as = new ArrayList<>();

     public  static String codeGenerator () { // генератор кода Product
     return  (int)(Math.random()*10000) +  "";
    }

    public  static List<String> prodGenerator () { // категории продуктов
    List<String> d = List.of("Potato", "Milk", "Bread", "Meat", "Goods", "Gums", "Cleaning", "MilkProducts");
    return List.of((d.get((int) (Math.random() * 6))), (d.get((int) (Math.random() * 6))));
    }

    public static Product getProduct () {   // создание Product
    return new Product(codeGenerator(), nameGenerator(), priceGenerator(),prodGenerator());
    }

   public static String nameGenerator() {
   List<String> f = List.of("Nestle", "Miratorg", "Jonson", "MMK", "Proct");  // производители продукта
   return f.get((int)(Math.random() * f.size()));
    }

    public static double priceGenerator () {
     return Math.random() * 1000;
    } // генератор цены продукта

    public static  void GetCartEntrys (int a) {
      for (int i = 0; i < a; i++ ) {
      Entry g = new Entry(i,getProduct(), (int)(Math.random() * 15 - 5) );
      as.add(g);
      }
    }
}
