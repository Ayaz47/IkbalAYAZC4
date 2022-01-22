package day_17_28_12;

import java.util.Scanner;

public class C5ArrayDemo {
    public static void main(String[] args) {
        /*
        WAP to enter the dimensions(no. of rows and columns) of a 2-D array
         and then enter the  elements and print them. Also, print the
         sum and average of the elements
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows of the array");
        int r = sc.nextInt();
        System.out.println("enter the number of colons of the array");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the all elements of the array");
        for(int i =0; i< arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0; double avarage = 0;
        for(int i =0; i< arr.length; i++){
            for(int j =0; j<arr[i].length; j++){

                sum = sum + arr[i][j];

            }
        }System.out.println("sum of number =" + sum +"\n" + "avarage of number = " + sum/ (c*r));
    }

}
