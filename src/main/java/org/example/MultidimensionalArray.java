package org.example;

import java.util.Arrays;
import java.util.Scanner;

class MultidimensionalArray {



    static void setArray(int[][] array){

         Scanner scanner = new Scanner(System.in);
         for (int i = 0; i < array.length; i++) {
              for (int j = 0; j < array.length; j++) {
                   System.out.println("введите значение");
                   array[i][j] = scanner.nextInt();
              }
         }
     }

     public static void main(String[] args) {

          int [][] array = new int[3][3];
          setArray(array);
          System.out.println(Arrays.deepToString(array));

     }
}
