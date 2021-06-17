package Arrays;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() >= 2) {
                System.out.println(s[i]);
            }
        }
        Sorting(s);

    }

    public static void Sorting(String[] a) {
        int count = 0;
        boolean flag = true;
        String s1 = "";
        System.out.println();
        for (int i = a.length-1; i >=0; i--) {
            for (int j =0; j < i; j++) {
                if (a[j + 1].length() < a[j].length()) {
                    s1 = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = s1;
                }

            }

        }
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }


    }
}
