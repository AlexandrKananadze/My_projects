package by.epam.inner.Models;

import by.epam.inner.Exeption.OutOfRangeExeption;
import by.epam.inner.Exeption.PatternArgumentExeption;

import java.util.Objects;

public class Product {

    private final String name;
    private final Byn price;


    public Product(String name, Byn price) {
        this.name = name;
        this.price = price;
    }

    public String getValidName(String name) {
        boolean proverka = name.matches("\\^[a-zA-Z\\\\s]+");
        if (!proverka) {
            throw new PatternArgumentExeption(name);
        }
        return name;
    }
    public int getValidePrice(Byn value) {

        if (value.getValue() <= 0) {
           throw new OutOfRangeExeption(value.getValue(), "Byn");
        }
        return value.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return name.equals(product.name) && price.equals(product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String getName() {
        return name;
    }

    public Byn getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}


