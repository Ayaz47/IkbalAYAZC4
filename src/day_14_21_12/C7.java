package day_14_21_12;

import java.util.Scanner;

public class C7 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a String");
        String s = scan.nextLine();

        System.out.println("Enter the Character to find index for:");
        char ch= scan.next().charAt(0);
      if (s.indexOf(ch) == 1)
          System.out.println("Character" );
        System.out.println("index of " +ch + "is" + s.indexOf(ch));
    }
}
