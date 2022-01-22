package day_18_29_12;

import java.util.Scanner;

public class Practice {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
System.out.println("enter number of rows and columns");
    int arr [][] = new int [sc.nextInt()][sc.nextInt()];
     System.out.println("enter each element of array");
     for (int i = 0; i< arr.length;i++){
        for(int j = 0; j<arr[i].length; j++){
            arr[i][j]=sc.nextInt();
        }
    }



     System.out.println("entered Numbers : ");
     for (int i=0; i < arr.length; i++){
        for (int j = 0; j<arr[i].length; j++){
            System.out.print(arr[i][j] +"   ");
        } System.out.println();
    }
        int smallest = arr[0][0];
        int largest = arr[0][0];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if (arr[i][j]<smallest) smallest=arr[i][j];
                if (arr[i][j]>largest) largest= arr[i][j];
            }

        }System.out.println(smallest +" is smallest number");
        System.out.println(largest +" is largest number");
}
}
