package seaching;

public class binry {
    public static void main(String[] args) {
        System.out.println("Array before search");
        int[] array = {2, 5, 7, 3, 23, 66, 13, 55};
        for (int i =0; i <array.length; i++) {
            System.out.print(array[i]+ "\t");
        }
        System.out.println("\n Index is ->  "+Binry(array,66));


    }
    static int Binry(int[] arr , int key){
        sort(arr);
        int left = 0, right = arr.length-1;
        int mid =0;
        while (left<=right){
           mid = (left+right)/2;
           if (key == arr[mid])return mid;
           else if (key<arr[mid]) {
               right = mid-1;
           }else if (key>arr[mid]) {
               left = mid+1;
           }

        }
        return -1;
    }
    static int[] sort(int[] number) {
        int min;
        for (int i = 0; i <= number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    min = number[i];
                    number[i] = number[j];
                    number[j] = min;

                }
            }
        }
        System.out.println("\nArray after sorting");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " \t ");
        }
        return number;
    }
}
