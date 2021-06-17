package Maps;

import java.util.*;
import java.util.Map.Entry;


public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap();
        mp.put(1, "ASD");
        mp.put(2, "as");
        mp.put(3, "ER");


        Set<Entry<Integer, String>> mpset = mp.entrySet();
        for (Entry<Integer, String> a : mpset) {
            System.out.println(a.getKey() +" "+a.getValue());
        }

        Map<Integer, Integer> mp1= new HashMap();
        for (int i=0; i<5; i++){
            mp1.put(i,(int)(Math.random()*10));
        }

        for (Entry<Integer,Integer> a: mp1.entrySet()) {

            System.out.println(a.getKey()+" "+ a.getValue());
        }

        List<Entry<Integer,Integer>> as = new ArrayList<>(mp1.entrySet());

       for (int i= as.size()-1; i>=0; i--) {
           for (int j=0; j < i;j++){
             if (as.get(i).getValue() > as.get(j).getValue()) {
                 Entry<Integer,Integer> temp = as.get(i);
                 Entry<Integer,Integer> temp1 = as.get(j);
                 as.set(i,temp1);
                 as.set (j, temp);

             }

            }
        }
        System.out.println( as);


    }
}






