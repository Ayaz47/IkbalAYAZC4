package day_11_16_12;

import java.util.Scanner;

public class C1Revision {
    //enter a number from the user and print he numbers from 0 to that entered number
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();

        for(int i=0; i<=num; i++)
            System.out.println(i);
    }
}
