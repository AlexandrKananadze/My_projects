package Set;

import java.util.*;


public class EMAILS_TREE {
    public static TreeSet mails = new TreeSet<>();


    public static boolean check(String str) {
        String corect = "[A-D]{3}+[ ]+[a-zA-Z1-9]{3,20}+@+[a-z]{3,10}+.+[a-z]{2,3}";

        return str.matches(corect);
    }
    public static boolean list(String str) {
        String list = "LIST";
        return str.matches(list);
    }
    public static void inbase (String str) {
        String[] d=str.split(" ");
        String temp1 = d[1];
        mails.add(temp1);
    }

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
       while (console.hasNext()) {
           String mailtemp = console.nextLine();
           if (check(mailtemp)) {
               System.out.println("верный мэйл");
               inbase(mailtemp);
           }
           if (list(mailtemp)){
               Iterator<String> iterator = mails.iterator();
               while (iterator.hasNext()) {
                   System.out.println(iterator.next());
               }

           }
           if (!check(mailtemp) && !list(mailtemp)) {
               System.out.println("Ошибка мейл");
           }
      //    if (mailtemp =="stop") { // сравнение не работает???
      //        console.close();
      //    }


       }


    }
}
