package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maparray {

    public static void arra (){
        int [] ar1= new int[10];
        int [] ar2= new int[10];
        int [] ar3= new int[10];
        int [] ar4= new int[10];
        int [] ar5= new int[10];

        for (int i=0; i<10; i++ ) {
            ar1[i]= (int)(Math.random()*10);
            ar2[i]= (int)(Math.random()*10);
            ar3[i]= (int)(Math.random()*10);
            ar4[i]= (int)(Math.random()*10);
            ar5[i]= (int)(Math.random()*10);
        }

        int a1=0;
        int a2=0;
        int a3=0;
        int a4=0;
        int a5=0;
        for (int j=0; j<10; j++ ) {
           a1= ar1[j]+a1;
            a2= ar2[j]+a2;
            a3= ar3[j]+a3;
            a4= ar4[j]+a4;
            a5= ar5[j]+a5;
        }
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(1,a1);
        mp.put(2,a2);
        mp.put(3,a3);
        mp.put(4,a4);
        mp.put(5,a5);
        List <Map.Entry<Integer,Integer>> li= new ArrayList<>(mp.entrySet());
        for (int i=4; i>=0; i--){
         for (int j=0; j<i; j++){
           if(li.get(i).getValue()<li.get(j).getValue()){
               Map.Entry<Integer,Integer> temp1 = li.get(i);
               Map.Entry<Integer,Integer> temp2 = li.get(j);
               li.set(j,temp1);
               li.set(i,temp2);
           }
           }
        }
        for (int i =0; i<li.size(); i++){
        System.out.println(li.get(i).getKey()+" "+li.get(i).getValue());
        }
    }
    public static void main(String[] args) {
        arra();
    }
}
