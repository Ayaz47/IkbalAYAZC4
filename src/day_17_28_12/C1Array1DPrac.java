package day_17_28_12;

import java.util.Scanner;

public class C1Array1DPrac {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter array length");
        int size= s.nextInt();

        int arr[] = new int [size];

        System.out.println("enter the numbers for array");
        int i= 0;
        for (i=0; i<arr.length; i++){
            arr [i]= s.nextInt();
        }
        int min = arr [0];
        for (i=0; i<arr.length; i++){
            if (arr [i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);

      /*
      Find largest and smallest elements of an array,
      where size and values of array are inputted by user.*/
    }
}
