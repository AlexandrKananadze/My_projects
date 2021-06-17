package String;

import java.util.Locale;
import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        char[] d= s.toCharArray();
     //   d[0] = Character.toUpperCase(d[0]);
     //   for (int i =0; i<d.length; i++) {
     //       if (d[i] == ' ') {
     //           d[i+1] = Character.toUpperCase(d[i+1]);
     //       }
     //       System.out.print(d[i]);
     //   }
        System.out.println(polindrom(s));

    }
    public static  boolean polindrom (String f) {
        char[] d= f.toCharArray();
        boolean flag=true;
        for (int i =0; i<d.length/2; i++) {
            if (d[i] == d[d.length-1-i]) {
             //   System.out.println("Не полиндром");
                flag=true;

            }
            else return false;
        }
        return flag;


    }
}
