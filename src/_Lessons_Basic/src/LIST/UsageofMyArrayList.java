package LIST;

import LIST.MyArrayList;

public class UsageofMyArrayList {
    public static void main(String[] args) {
        MyArrayList ar = new MyArrayList();
        for(int i=0;i<9; i++) {
            ar.add((int)(Math.random()*10));

        }
        for (int i=0; i< ar.size(); i++) {
            System.out.print(ar.get(i)+" ");
        }
     //   System.out.println(ar.contains(1));
      //  ar.delete(3);
      //  for(int i=0; i<ar.size; i++) {
      //      System.out.print(ar.get(i)+" ");
      //  }
        System.out.println();
        System.out.println(" размер до"+ar.size());
        ar.remove(2);
        System.out.println("размер после удаления"+ar.size());

        System.out.println();
        for(int i=0; i<ar.size();i++){
            System.out.print(ar.get(i) +" ");
        }
        System.out.println();
        System.out.println("indexof"+" "+ ar.indexOf(3));
        System.out.println("last indexof"+" "+ ar.lastIndexOf(0));
        int[] aa=  ar.subList(3,7);
        for (int i=0; i<aa.length; i++) {
            System.out.print(aa[i]);
        }
      //  System.out.println(ar.size1());
       // ArrayList jv = new ArrayList();
       //  jv.isEmpty();
        System.out.println();
      //  ar.clear();
      //  System.out.println(ar.size);
        System.out.println("Skleika");
        ar.add(3);
        ar.add(5);
        ar.add(7);
        for(int i=0; i<ar.size(); i++){
            System.out.print(ar.get(i));
        }
        for (int i=0; i<1000; i++){
            ar.add(1);
        }
        ar.clear();

    }
}
