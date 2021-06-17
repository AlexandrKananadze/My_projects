package Shop_Cart;

import Shop_Cart.CartService;
import Shop_Cart.Entry;
import Shop_Cart.Product;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        CartService.GetCartEntrys(10);
        List<Entry> rr =  CartService.as;

 //   List<Product> tt = rr.stream().map(Entry::getProduct).collect(Collectors.toList());
 //   double g = tt.stream().mapToDouble(Product::getPrice).sum();
 //     NumberFormat formatter = new DecimalFormat("#0.00");
 //     //System.out.println(formatter.format(g));

 //    Boolean ee =  rr.stream().anyMatch(x->x.getProduct().getPrice()*x.getQuality()>10000);

 //    List<Entry> hh = rr.stream().filter(x->x.getQuality()>3).collect(Collectors.toList());

 //  int max = rr.stream().mapToInt(x-> (int) x.getProduct().getPrice()).max().orElse(0);
 //     System.out.println(formatter.format(max));

 //     //сортировать по возрастанию min to max

        List<Entry> xx = rr.stream()
                .sorted((x, y)-> (int) (x.getProduct().getPrice()-y.getProduct().getPrice()))
                .collect(Collectors.toList());
    //    System.out.println(xx);

        // сортировка по имени в обратном порядке
        List<Entry> xx1 = rr.stream()
                .sorted((x,y) -> y.getProduct().getName().compareTo(x.getProduct().getName()))
                .collect(Collectors.toList());
       // System.out.println(xx1);

        //имена продуктов в корзине
        List<String> xx2 = rr.stream()
                .map(x->x.getProduct().getName())
                .collect(Collectors.toList());
      //  System.out.println(xx2);

        // вывести все продукты одной категории Milk
        List<Entry> xx3 = rr.stream().filter(x->x.getProduct().getCategories().contains("Milk")).collect(Collectors.toList());
      //  System.out.println(xx3);

        // сделать коллекцию всех уникальных категорий в корзине
        Set<String> xx4 = rr.stream()
                .flatMap(x-> x.getProduct().getCategories().stream()) // обьединение коллекций в одну
                .collect(Collectors.toSet());                           // отрезание уникальных категорий
        System.out.println(xx4);
    }
}
