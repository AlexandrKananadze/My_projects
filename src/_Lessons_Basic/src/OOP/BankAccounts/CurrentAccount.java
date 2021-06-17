package OOP.BankAccounts;

public class CurrentAccount {
   private int schet ;

   public int getSchet() {
      return schet;
   }

   public void setSchet(int schet) {
      this.schet = schet;
   }



   CurrentAccount(int schet){
      this.schet=schet;

   };
   public void takeoff(int sum){
      if (sum<0){return;}
      if (sum>schet){return;}
      schet=schet-sum;
   }
   public void ostatok(){
      System.out.println(schet);
   }
   public void add(int sum){
      if(sum<0){return;}
      schet=schet+sum;
   }

}
