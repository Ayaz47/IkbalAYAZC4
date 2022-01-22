package assignments;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter km");
        double km = sc.nextDouble();
        double m = km*1000, cm= km*100000, ft= 3280*km, inch= km*39370;
        System.out.println(m + "metre");
        System.out.println(ft + "feet" );
        System.out.println(inch + "inch");
        System.out.println(cm + "centimetre");

        /////////question4//////////////
        System.out.println("====================================================");
        System.out.println("Enter a 4 digit number");
        int number= sc.nextInt(), first= number%10, second = (number/10)%10,
                third=(number/100)%10, fourth=(number/1000)%10;

        System.out.println("reversed number is "+(first*1000 + second*100 + third* 10 +fourth*1));



    }
}
