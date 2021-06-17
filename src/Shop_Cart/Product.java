package Shop_Cart;

import java.util.List;

public class Product {
    String code;
    String name;
    double price;
    List<String> categories;



    public Product (String code, String name, double price, List<String> categories) {
        this.code = code;
        this. name = name;
        this.price = price;
        this.categories = categories;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categories=" + categories +
                '\n';
    }
}
