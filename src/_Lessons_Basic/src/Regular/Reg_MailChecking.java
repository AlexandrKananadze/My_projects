package Regular;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Reg_MailChecking {
    public static void main(String[] args) {
        int count = 0;
        int count1=0;
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        char[] d = s.toCharArray();
        String f= "[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]+";
  if (s.matches(f)) {
      System.out.println("Работает");
   }
} }
