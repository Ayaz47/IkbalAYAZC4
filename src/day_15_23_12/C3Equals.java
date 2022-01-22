package day_15_23_12;

import java.util.Scanner;

public class C3Equals {
    public static void main(String[] args) {
   /*     String s = "slav";
        System.out.println(s.equals("SLAV"));
        System.out.println(s.equals("Slav"));
        System.out.println(s.equalsIgnoreCase("SlaV"));
        /*WAP to validate username and password
        * username : proCoder
        * password : juT7%$ */

       /* String username = "proCoder";
        String password = "juT7%$";*/

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter user name :");
        String username= scan.next();
        System.out.println("Enter Password");
        String password = scan.next();
        if (username.equalsIgnoreCase(username) && password.equals(password)) {

        }else System.out.println("Login unsuccesfull");
    }
}
