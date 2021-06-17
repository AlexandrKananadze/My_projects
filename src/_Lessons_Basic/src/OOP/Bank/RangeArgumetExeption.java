package OOP.Bank;

public class RangeArgumetExeption extends IllegalArgumentException {
    public RangeArgumetExeption(int operationSum) {
        System.out.println("Summa snyatia bolshe ostatka"+ operationSum);
    }
}
