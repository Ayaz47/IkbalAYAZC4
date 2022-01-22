package day_16_27_12;

import java.util.Scanner;

public class C6ArrayDemo {
    public static void main(String[] args) {
        /*
        WAP to enter the size of a double array.
       Then input the values of the array and
       find the sum and average of all the values.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        double numbers[] = new double[size];
        System.out.println("Enter values of each array");
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextDouble();
        }
        double sum =0; double average = 0;
        for (int i = 0; i< numbers.length; i++){
            sum = sum + numbers[i];
            System.out.println("entered number = " + numbers[i] );
        }
        System.out.println("\naverage of all number entered = "  +sum/size);


    }
}
