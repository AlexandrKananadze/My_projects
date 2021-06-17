package OOP.Bank;

public class NonPositiveArgumentExeption extends IllegalArgumentException {
    public NonPositiveArgumentExeption(int sum) {
        System.out.println("Negativ argument" + sum);
    }

}
