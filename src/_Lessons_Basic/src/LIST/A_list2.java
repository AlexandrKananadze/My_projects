package LIST;

import java.util.ArrayList;
import java.util.LinkedList;

public class A_list2 {
    public static void main(String[] args) {
        ArrayList<Double> ar= new ArrayList<>();
        LinkedList <Double> dr = new LinkedList<>();
        int a = 1000000;
        long time = System.currentTimeMillis();
        for (int i=0; i<a; i++) {
            ar.add( Math.random());
        }
        System.out.println(System.currentTimeMillis() - time);
        long time1 = System.currentTimeMillis();
        for (int i=0; i<a; i++) {
            dr.add( Math.random());
        }
        System.out.println(System.currentTimeMillis() - time1);

        int b= 10000;
        long time2 = System.currentTimeMillis();
        for (int i=0; i<b; i++) {
            ar.get( (int)(Math.random()* ar.size()));
        }
        System.out.println(System.currentTimeMillis() - time2);
        long time3 = System.currentTimeMillis();
        for (int i=0; i<b; i++) {
            dr.get((int)(Math.random()* ar.size()));
        }
        System.out.println(System.currentTimeMillis() - time3);


    }
}
