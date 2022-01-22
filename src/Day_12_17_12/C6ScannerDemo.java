package Day_12_17_12;

import java.util.Scanner;

public class C6ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
    WAP to check if the entered number is positive, negative or zero (HINT: Use Scanner)
    Ask the user if he wants to continue or stop(HINT: Use do-while or  a while loop)
    SAMPLE OUTPUT:
    -------------
    Enter a number: 5
    number is positive
    Do you want to continue? y/n
    y
    Enter a number: -9
    number is negative
    Do you want to continue? y/n
    y
    Enter a number: 0
    number is zero
    Do you want to continue? y/n
    n
    Thanks for using!!!:)
     */
        char ch = 'y'; ch = 'Y';
        while (ch=='y' || ch=='Y') {
        System.out.println("Enter a number ");
        int number = scan.nextInt();

        if(number<0) System.out.println(number + " is  a negative number");
        else if (number>0) System.out.println(number + " is a positive number");
        else System.out.println(" zero");
        System.out.println("enter Y or y if you want to cotinue");



        ch = scan.next().charAt(0); }

        System.out.println("Stopped");




    }
}
