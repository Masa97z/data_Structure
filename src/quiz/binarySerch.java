package quiz;

import java.util.Scanner;

public class binarySerch {
    public static void BS(int a[], int k, int i, int r){
        int c =0 ;
        int mid = (i+r)/2;
        while (i<=r){
            if(k == a[mid]){
                c = 1;
                break;
            } else if (k<a[mid]) {
                r = mid-1;
                mid = (i+r)/2;
            }else {
                i = mid+1;
                mid = (i+r)/2;
            }
        }
        if (c==1){
            System.out.println("Found");
        }else
            System.out.println("NotFound");
    }

    public static void main(String[] args) {
        int k =0; int c =0 ;
        int [] a = {10,20,30,40,50};
        Scanner s = new Scanner(System.in);
        k= s.nextInt();
        int i =0 ;
        int r = a.length;
        BS(a, k,i,r);
    }
}
