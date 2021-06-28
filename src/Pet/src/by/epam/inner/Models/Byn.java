package by.epam.inner.Models;

import by.epam.inner.Exeption.NegativeArgumentException;
import by.epam.inner.Exeption.NonPositiveArgumentExeption;
import by.epam.inner.Exeption.OutOfRangeExeption;
import by.epam.inner.Exeption.PatternArgumentExeption;

public class Byn {

    private int value;

    public Byn() { }

    public Byn(int value) {
        if (value < 0) {
            throw new NegativeArgumentException(value);
        }
        this.value = value;
    }

    public Byn(Byn byn) {
        this(byn.value);
    }

    public Byn(int rubs, int coins) {
        this(getValidByn(rubs, coins));

    }

    public Byn(String strByn) {
        this(getValidValue(strByn));
    }

    public static int getValidByn(int rubs, int coins) {
        if (rubs < 0) {
            throw new NonPositiveArgumentExeption(rubs, "rubs");
        }
        if (coins < 0) {
            throw new NonPositiveArgumentExeption(coins, "coins");
        }
        if (coins >= 100) {
            throw new OutOfRangeExeption(coins, "coins");
        }

       long value = rubs * 100L + coins;
        if (value > (long) (Integer.MAX_VALUE)) {
            throw new OutOfRangeExeption(value, "Общее количество byn");
        }
        return (int) (value);
    }

    public  static int getValidValue(String strByn) { // #4

       boolean proverka = strByn.matches("\\d+\\.\\d\\d");
          if  (!proverka) {
              throw new PatternArgumentExeption(strByn);
          }
       String[] temp = strByn.split("\\.");
       int rub = Integer.parseInt(temp[0]);
       int coin = Integer.parseInt(temp[1]);
      return  getValidByn(rub, coin);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Byn{" + "value=" + value + '}';
    }
}
