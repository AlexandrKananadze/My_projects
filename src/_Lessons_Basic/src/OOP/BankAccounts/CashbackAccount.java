package OOP.BankAccounts;

public class CashbackAccount extends CurrentAccount {
    private int count;

    CashbackAccount(int schet) {
        super(schet);
    }

    @Override
    public void takeoff(int sum) {// каждая третья операция кэшбэк
        if (sum < 0) {
            return;
        }
        if (sum > super.getSchet()) {
            return;
        }
        super.setSchet(super.getSchet() - sum);
        count++;
        if (count % 3 == 0) {
            super.setSchet((getSchet() + (int) (sum * 0.03)));


        }
    }
}
