package String;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
    //    char[] a = new char[10];
    //    for (int i=0; i<a.length;i++) {
    //        a[i] = (char) (Math.random()*65000);
    //    }
    //    String str = new String(a);
     //   System.out.println(str);
        Scanner console = new Scanner(System.in);
        String first = console.nextLine();
    //    String  second = console.nextLine();
   //    if (first.length()>second.length()) {
   //        System.out.println(first.length());
   //    }
   //    else System.out.println(second.length());
     //   System.out.println(first.charAt(3));
       char[] b = first.toCharArray();
        for (int i=b.length-1; i>=0; i--) {
            System.out.print(b[i]);
        }
     //   char d = 0;
    //  for (int i = 0; i<b.length/2; i++) {
    //      d = b[i];
    //      b[i]= b[b.length-i-1];
    //      b[b.length-i-1]= d;
    //  }
    //  for (int i=0; i<b.length; i++){
    //      System.out.print(b[i]);
    //  }
     //   if (first.matches("\\d+")){
     //       System.out.println("содержит цифры"+ first);
      //  }
     // System.out.println((int)'a');
     // System.out.println((char)500);
     int d=0;
     //or (int i=0; i<b.length; i++) {
     //  if ((int)b[i] >=48 && (int)b[i]<=57) {
     //       d=d+(b[i]-'0');
     //  }
     //
     //System.out.println(d);

    // String c = console.nextLine();
    // for (int i = 0; i<c.length(); i++) {
    //     if (Character.isDigit(c.charAt(i))) {
    //       //  d=d+((int)c.charAt(i)-48);
    //         d=d+Integer.parseInt(String.valueOf(c.charAt(i)));

    //     }

    // }
        System.out.println(d);
      String f = "55";
        System.out.println( Integer.parseInt(f)+4);
        System.out.println(f+5);

    }
}
