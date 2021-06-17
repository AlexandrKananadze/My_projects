package OOP.BankAccounts;

public class OperationWithAccounts {
    public static void main(String[] args) {
        CurrentAccount first=new CurrentAccount(1000);
        first.add(500);
        first.takeoff(50);
        first.ostatok();
DepositeAccount dep=new DepositeAccount(first.getSchet(), 50);
    dep.takeoff(30);
    dep.ostatok();
CashbackAccount cash=new CashbackAccount(first.getSchet());
    cash.takeoff(5);
    cash.takeoff(5);
    cash.takeoff(1000);
    cash.ostatok();
CardAccount card= new CardAccount(1000);
    card.takeoff(400);
    card.ostatok();
    }
}
