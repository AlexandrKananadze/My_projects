package OOP.Bank;

public class Runner {
    public static void main(String[] args) {
        Fiz f=new Fiz(100);
      //  f.snyat(-4);
       // f.snyat( 1000);
        Urliza u= new Urliza(1000);
        u.pologit(100000);

        System.out.println(u.getSum());
        u.pologit(30000);
        System.out.println(u.getSum());
    }
}
