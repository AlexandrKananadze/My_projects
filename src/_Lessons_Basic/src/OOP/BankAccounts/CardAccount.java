package OOP.BankAccounts;

public class CardAccount extends CurrentAccount {

    CardAccount(int schet) {
        super(schet);
    }
    @Override
    public void takeoff(int sum) {//комиссия при снятии
        if(sum<0){return;}
        if (sum>super.getSchet()){return;}
        double comission=sum*0.01;
        super.setSchet((int)(super.getSchet()-sum-comission));

    }
}
