package by.epam.inner.Models;

import by.epam.inner.Exeption.NegativeArgumentException;
import by.epam.inner.Exeption.OutOfRangeExeption;

public class Purchase {

    private final Product product;
    private final int unitsNumber;

    public Purchase(Product product, int unitsNumber) {
        this.product = product;
        this.unitsNumber = unitsNumber;
    }

    public int getValidationUnitsMNumber(int unitsNumber) {
        if (unitsNumber < 0) {
            throw new NegativeArgumentException(unitsNumber);
        }
        return unitsNumber;
    }

    public int getCost(int unitsNumber, Product product) {
        long total = (long) unitsNumber * product.getPrice().getValue();
        if (total > Integer.MAX_VALUE) {
            throw new OutOfRangeExeption(total, "Total price too much");
        }
        return (int) total;
    }

}
