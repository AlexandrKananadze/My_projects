package Set;

import java.util.HashSet;



public class Traun {
    static String twoStrings(String s1, String s2) {
        HashSet<Character> set1= new HashSet();
        HashSet<Character> set2= new HashSet();
        for (int i=0; i<s1.length(); i++) {
            set1.add(s1.charAt(i));
        }
        for (int j=0; j<s2.length(); j++) {
            set2.add(s1.charAt(j));
        }
        set1.retainAll(set2);
        if (set1.isEmpty()) {
            return "NO";
        }
        else {
            return "YES";
        }
    }

    public static void main(String[] args) {
        String s1= "ASDFSAGH ASdfafaf";
        String s2= "AAGH ASdfafaf";
        System.out.println(twoStrings(s1,s2));

        }
    }

