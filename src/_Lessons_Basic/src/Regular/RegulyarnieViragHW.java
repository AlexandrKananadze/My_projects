package Regular;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RegulyarnieViragHW {

    public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
   //    System.out.println("Введите телефон в Беларуси");
   //    String tel = console.nextLine();


     System.out.println("Ведите фамилию");
     String str = console.nextLine();
     char[] st = str.toCharArray();
     String s = "[A-z]{3,20}+[-]+[A-Z]{3,20}";
     if(str.matches(s)) {
         System.out.println("Двойная фамилия");
     }
     else System.out.println("Не двойная фамилия");
    // telefon(tel);
     //   kard();
    }
   //public static void telefon(String t){
   //    String s="[+]+[375]+[-]+[29,44]+[-]+[0-9]{2,3}+[-]+[0-9]{2}+[-]+[0-9]{2}";
   //    if (t.matches(s)){
   //        System.out.println("Беларусский телефон"+t);
   //    }
   //    else System.out.println("wrong number");
   //}
   //public static void kard(){
   //    Scanner console = new Scanner(System.in);
   //    System.out.println("Введите номер карты");
   //    String card= console.nextLine();
   //    String s="[0-9]{4}+[ ]+[0-9]{4}+[ ]+[0-9]{4}+[ ]+[0-9]{4}";
   //    if (card.matches(s)) {
   //        System.out.println("Номер карты введен правильно");}
   //    else {System.out.println("ошибка ввода номера карты");
   //    return;}
   //       System.out.println("Введите дату окончания");
   //   String date = console.nextLine();
   //   String d ="[0-1]{1}+[0-9]{1}+[.,/]{1}+[2]{1}+[1-5]{1}";
   //   if(date.matches(d)){
   //       System.out.println("Верная дата окончиня срока дейстия");
   //   }
   //   else {
   //          System.out.println("Mistake in date");
   //    return;}

   //    System.out.println("CVC");
   //    String c= console.nextLine();
   //    String cvc = "[0-9]{3}";
   //    if (c.matches(cvc)) {
   //        System.out.println("correct cvc");
   //    }
   //    else {
   //        System.out.println("Wrong CVC");
   //        return;
   //    }

   //}
}
