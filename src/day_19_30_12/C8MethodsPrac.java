package day_19_30_12;

import java.util.Scanner;

public class C8MethodsPrac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.println(add(sc.nextInt(),sc.nextInt(), sc.nextInt()));

    }
    static int add(int a, int b, int c){
        return a+b-c;
    }
    static double subtract(double a, double b, double c){
        return a+b+c;
    }
}
