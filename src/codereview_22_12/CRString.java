package codereview_22_12;

import java.util.Scanner;

public class CRString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write in a String : ");
        String name = scn.next();
        System.out.println("Which letter do you want to find? ");
        char letter = scn.next().charAt(0);
        for (int i = 0; i < name.length(); i++) {
            if(letter == name.charAt(i)){
                System.out.println(" The word has e and it's index : " + (i));
            }

        }
        }
}
