package day_14_21_12;

import java.util.Scanner;

public class C1Revision {
    public static void main(String[] args) {
        //Scanner : a referenced data type as its a class
        //scan: an object reference variable or reference or reference variable
        //Using the object reference of the scanner class
        //in built methods of Scanner class can be called
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");
       /* if (scan.hasNextInt()){
            int value = scan.nextInt();
            System.out.println("Valid int entered:  " + value);
        }
        else System.out.println("no. entered is not valid int");*/


        //below loop makes sue that a valid number is entered by user
    while (!scan.hasNextInt()) {
        System.out.println("please enter a valid int number");
        scan.nextLine();
    }
    //after making sure that the valid int number is entered that
        // number is scanned by the nextInt method
        int value = scan.nextInt();
        System.out.println("Entered int value is " + value );

    }
}
