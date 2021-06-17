package Arrays;

import java.util.Scanner;

public class Array21 {
    public static void main(String[] args) {
        Scanner console = new Scanner((System.in));
        int a = console.nextInt();
        int b = console.nextInt();
       int[][] ab =  Arrayfull(a,b);
        System.out.println();
        //sum(ab);
       // sum12(ab);
        prav(ab);

    }
    public static int[][] Arrayfull (int a, int b){
        int[][] array = new int[a][b];
        for (int i =0; i<a; i++){
            for (int j=0; j<b; j++){
                array[i][j] = (int)(Math.random()*100) - 50;
                System.out.printf("%5d",array [i][j]);
            }
            System.out.println();
        }
        return  array;
    }
    public static void  sum ( int[][] ar) {
        int max = Integer.MIN_VALUE;
                int maxr = 0;
        int maxc = 0;
        for (int i =0; i<ar.length; i++) {
            for (int j = 0; j <ar.length; j++) {
                if (ar[i][j] > max) {
                    max = ar[i][j];
                    maxc = i;
                    maxr = j;
                }
            }
        }
            for (int i =0; i< ar.length; i++){
                if (i!=maxc) {
                    for (int j = 0; j < ar.length; j++) {
                        if ( j != maxr) {
                            System.out.printf("%5d", ar[i][j]);
                        }
                    }
                    System.out.println();
                }

            }



            }

            public static void sum12(int[][] bb) {
        int plus1= 0;
        int plus2 = 0;
        for (int i=0; i< bb.length; i++) {
            int sum=0;
            for(int j =0; j< bb.length; j++) {
                if (bb[i][j]>0) {
                    plus1 = bb[i][j];
                    for (int k=j+1; k<bb.length;k++){
                        if (bb[i][k] >0) {
                            plus2=k;
                        }
                       while (j< k ){
                           sum = bb[i][j]+sum;
                        }

                    }
                }

            }
            System.out.println(sum);
        }

            }

            public static void prav(int[][] bc ) {

               for (int i=0; i<bc.length; i++){
                   int sum=0;
                   int countplus= 0;
                   for (int j = 0; j<bc.length; j++) {
                       if(bc[i][j] >0) {
                           countplus++;

                       }
                       if(countplus==1 && bc[i][j]<0) {
                           sum = bc[i][j]+sum;
                           }
                   }
                   if(countplus==1) {
                       sum=0;
                   }
                   System.out.println( "Summa"+ sum);
               }


            }

        }





