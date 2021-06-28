package by.epam.inner.Models;

  public class Runner {
    public static void main(String[] args) {

        String price = "123.34";

        Byn first = new Byn();
        Byn second = new Byn(first);
        Byn third = new Byn(10, 89);
        Byn forth = new Byn(price);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(forth);

        Product one = new Product("Milk", third);
        System.out.println(one);
    }
  }
