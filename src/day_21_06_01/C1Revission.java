package day_21_06_01;

import java.util.Arrays;
import java.util.Scanner;

public class C1Revission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the Array");
        int arr[] = new int[scan.nextInt()];
        System.out.println("Enter the elements of array");
        for (int i = 0; i< arr.length; i++){
            arr[i]= scan.nextInt();
        }
        System.out.println("entered Array is : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("using for each loop");
        for( int element : arr) System.out.print(element + "  ");
    }


}
