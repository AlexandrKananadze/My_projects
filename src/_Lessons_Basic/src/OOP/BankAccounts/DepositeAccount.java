package OOP.BankAccounts;

public class DepositeAccount extends CurrentAccount {
    int srokdeposite;

    DepositeAccount(int schet, int srokdeposite) {
        super(schet);
        this.srokdeposite=srokdeposite;
    }

    @Override
    public void takeoff(int sum) { // снятие не ранее 30 дней депозита
        if(srokdeposite<30) {return;}
        if(sum<0){return;}
        if (sum>super.getSchet()){return;}
        super.setSchet(super.getSchet()-sum);

    }
}

