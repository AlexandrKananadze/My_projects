package Shop_Cart;

import java.util.Objects;

public class Entry {
    private int id;
    Product product;
    int quantity; // количество

 public Entry (int id, Product product, int quantity) {
     this.id = id;
     this.product = product;
     this. quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuality() {
        return quantity;
    }

    public void setQuality(int quality) {
        this.quantity = quality;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", product=" + product +
                ", quality=" + quantity +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return id == entry.id && quantity == entry.quantity && product.equals(entry.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, quantity);
    }
}
