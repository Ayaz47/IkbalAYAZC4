package day_11_16_12;

import java.util.Scanner;

public class c2ScannerDemo {
    public static void main(String[] args) {
    Scanner car = new Scanner(System.in);
    System.out.println("enter a number");
    int b = car.nextInt(); System.out.println(b);

    System.out.println("Enter a Byte number");
    byte x = car.nextByte();
    System.out.println("entered byte number is " + x);
    System.out.println("enter a short number");
    short a = car.nextShort();
    System.out.println("Entered short number is " + a);

    System.out.println("Enter a long number");
    long l = car.nextLong();
    System.out.println("entered long number is " + l);

    System.out.println(" enter float and double number");
    float f = car.nextFloat();
    double d = car.nextDouble();
    System.out.println(f +"\n" + d);

    }
}
