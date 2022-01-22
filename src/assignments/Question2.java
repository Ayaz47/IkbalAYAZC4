package assignments;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Georgian note");
        double Georgian= sc.nextDouble();
        System.out.println("Enter your Math note");
        double Math = sc.nextDouble();
        System.out.println("Enter your Science note");
        double Science = sc.nextDouble();
        System.out.println("Enter your English note");
        double English = sc.nextDouble();
        System.out.println("Enter your Computer note");
        double Computer = sc.nextDouble();

        double sum= (Georgian+Math+Science+English+Computer)/500*100;
        if (sum>=0 && sum<40) System.out.println(sum +"FAIL");
        else if(sum>=40 && sum<50) System.out.println(sum +"THIRD");
        else if(sum>=50 && sum<60) System.out.println(sum +"SECOND");
        else if(sum>=60 && sum<75) System.out.println(sum +"FIRST");
        else if(sum>=75 && sum<=100) System.out.println(sum +"FIRST WITH DISTINCTION");


    }
}
