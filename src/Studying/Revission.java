package Studying;

import java.util.Arrays;
import java.util.Scanner;

public class Revission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter each element of Array ");

        for(int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array is = ");
        System.out.println(Arrays.toString(arr));

        System.out.println("using for each ");
        for( int element : arr )
            System.out.println(element);
    }
}
