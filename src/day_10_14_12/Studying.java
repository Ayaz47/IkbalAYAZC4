package day_10_14_12;

import java.util.Scanner;

public class Studying {
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
         int num =  sc . nextInt();
         System.out.println("user entered" + num );
         System.out.println( "prog terminated"); */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter age ");
        int number = scan.nextInt();
        if (number>18) System.out.println("alloved to vote");
        else System.out.println(" not allowed to vote");
    }
}
