package Set;

import java.lang.reflect.Array;
import java.util.*;

public class Temp1203 {
    public static void main(String[] args) {
 //     Set<String> ar = new TreeSet<>(); // Hashset<>()
 //    ar.add("Belarus");
 //    ar.add("RF");
 //    ar.add("France");
 //    ar.add("RF"); // дублирующий
 //    ar.add("Japane");
 //    ar.add("USA");
 //    int[] a =  {1,2,3,10,15};
  //
  //        System.out.print(ar);
  //
   //     System.out.println();
   //    for(int i:a){
   //        System.out.print(i);
  ///    }
  //    Iterator<String> it = ar.iterator();
  //   while (it.hasNext()){
  //       System.out.print(it.next()+" ");
  //   }
  //    System.out.println();
  //   for(String i:ar) {
  //       System.out.print(i);
    //   }
        Scanner console = new Scanner(System.in);
        String str = console.next();

        String[] ar = str.split(" ");
        bukv(ar);

    }
    public static void bukv (String[] aa){

        for (int i=0; i<aa.length; i++) {
          char[] bu = aa[i].toCharArray();
          if(unik(bu)){
           System.out.println(aa[i]);
          }
        }
    }
    public static boolean unik( char[] temp){
        Set<Character> a = new HashSet<>();
        for (int i=0; i< temp.length; i++){
            if(!(a.add(temp[i]))) {
                return false;
            }
        }
        return true;
    }

}
