package seaching;

import java.util.Scanner;


public class leanir {
    public static void main(String[] args) {
        System.out.println("Array before search");
        int[] array = {2, 5, 7, 3, 23, 66, 13, 55};
        for (int i =0; i <array.length; i++) {
            System.out.print(array[i]+ "\t");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("\ninput the number to Search");
        int serch = input.nextInt();
        System.out.println("index  -> "+lin(array,serch));


    }
   static int lin(int arr[] ,int s) {
       int temp = 0;
       for (int i = 0; i < arr.length; i++) {
           if (s == arr[i]) {
               temp = i;
               break;
           }
           if(s != arr[i]){
               temp = -1;
           }
       }
           return temp;
       }

   }
