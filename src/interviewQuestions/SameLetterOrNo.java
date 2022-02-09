package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SameLetterOrNo {
    //  Write a return method that check if a string is build out of the same letters as another string.
//    Ex:  same("abc",  "cab"); -> true
//    same("abc",  "abb"); -> false:


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String s1 = sc.nextLine();
        System.out.println("Enter second String");
        String s2 = sc.nextLine();

        char[]first = s1.toCharArray();
        char[] second= s2.toCharArray();
             Arrays.sort(first);
             Arrays.sort(second);
             System.out.println(first);
             System.out.println(second);

}
}
