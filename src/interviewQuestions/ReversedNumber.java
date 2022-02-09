package interviewQuestions;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String text =sc.nextLine();
        char[]textToArray = text.toCharArray();
        for(int i =textToArray.length-1; i>=0; i--){
            System.out.print(textToArray[i]);

        }


    }
}
