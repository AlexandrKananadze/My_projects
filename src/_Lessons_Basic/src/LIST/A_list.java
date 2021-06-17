package LIST;

import jdk.jshell.SourceCodeAnalysis;

import java.util.ArrayList;

public class A_list {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("РФ");
        ar.add ("Гeрмания");
        ar.add( "США");
        ar.add( "Англия");
        ar.add  ("Беларусь");
        ar.add(0,"France");
        for (int i=0; i<ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        ar.remove(1);
        ar.set(1, "Detroit");
        System.out.println( );
        for (int i=0; i<ar.size(); i++) {
            System.out.println(ar.get(i));
        }

    }
}
