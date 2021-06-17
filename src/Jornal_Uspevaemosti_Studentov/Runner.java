package Jornal_Uspevaemosti_Studentov;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
       Zapisi neo = new Zapisi();
       String choice;
       String contin = "Y";
       Scanner console = new Scanner(System.in);
       while  (contin.equalsIgnoreCase("Y")) {
           System.out.println( "1 Input zapis - 1");
           System.out.println( "2 Output zapis - 2");
           System.out.println( "3 Renew  zapis - 3");
           System.out.println( "4 Search Id - 4");
           System.out.println( "5 Delete Id - 5");
           System.out.println( "5 Choose group - 6");

           choice = console.nextLine();

           switch (choice) {
               case "1" -> neo.input();
               case "2" -> neo.output();
               case "3" -> neo.renewZapis();
               case "4" -> neo.findById();
               case "5" -> neo.delete();
               case "6" -> neo.studentList();
           }
           System.out.println(" Do you want to continue - Y/N");
           contin = console.nextLine();


       }
    }
}

