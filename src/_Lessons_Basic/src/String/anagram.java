package String;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a= console.nextLine();
        String b = console.nextLine();
  //     System.out.println( Arrays.equals(sorting(a),sorting(b)));
        udalenia(a,b);


    }
    public static char[] sorting (String a){
        char[] a1 = a.toCharArray();
        char temp=0;
        for (int i=a.length()-1; i>=0; i--) {
            for (int j =0; j<i; j++) {
                if (a1[j] > a1[j+1]) {
                    temp= a1[j];
                    a1[j] = a1[j+1];
                    a1[j+1]= temp;
                }
            }
        }
        return a1;
    }
    public static void udalenia (String a, String b){
        int [] a3 = new int[26];
        int [] b3 = new int [26];
        int temp=0;
        for (int i = 0; i< a.length(); i++){
           temp =(int)a.charAt(i) - 97;
           a3[temp]++;
        }
        for (int i = 0; i< a.length(); i++){
            temp =(int)b.charAt(i) - 97;
            b3[temp]++;
        }
        int count1 = 0;
        int sum=0;
        for (int i=0; i<a3.length; i++){
            count1=Math.abs(a3[i] - b3[i]);
               sum=count1+sum;
           }

        System.out.println();
        System.out.println( "Число элементов на удаление" + sum);
}
    }

