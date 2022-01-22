package day_14_21_12;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int digit=0, uppercase=0, lovercase=0, space=0, specialc= 0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a String ");
         String str= scan.nextLine();

         for(int i=0; i<str.length(); i++){
             char ch= str.charAt(i);
            if (ch<58 && ch>47) digit++;
            else if (ch>64 && ch<91) uppercase++;
            else if (ch>96 && ch<123) lovercase++;
            else if (ch==32) space++;
            else specialc++;

        } System.out.println("number of digit = " +digit);
         System.out.println("number of uppercase =" + uppercase );
         System.out.println("number of lovercase = " +lovercase);
         System.out.println("number of space = " + space);
         System.out.println("number of special Character = " +specialc);

    }
}
