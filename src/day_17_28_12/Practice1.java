package day_17_28_12;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of square");
        int s = sc.nextInt();
        int s1 = sc.nextInt();
        int arr[][] = new int[s][s1];
        System.out.println("enter the some number of square");
        for( int i=0; i< arr.length; i++){
            for (int j =0; j<arr[i].length; j++);
            arr[i][s1] = sc.nextInt();
        }
        System.out.println("entered numbers : ");
        for (int i =0; i< arr.length; i++){
            for (int j =0; j<arr[i].length; j++);
            {
                System.out.print(arr[s][s1]);
            }

        }System.out.println();
        System.out.println();

    }
}
