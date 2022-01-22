package Studying;

import java.util.Scanner;

public class sara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of arrays");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr[i].length; j++)
            System.out.print(arr[i][j] + "  ");
        }
    }
}
