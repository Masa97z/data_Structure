package quiz;

import java.util.Scanner;

public class sequential_serch {
    public static void main(String[] args) {
        int c = 0 ;
        int [] a = {10,20,30,40,50};
        Scanner s1 = new Scanner(System.in);
        int key = s1.nextInt();
        for (int i=0 ; i<a.length; i++){
            if (key == a[i]){
                c=1;
                break;

        }
    }
        if (c == 1) {
            System.out.println("Found");
        }
    else {
        System.out.println("Not Found");
    }


}}

