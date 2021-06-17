package OOP.Matrix;

import java.util.Scanner;

public class Matrix_main {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);

       Task1 a = new Task1(5,5);
          a.fullfill();
          a.print();
        System.out.println();

     a.addMatrix(5,5);
     a.print();
        System.out.println();
     a.mnogitel(4);
        a.print();
    }
}
