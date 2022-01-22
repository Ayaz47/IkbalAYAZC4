package assignments;

import java.util.Scanner;

public class Z1 {

    public static void num(int x , int y){
        int sum=x+y;
        System.out.println(sum);
    }
    public static int number(int y ,int x){
        System.out.println(x*y);
        return x*y;
    }
    public static void sayHi(){
        System.out.println("Hi");
    }
    public static String sayHi(String name) {

        return name;
    }

    public static int increment(int x){
        x++;
        System.out.println(x);
        return x;

    }

    public static String myName(){return new Scanner(System.in).nextLine();}

    public static double myAge(){return new Scanner(System.in).nextDouble();}


}
