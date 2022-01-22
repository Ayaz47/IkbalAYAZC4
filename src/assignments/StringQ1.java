package assignments;

import java.util.Scanner;

public class StringQ1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a String ");
        String str = sc.nextLine();
        for(int i =0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
System.out.println(str.length());
    }
}
