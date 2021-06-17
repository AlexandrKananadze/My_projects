package String;

import java.util.*;

public class SortStringminmax {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] s= str.split(" ");
        String res="";
        for (int i=0; i<s.length-1; i++) {
            if(s[i].length()<s[i+1].length()) {
                res = s[i];
                s[i]=s[i+1];
                s[i+1]=res;

            }
            System.out.println(s[i]);
        }

    }
}

