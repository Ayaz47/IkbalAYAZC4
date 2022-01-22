package assignments;

import java.util.Scanner;

public class QLovesh {
    //WAP to enter a sentence and print the reverse of it.
    //eg.
    //Java is fun
    public static Scanner ka=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter The sentence to reverse it ");
        String str= ka.nextLine();
        System.out.println("Reverse sentence is ");
        String ss=reverse(str);
        System.out.println(ss);


        //index from 0 to length-1

    }
    public static String reverse(String sentence){
        String[] words=sentence.split(" ");
        String reverseString=" ";
        for (int i= words.length-1; i>=0 ;i--)
        reverseString+=words[i] + " ";
       return reverseString;
    }


}
