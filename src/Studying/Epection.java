package Studying;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Epection {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a int number");
            int a = sc.nextInt();
            System.out.println("Enter a second int number");
            int b = sc.nextInt();
            int result = a/b;
            System.out.println(result);

        }
        catch (ArithmeticException e) {
            System.out.println("any number cant divided by 0");
        }
        catch (InputMismatchException e){
            System.out.println("any number cant divided by letter");
        }
        catch(Exception e ){
            System.out.println("HELLO");
        }
        finally {
            System.out.println("Its final expections");
        }

    }
}
