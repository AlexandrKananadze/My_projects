package OOP.Bank;

abstract  public class  Client {
    private int sum;

    Client(){};
    Client(int sum){
        this.sum=sum;
    }



    abstract public void snyat (int sum);

    abstract public void pologit(int  sum) ;
//    {         System.out.println("Pologit"+ sum);     }
    abstract public void obnulit(int sum) ;

 //   {   System.out.println("Snyat ostatok"+ sum);
 //   }




    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
