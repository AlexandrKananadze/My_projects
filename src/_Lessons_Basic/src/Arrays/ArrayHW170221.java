package Arrays;

import java.util.Scanner;

public class ArrayHW170221 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = console.nextInt();
        int[] array = new int[x];
        System.out.println("Рандомно заполненый массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]);
        }
        System.out.println();
        int count = 0;
        int newlength = array.length;
        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {

                if (array[i] == array[j]) {
                    count++;
                }
                else if (count >=2) {
                    newlength = newlength - 1;

                }
                count=0;


            }
        }
        System.out.println(newlength);
        int[] result = new int[newlength];
        count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count < 2) {
                    result[i] = array[i];
                    count = 0;
                }

//System.out.println("Уникальные элементы массива");
            System.out.print(result[i]);
        }
    }
}





