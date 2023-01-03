package quiz;

public class marge_sort {
    public static void main(String[] args) {
        int[] b = {0,2,4,6,8};
        int[] c = {1,3,5,7,9,10,11,12};
        int p = b.length;
        int q= c.length;
        int[]A = new int[p+q];
        int k =0 , i=0 , j=0;
        while(i<p&& j<q){
            if (b[i]<c[j]){
                A[k]=b[i];
                i+=1;
                k+=1;
            }
            else {
                A[k] = c[j];
                j+=1;
                k+=1;
            }
        }
        while(i<p){
            A[k]=b[i];
            i+=1;
            k+=1;
        }
        while (j<q){
            A[k]=c[j];
            j+=1;
            k+=1;
        }

        for (int m = 0; m<A.length; m++){
            System.out.print(A[m]+" ");
        }

    }
}
