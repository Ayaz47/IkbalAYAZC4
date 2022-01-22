package day_18_29_12;

import java.util.Scanner;

public class StudyHallArray2dDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter row");
        int r=scn.nextInt();
        System.out.println("Enter column");
        int c=scn.nextInt();
        int [][] array = new int[r][c];


        System.out.println("Please enter number..");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                array[i][j]=scn.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
                sum+=array[i][j];
            }

            System.out.println();
        }
        System.out.println("Sumrow is: " + sum);
        System.out.println("The average is " + (double) sum/(r*c));

    }

}
