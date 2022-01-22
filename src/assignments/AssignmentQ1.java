package assignments;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class AssignmentQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1 if you want to calculate area of rectangle");
        System.out.println("enter 2 if you want to calculate area of square");
        System.out.println("enter 3 if you want to calculate area of circle");
        byte option = sc.nextByte();
        switch (option) {
            case 1: System.out.println("enter a breadth");
            double breadth= sc.nextDouble();
            System.out.println("Enter a length");
            double length= sc.nextDouble();
            System.out.println( "area of rectangle = "+ (breadth*length));
            case 2: System.out.println("Enter one side of square");
            double side = sc.nextDouble();
            System.out.println("area of square = " + (side*side));
            case 3: System.out.println("Enter a radius of square");
            double radius = sc.nextDouble();
            System.out.println("area of circle" + (3.14*radius));
            default: System.out.println("please enter a valid number");

        }


    }

}
