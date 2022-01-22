package day_14_21_12;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
       byte x = 0;
        System.out.println("Enter a string");
       String str = scan.nextLine();
       for(byte b=0; b<str.length(); b++){
           if(str.charAt(b)>48 && str.charAt(b)<57)
               x++;

       } System.out.println(x);

         }
}
