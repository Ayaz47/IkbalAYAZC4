package day_19_30_12;

import java.util.Scanner;

public class C8Methods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");


        System.out.println("Enter you chooses");



    boolean flat = false;
    int choose = 0;
        System.out.println("press 1 to add ");
        System.out.println("press 2 to subtract");
    while(!flat){
        choose = scan.nextInt();
        switch (choose){

            case 1:
                System.out.println(add(scan.nextInt(),scan.nextInt())); break;
            case 2: System.out.println(subtract(scan.nextDouble(), scan.nextDouble())); break;
            case 3:
                flat = true; break;


        }
    }


    }

    static int add(int a, int b){
        return a+b ;
    }

    static double subtract(double a, double b){
        return a-b;
    }

}
