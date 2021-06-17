package Arrays;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int[][] array = new int [a][b];
   for (int i=0; i < a; i++) {
       System.out.println(" ");
    for (int j=0; j< b; j++) {
        array [i][j] = (int)(Math.random()*100);
        System.out.printf("%5d",array[i][j]);
    }
   }
   int num = Integer.MIN_VALUE;
   int min = Integer.MAX_VALUE;
        //or (int i=0; i < a; i++) {
        //   //System.out.println(" ");
        //   for (int j=0; j< b; j++) {
        //   // if (array[i][j]%2==0) {
        //    //    System.out.println(array[i][j]);
        //      //  if (i==j) {
        //       //     System.out.println(array[i][j]);

        //       if (i<j && array[i][j]>num) {
        //           num = array[i][j];
        //       }

        //       if (i > j && array[i][j] < min) {
        //           min = array[i][j];
        //       }
        //   }

        // }
       // System.out.println( "Макс"+ num);
      //  System.out.println("Мин"+ min);
        System.out.println();
        // побочная диагональ
        //or (int i =0; i< a; i++) {
        //   for (int j=0; j < b; j++){
        //       if (i==array.length - 1-j) {
        //           System.out.println(array[i][j]);
        //       }

        //   }
        //
        //Поменять местами столбцы1 ый с полседним 2 с предпоследним

        for (int i=0; i < a/2; i++) {
            for (int j=0; j< b; j++) {
                int num1 = array[i][j];
               array[i][j] = array [array.length-i-1][j];
               array [array.length-i-1][j] = num1;

            }
        }
        System.out.println();
        for (int i=0; i < a; i++) {
            System.out.println(" ");
            for (int j=0; j< b; j++) {
                System.out.printf( "%5d" , array[i][j]);

            }}

        for (int i=0; i < a; i++) {
            for (int j=0; j< b/2; j++) {
                int num1 = array[i][j];
                array[i][j] = array [i][array.length-1-j];
                array [i][array.length-1-j] = num1;

            }
        }
        System.out.println();
        for (int i=0; i < a; i++) {
            System.out.println(" ");
            for (int j=0; j< b; j++) {
                System.out.printf( "%5d" , array[i][j]);

            }}

    }

}
