package String;

import java.util.Scanner;

public class String010320 {
    public static void main(String[] args) {
 //      int a = 5;
 //      String b = String.valueOf(a);
 //      int c = Integer.parse,Int(b);
 //      String d = c+"";
 //      System.out.println(c+" ");
        Scanner console = new Scanner(System.in);
        String h= console.nextLine();

   //   search(h);
    //  bolshe(h);
        up(h);

    }
    public static void  search (String h){
        String [] k = h.split(" ");
        String min = k[0];
        String max = "";
        for (int i=0; i<k.length; i++){
            if (k[i].length() < min.length()) {
                min = k[i];
            }
            if (k[i].length()>max.length() ) {
                max=k[i];
            }
        }
        System.out.println(min); // длина слова в предложении
        System.out.println(max); // длина слова в предложении

    }
    public static void  bolshe (String h){
        String j[] = h.split(" ");
        String sred="";
        int count = 0;
        for (int i = 0; i<j.length; i++){
            count = j[i].length()+count;
        }
        int res= count/j.length;
        for(int i=0; i<j.length; i++){
            if(j[i].length()>res) {
                sred = j[i];
                System.out.println(sred); // слова длинее среднего
            }
        }
    }
    public static void  up (String h)  {
        String [] k = h.split(" ");
        char [] g;

        for (int i=0; i<k.length; i++) {

           if ( bukv(k[i]) && k[i].length()>3) {
               System.out.println(k[i]); // слова с неповторяющимися буквами
           }
        }

        }
        public static boolean bukv (String a){ // перебор букв в слове на повторяемость
        char[] l = a.toCharArray();

        for (int i =0; i<l.length; i++) {
            int count =0;
            for (int j=0; j<l.length; j++) {
                if (l[i] == l[j]) {
                    count++;
                }

            }
            if (count > 1) {
                return false;
            }


    }
            return true;
    }
    }



